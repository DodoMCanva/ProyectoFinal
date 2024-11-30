package IDAO;

import Exceptions.ExceptionDAO;
import POJO.ArtistaPOJO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Equipo 2
 */
public interface IArtistaDAO {

    void insertarArtistas(ArtistaPOJO artistaPOJO) throws ExceptionDAO;

    String obtenerIdPorNombre(String nombreArtista);
    
    public ArtistaPOJO consulta(ObjectId id) throws ExceptionDAO;

    public List<ArtistaPOJO> consultaGeneralArtista(List<String> generosRestringidos) throws ExceptionDAO;

    public List<ArtistaPOJO> busquedaGeneralArtista(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO;
}
