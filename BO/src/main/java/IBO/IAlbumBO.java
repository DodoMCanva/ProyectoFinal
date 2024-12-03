package IBO;

import DTO.AlbumDTO;
import Exceptions.ExceptionBO;
import java.util.List;

/**
 * Interfaz que define los métodos para la lógica de negocio de los álbumes.
 * 
 * @author equipo 2
 */
public interface IAlbumBO {

    /**
     * Inserta un nuevo álbum.
     * 
     * @param album El álbum a insertar
     */
    public void insertarAlbum(AlbumDTO album);

    /**
     * Obtiene el ID de un artista por su nombre.
     * 
     * @param nombreArtista El nombre del artista
     * @return El ID del artista
     */
    String obtenerIdPorNombre(String nombreArtista);
    
    /**
     * Consulta un álbum por su ID.
     * 
     * @param id El ID del álbum
     * @return El DTO del álbum
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public AlbumDTO consulta(String id) throws ExceptionBO;

    /**
     * Realiza una consulta general de álbumes restringida por géneros.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @return Lista de álbumes que no están en los géneros restringidos
     * @throws ExceptionBO En caso de error en la capa BO
     */
    List<AlbumDTO> consultaGeneralAlbums(List<String> generosRestringidos) throws ExceptionBO;
    
    /**
     * Realiza una búsqueda general de álbumes con criterios de género y búsqueda.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @param busqueda Texto de búsqueda
     * @return Lista de álbumes que coinciden con los criterios
     * @throws ExceptionBO En caso de error en la capa BO
     */
    List<AlbumDTO> busquedaGeneralAlbum(List<String> generosRestringidos, String busqueda) throws ExceptionBO;

}

