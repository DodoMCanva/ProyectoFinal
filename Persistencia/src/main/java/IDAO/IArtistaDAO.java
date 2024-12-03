package IDAO;

import Exceptions.ExceptionDAO;
import POJO.ArtistaPOJO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Interfaz que define las operaciones del DAO para artistas
 * musicales.
 *
 * @author Equipo 2
 */
public interface IArtistaDAO {

    /**
     * Inserta un artista en la base de datos.
     *
     * @param artistaPOJO el artista a insertar
     * @throws ExceptionDAO si ocurre un error durante la inserción
     */
    void insertarArtistas(ArtistaPOJO artistaPOJO) throws ExceptionDAO;

    /**
     * Obtiene el ID de un artista basado en su nombre.
     *
     * @param nombreArtista el nombre del artista
     * @return el ID del artista como cadena de texto
     */
    String obtenerIdPorNombre(String nombreArtista);

    /**
     * Consulta un artista en la base de datos basado en su ID.
     *
     * @param id el ID del artista
     * @return el artista correspondiente al ID
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public ArtistaPOJO consulta(ObjectId id) throws ExceptionDAO;

    /**
     * Consulta general de artistas en la base de datos excluyendo ciertos
     * géneros restringidos.
     *
     * @param generosRestringidos la lista de géneros restringidos
     * @return la lista de artistas que no pertenecen a los géneros restringidos
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public List<ArtistaPOJO> consultaGeneralArtista(List<String> generosRestringidos) throws ExceptionDAO;

    /**
     * Búsqueda general de artistas en la base de datos basándose en una
     * búsqueda textual y excluyendo ciertos géneros restringidos.
     *
     * @param generosRestringidos la lista de géneros restringidos
     * @param Busqueda el texto de búsqueda
     * @return la lista de artistas que coinciden con la búsqueda y no
     * pertenecen a los géneros restringidos
     * @throws ExceptionDAO si ocurre un error durante la búsqueda
     */
    public List<ArtistaPOJO> busquedaGeneralArtista(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO;
}
