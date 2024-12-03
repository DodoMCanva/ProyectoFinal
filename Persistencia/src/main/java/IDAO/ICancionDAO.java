package IDAO;

import Exceptions.ExceptionDAO;
import POJO.CancionPOJO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Interfaz que define las operaciones del DAO para canciones.
 *
 * @author equipo 2
 */
public interface ICancionDAO {

    /**
     * Inserta una canción en la base de datos.
     *
     * @param cancion la canción a insertar
     * @throws ExceptionDAO si ocurre un error durante la inserción
     */
    void insertarCancion(CancionPOJO cancion) throws ExceptionDAO;

    /**
     * Obtiene el ID de una canción basado en su nombre.
     *
     * @param nombreCancion el nombre de la canción
     * @return el ID de la canción como cadena de texto
     */
    String obtenerIdPorNombre(String nombreCancion);

    /**
     * Consulta una canción en la base de datos basada en su ID.
     *
     * @param id el ID de la canción
     * @return la canción correspondiente al ID
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public CancionPOJO consulta(ObjectId id) throws ExceptionDAO;

    /**
     * Consulta general de canciones en la base de datos excluyendo ciertos
     * géneros restringidos.
     *
     * @param generosRestringidos la lista de géneros restringidos
     * @return la lista de canciones que no pertenecen a los géneros
     * restringidos
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public List<CancionPOJO> consultaGeneralCancion(List<String> generosRestringidos) throws ExceptionDAO;

    /**
     * Búsqueda general de canciones en la base de datos basándose en una
     * búsqueda textual y excluyendo ciertos géneros restringidos.
     *
     * @param generosRestringidos la lista de géneros restringidos
     * @param Busqueda el texto de búsqueda
     * @return la lista de canciones que coinciden con la búsqueda y no
     * pertenecen a los géneros restringidos
     * @throws ExceptionDAO si ocurre un error durante la búsqueda
     */
    public List<CancionPOJO> busquedaGeneralCancion(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO;
}
