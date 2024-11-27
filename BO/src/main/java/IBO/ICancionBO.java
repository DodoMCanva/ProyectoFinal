package IBO;

import DTO.CancionDTO;
import Exceptions.ExceptionBO;

/**
 *
 * @author equipo 2
 */
public interface ICancionBO {
    
    public void insertarCancion(CancionDTO cancion) throws ExceptionBO; 

    public String obtenerIdPorNombre(String nombre) throws ExceptionBO;
}
