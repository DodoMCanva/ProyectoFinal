
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
 *
 * @author equipo 2
 */
public class AlbumBO implements IAlbumBO {

    private IArtistasBO artistaBO;
    private IAlbumDAO albumDAO;

    public AlbumBO() {
        this.albumDAO = new AlbumDAO(); // Inicialización explícita
    }

    @Override
    public void insertarAlbum(AlbumDTO album) {
        try {
            albumDAO.InsertarAlbum(convertirAlbumdeDTOaPOJO(album));
        } catch (ExceptionDAO ex) {
            Logger.getLogger(AlbumBO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String obtenerIdPorNombre(String nombreArtista) {
        return artistaBO.obtenerIdPorNombre(nombreArtista);
    }

    @Override
    public List<AlbumDTO> consultaGeneralAlbums(List<String> generosRestringidos) throws ExceptionBO {
        try {
            List<AlbumPOJO> pojoList = albumDAO.consultaGeneralAlbums(generosRestringidos);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error al consultar álbumes en la capa BO", ex);
        }
    }

    @Override
    public List<AlbumDTO> busquedaGeneralAlbum(List<String> generosRestringidos, String busqueda) throws ExceptionBO {
        try {
            List<AlbumPOJO> pojoList = albumDAO.busquedaGeneralAlbum(generosRestringidos, busqueda);
            return convertirListaDePOJOaDTO(pojoList);
        } catch (ExceptionDAO ex) {
            throw new ExceptionBO("Error en la búsqueda de álbumes en la capa BO", ex);
        }
    }

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

    private AlbumDTO convertirAlbumdePOJOaDTO(AlbumPOJO pojo) {
        List<String> cancionesString = new ArrayList<>();
        for (ObjectId cancionId : pojo.getCanciones()) {
            cancionesString.add(cancionId.toHexString());
        }
        return new AlbumDTO(
                pojo.getNombre(),
                pojo.getFechaLanzamiento(),
                pojo.getGenero(),
                pojo.getPortada(),
                pojo.getArtistaId().toHexString(),
                cancionesString);
    }

    private List<AlbumDTO> convertirListaDePOJOaDTO(List<AlbumPOJO> pojoList) {
        List<AlbumDTO> dtoList = new ArrayList<>();
        for (AlbumPOJO pojo : pojoList) {
            dtoList.add(convertirAlbumdePOJOaDTO(pojo));
        }
        return dtoList;
    }

    @Override
    public AlbumDTO consulta(List<String> generosRestringidos, String id) throws ExceptionBO {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
