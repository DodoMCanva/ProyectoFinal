package IDAO;

import Exceptions.ExceptionDAO;
import POJO.AlbumPOJO;
import java.util.List;

/**
 *
 * @author equipo 2
 */
public interface IAlbumDAO {
    
    
    void InsertarAlbum(AlbumPOJO album) throws ExceptionDAO;
    
    public List<AlbumPOJO> consultaGeneralAlbums(List<String> generosRestringidos) throws ExceptionDAO;
    
    public List<AlbumPOJO> busquedaGeneralAlbum(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO;
}
