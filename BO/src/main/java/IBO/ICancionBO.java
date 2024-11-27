package IBO;

import DTO.CancionDTO;
import Exceptions.ExceptionBO;

/**
 *
 * @author equipo 2
 */
public interface ICancionBO {
    
     void insertarCancion(CancionDTO cancion) throws ExceptionBO; 
}
