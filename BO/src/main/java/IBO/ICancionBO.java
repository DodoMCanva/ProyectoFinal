package IBO;

import DTO.CancionDTO;
import Exceptions.ExceptionBO;
import java.util.List;

/**
 *
 * @author equipo 2
 */
public interface ICancionBO {

    public void insertarCancion(CancionDTO cancion) throws ExceptionBO;

    public String obtenerIdPorNombre(String nombre) throws ExceptionBO;

    List<CancionDTO> consultaGeneralCancion(List<String> generosRestringidos) throws ExceptionBO;

    List<CancionDTO> busquedaGeneralCancion(List<String> generosRestringidos, String busqueda) throws ExceptionBO;
}
