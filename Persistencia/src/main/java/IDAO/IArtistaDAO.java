
package IDAO;

import Exceptions.ExceptionDAO;
import POJO.ArtistaPOJO;

/**
 *
 * @author Equipo 2
 */
public interface IArtistaDAO {

    void insertarArtistas(ArtistaPOJO artistaPOJO) throws ExceptionDAO;
    
    String obtenerIdPorNombre(String nombreArtista);
}
