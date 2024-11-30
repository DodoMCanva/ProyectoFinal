package IDAO;

import Exceptions.ExceptionDAO;
import POJO.AlbumPOJO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author equipo 2
 */
public interface IAlbumDAO {

    void InsertarAlbum(AlbumPOJO album) throws ExceptionDAO;
    
    public String obtenerIdPorNombre(String nombreAlbum);
    
    public AlbumPOJO consulta(ObjectId id) throws ExceptionDAO;

    public List<AlbumPOJO> consultaGeneralAlbums(List<String> generosRestringidos) throws ExceptionDAO;

    public List<AlbumPOJO> busquedaGeneralAlbum(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO;
}
