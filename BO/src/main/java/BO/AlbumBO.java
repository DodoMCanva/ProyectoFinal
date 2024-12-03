package BO;

import DAO.AlbumDAO;
import DTO.AlbumDTO;
import Exceptions.ExceptionBO;
import Exceptions.ExceptionDAO;
import IBO.IAlbumBO;
import IBO.IArtistasBO;
import IDAO.IAlbumDAO;
import POJO.AlbumPOJO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;

/**
 * Clase que maneja la lógica de negocio para los álbumes.
 * Implementa la interfaz IAlbumBO.
 * 
 * @autor Equipo2
 */
public class AlbumBO implements IAlbumBO {

    private IArtistasBO artistaBO; // Interface para manejar operaciones de Artistas
    private IAlbumDAO albumDAO; // Interface para manejar operaciones de Álbumes

    /**
     * Constructor por defecto que inicializa el DAO de álbumes.
     */
    public AlbumBO() {
        this.albumDAO = new AlbumDAO(); // Inicialización explícita
    }

    /**
     * Inserta un nuevo álbum.
     * 
     * @param album El álbum a insertar
     */
    @Override
    public void insertarAlbum(AlbumDTO album) {
        try {
            albumDAO.InsertarAlbum(convertirAlbumdeDTOaPOJO(album));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(AlbumBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Obtiene el ID de un artista por su nombre.
     * 
     * @param nombreArtista El nombre del artista
     * @return El ID del artista
     */
    @Override
    public String obtenerIdPorNombre(String nombreArtista) {
        return artistaBO.obtenerIdPorNombre(nombreArtista);
    }

    /**
     * Consulta general de álbumes restringida por géneros.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @return Lista de álbumes que no están en los géneros restringidos
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public List<AlbumDTO> consultaGeneralAlbums(List<String> generosRestringidos) throws ExceptionBO {
        try {
            List<AlbumPOJO> pojoList = albumDAO.consultaGeneralAlbums(generosRestringidos);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error al consultar álbumes en la capa BO", ex);
        }
    }

    /**
     * Búsqueda general de álbumes con criterios de género y búsqueda.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @param busqueda Texto de búsqueda
     * @return Lista de álbumes que coinciden con los criterios
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public List<AlbumDTO> busquedaGeneralAlbum(List<String> generosRestringidos, String busqueda) throws ExceptionBO {
        try {
            List<AlbumPOJO> pojoList = albumDAO.busquedaGeneralAlbum(generosRestringidos, busqueda);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error en la búsqueda de álbumes en la capa BO", ex);
        }
    }

    /**
     * Convierte un álbum de DTO a POJO.
     * 
     * @param dto El DTO del álbum
     * @return El POJO del álbum
     */
    public AlbumPOJO convertirAlbumdeDTOaPOJO(AlbumDTO dto) {
        AlbumPOJO POJO;
        List<ObjectId> cancionesObjectId = new ArrayList<>();
        for (String cancionId : dto.getCanciones()) {
            cancionesObjectId.add(new ObjectId(cancionId));
        }

        POJO = new AlbumPOJO(
                dto.getNombre(),
                dto.getFechaLanzamiento(),
                dto.getGenero(),
                dto.getPortada(),
                new ObjectId(dto.getArtista()),
                cancionesObjectId
        );

        return POJO;
    }

    /**
     * Convierte un álbum de POJO a DTO.
     * 
     * @param pojo El POJO del álbum
     * @return El DTO del álbum
     */
    private AlbumDTO convertirAlbumdePOJOaDTO(AlbumPOJO pojo) {
        List<String> cancionesString = new ArrayList<>();
        for (ObjectId cancionId : pojo.getCanciones()) {
            cancionesString.add(cancionId.toHexString());
        }
        return new AlbumDTO(
                pojo.getId().toHexString(),
                pojo.getNombre(),
                pojo.getFechaLanzamiento(),
                pojo.getGenero(),
                pojo.getPortada(),
                pojo.getArtistaId().toHexString(),
                cancionesString);
    }

    /**
     * Convierte una lista de álbumes de POJO a DTO.
     * 
     * @param pojoList La lista de POJOs del álbum
     * @return La lista de DTOs del álbum
     */
    private List<AlbumDTO> convertirListaDePOJOaDTO(List<AlbumPOJO> pojoList) {
        List<AlbumDTO> dtoList = new ArrayList<>();
        for (AlbumPOJO pojo : pojoList) {
            dtoList.add(convertirAlbumdePOJOaDTO(pojo));
        }
        return dtoList;
    }

    /**
     * Consulta un álbum por su ID.
     * 
     * @param id El ID del álbum
     * @return El DTO del álbum
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public AlbumDTO consulta(String id) throws ExceptionBO {
        try {
            ObjectId objectId;
            try {
                objectId = new ObjectId(id);
            } catch (IllegalArgumentException e) {
                throw new ExceptionBO("El ID del usuario no es válido: " + id, e);
            }
            AlbumPOJO usuarioPOJO = albumDAO.consulta(objectId);
            if (usuarioPOJO != null) {
                return convertirAlbumdePOJOaDTO(usuarioPOJO);
            }
            return null;
        } catch (ExceptionDAO e) {
            throw new ExceptionBO("Error al buscar el usuario en la capa BO", e);
        }
    }
}
