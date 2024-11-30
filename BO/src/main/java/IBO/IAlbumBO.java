package IBO;

import DTO.AlbumDTO;
import Exceptions.ExceptionBO;
import java.util.List;

/**
 *
 * @author equipo 2
 */
public interface IAlbumBO {

    public void insertarAlbum(AlbumDTO album);

    String obtenerIdPorNombre(String nombreArtista);
    
    public AlbumDTO consulta(List<String> generosRestringidos, String id) throws ExceptionBO;

    List<AlbumDTO> consultaGeneralAlbums(List<String> generosRestringidos) throws ExceptionBO;

    List<AlbumDTO> busquedaGeneralAlbum(List<String> generosRestringidos, String busqueda) throws ExceptionBO;

}
