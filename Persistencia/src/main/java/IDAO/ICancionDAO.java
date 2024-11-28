package IDAO;

import Exceptions.ExceptionDAO;
import POJO.CancionPOJO;
import java.util.List;

/**
 *
 * @author equipo 2
 */
public interface ICancionDAO {

    void insertarCancion(CancionPOJO cancion) throws ExceptionDAO;

    String obtenerIdPorNombre(String nombreCancion);

    public List<CancionPOJO> consultaGeneralCancion(List<String> generosRestringidos) throws ExceptionDAO;

    public List<CancionPOJO> busquedaGeneralCancion(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO;
}
