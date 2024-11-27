
package IDAO;

import Exceptions.ExceptionDAO;
import POJO.CancionPOJO;

/**
 *
 * @author equipo 2
 */
public interface ICancionDAO {
    
    void insertarCancion(CancionPOJO cancion) throws ExceptionDAO; 
}
