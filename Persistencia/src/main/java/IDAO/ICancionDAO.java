package IDAO;

import Exceptions.ExceptionDAO;
import POJO.CancionPOJO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author equipo 2
 */
public interface ICancionDAO {

    void insertarCancion(CancionPOJO cancion) throws ExceptionDAO;

    String obtenerIdPorNombre(String nombreCancion);
    
    public CancionPOJO consulta(ObjectId id) throws ExceptionDAO;

    public List<CancionPOJO> consultaGeneralCancion(List<String> generosRestringidos) throws ExceptionDAO;

    public List<CancionPOJO> busquedaGeneralCancion(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO;
}
