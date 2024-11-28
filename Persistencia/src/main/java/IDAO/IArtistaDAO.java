package IDAO;

import Exceptions.ExceptionDAO;
import POJO.ArtistaPOJO;
import java.util.List;

/**
 *
 * @author Equipo 2
 */
public interface IArtistaDAO {

    void insertarArtistas(ArtistaPOJO artistaPOJO) throws ExceptionDAO;

    String obtenerIdPorNombre(String nombreArtista);

    public List<ArtistaPOJO> consultaGeneralArtista(List<String> generosRestringidos) throws ExceptionDAO;

    public List<ArtistaPOJO> busquedaGeneralArtista(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO;
}
