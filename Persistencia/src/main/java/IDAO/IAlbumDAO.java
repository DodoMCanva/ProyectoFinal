package IDAO;

import Exceptions.ExceptionDAO;
import POJO.AlbumPOJO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Interfaz que define las operaciones del DAO para álbumes.
 *
 * @author equipo 2
 */
public interface IAlbumDAO {

    /**
     * Inserta un álbum en la base de datos.
     *
     * @param album el álbum a insertar
     * @throws ExceptionDAO si ocurre un error durante la inserción
     */
    void InsertarAlbum(AlbumPOJO album) throws ExceptionDAO;

    /**
     * Obtiene el ID de un álbum basado en su nombre.
     *
     * @param nombreAlbum el nombre del álbum
     * @return el ID del álbum como cadena de texto
     */
    public String obtenerIdPorNombre(String nombreAlbum);

    /**
     * Consulta un álbum en la base de datos basado en su ID.
     *
     * @param id el ID del álbum
     * @return el álbum correspondiente al ID
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public AlbumPOJO consulta(ObjectId id) throws ExceptionDAO;

    /**
     * Consulta general de álbumes en la base de datos excluyendo ciertos
     * géneros restringidos.
     *
     * @param generosRestringidos la lista de géneros restringidos
     * @return la lista de álbumes que no pertenecen a los géneros restringidos
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public List<AlbumPOJO> consultaGeneralAlbums(List<String> generosRestringidos) throws ExceptionDAO;

    /**
     * Búsqueda general de álbumes en la base de datos basándose en una búsqueda
     * textual y excluyendo ciertos géneros restringidos.
     *
     * @param generosRestringidos la lista de géneros restringidos
     * @param Busqueda el texto de búsqueda
     * @return la lista de álbumes que coinciden con la búsqueda y no pertenecen
     * a los géneros restringidos
     * @throws ExceptionDAO si ocurre un error durante la búsqueda
     */
    public List<AlbumPOJO> busquedaGeneralAlbum(List<String> generosRestringidos, String Busqueda) throws ExceptionDAO;
}
