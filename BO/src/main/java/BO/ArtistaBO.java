package BO;

import DAO.ArtistaDAO;
import DTO.ArtistasDTO;
import DTO.IntegranteDTO;
import Exceptions.ExceptionBO;
import Exceptions.ExceptionDAO;
import IBO.IArtistasBO;
import IDAO.IArtistaDAO;
import POJO.ArtistaPOJO;
import POJO.IntegrantesPOJO;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.types.ObjectId;

/**
 * Clase que maneja la lógica de negocio para los artistas.
 * Implementa la interfaz IArtistasBO.
 * 
 * @author equipo 2
 */
public class ArtistaBO implements IArtistasBO {

    private final IArtistaDAO artistasDAO = new ArtistaDAO();

    /**
     * Constructor por defecto.
     */
    public ArtistaBO() {

    }

    /**
     * Inserta un nuevo artista.
     * 
     * @param artista El artista a insertar
     */
    @Override
    public void insertarArtista(ArtistasDTO artista) {
        try {
            artistasDAO.insertarArtistas(covertirArtistadeDTOaPOJO(artista));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(ArtistaBO.class.getName()).log(Level.SEVERE, null, ex);
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
        return artistasDAO.obtenerIdPorNombre(nombreArtista);
    }

    /**
     * Convierte un artista de DTO a POJO.
     * 
     * @param DTO El DTO del artista
     * @return El POJO del artista
     */
    public ArtistaPOJO covertirArtistadeDTOaPOJO(ArtistasDTO DTO) {
        ArtistaPOJO POJO;
        if (DTO.getIntegrantes() != null) {
            POJO = new ArtistaPOJO(
                    DTO.getNombre(),
                    DTO.getImagen(),
                    DTO.getTipo(),
                    DTO.getGenero(),
                    convertirIntegrantesDTOaPOJO(DTO));
        } else {
            POJO = new ArtistaPOJO(
                    DTO.getNombre(),
                    DTO.getImagen(),
                    DTO.getTipo(),
                    DTO.getGenero(),
                    null);
        }

        return POJO;
    }

    /**
     * Realiza una consulta general de artistas restringida por géneros.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @return Lista de artistas que no están en los géneros restringidos
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public List<ArtistasDTO> consultaGeneralArtista(List<String> generosRestringidos) throws ExceptionBO {
        try {
            List<ArtistaPOJO> pojoList = artistasDAO.consultaGeneralArtista(generosRestringidos);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error al consultar los artistas en la capa BO", ex);
        }
    }

    /**
     * Realiza una búsqueda general de artistas con criterios de género y búsqueda.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @param busqueda Texto de búsqueda
     * @return Lista de artistas que coinciden con los criterios
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public List<ArtistasDTO> busquedaGeneralArtista(List<String> generosRestringidos, String busqueda) throws ExceptionBO {
        try {
            List<ArtistaPOJO> pojoList = artistasDAO.busquedaGeneralArtista(generosRestringidos, busqueda);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error en la búsqueda de artistas en la capa BO", ex);
        }
    }

    /**
     * Convierte un artista de POJO a DTO.
     * 
     * @param pojo El POJO del artista
     * @return El DTO del artista
     */
    private ArtistasDTO convertirArtistaPOJOaDTO(ArtistaPOJO pojo) {
        List<IntegranteDTO> integrantesDTO = new ArrayList<>();
        if (pojo.getIntegrantes() != null) {
            for (IntegrantesPOJO integrante : pojo.getIntegrantes()) {
                integrantesDTO.add(new IntegranteDTO(
                        integrante.getNombre(),
                        integrante.getRol(),
                        integrante.getImagen(),
                        integrante.getIngreso(),
                        integrante.getSalida(),
                        integrante.isEstado()
                ));
            }
        }
        return new ArtistasDTO(
                pojo.getId().toHexString(),
                pojo.getNombre(),
                pojo.getImagen(),
                pojo.getTipo(),
                pojo.getGenero(),
                integrantesDTO
        );
    }

    /**
     * Convierte una lista de artistas de POJO a DTO.
     * 
     * @param pojoList La lista de POJOs de los artistas
     * @return La lista de DTOs de los artistas
     */
    private List<ArtistasDTO> convertirListaDePOJOaDTO(List<ArtistaPOJO> pojoList) {
        List<ArtistasDTO> dtoList = new ArrayList<>();
        for (ArtistaPOJO pojo : pojoList) {
            dtoList.add(convertirArtistaPOJOaDTO(pojo));
        }
        return dtoList;
    }

    /**
     * Convierte una lista de integrantes de DTO a POJO.
     * 
     * @param artDTO El DTO del artista
     * @return La lista de POJOs de los integrantes
     */
    public List<IntegrantesPOJO> convertirIntegrantesDTOaPOJO(ArtistasDTO artDTO) {
        List<IntegrantesPOJO> listaPOJO = new ArrayList<>();

        for (IntegranteDTO integranteDTO : artDTO.getIntegrantes()) {
            IntegrantesPOJO integrantePOJO = new IntegrantesPOJO();
            integrantePOJO.setNombre(integranteDTO.getNombre());
            integrantePOJO.setImagen(integranteDTO.getImagen());
            integrantePOJO.setRol(integranteDTO.getRol());
            integrantePOJO.setIngreso(integranteDTO.getIngreso());
            integrantePOJO.setSalida(integranteDTO.getSalida());
            integrantePOJO.setEstado(integranteDTO.isEstado());

            listaPOJO.add(integrantePOJO);
        }
        return listaPOJO;
    }

    /**
     * Consulta un artista por su ID.
     * 
     * @param id El ID del artista
     * @return El DTO del artista
     * @throws ExceptionBO En caso de error en la capa BO
     */
    @Override
    public ArtistasDTO consulta(String id) throws ExceptionBO {
        try {
            ObjectId objectId;
            try {
                objectId = new ObjectId(id);
            } catch (IllegalArgumentException e) {
                throw new ExceptionBO("El ID del usuario no es válido: " + id, e);
            }
            ArtistaPOJO artistaPOJO = artistasDAO.consulta(objectId);
            if (artistaPOJO != null) {
                return convertirArtistaPOJOaDTO(artistaPOJO);
            }
            return null;
        } catch (ExceptionDAO e) {
            throw new ExceptionBO("Error al buscar el usuario en la capa BO", e);
        }
    }
}
