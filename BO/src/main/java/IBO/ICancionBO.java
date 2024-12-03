package IBO;

import DTO.CancionDTO;
import Exceptions.ExceptionBO;
import java.util.List;

/**
 * Interfaz que define los métodos para la lógica de negocio de las canciones.
 * 
 * @author equipo 2
 */
public interface ICancionBO {

    /**
     * Inserta una nueva canción.
     * 
     * @param cancion La canción a insertar
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public void insertarCancion(CancionDTO cancion) throws ExceptionBO;

    /**
     * Obtiene el ID de una canción por su nombre.
     * 
     * @param nombre El nombre de la canción
     * @return El ID de la canción
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public String obtenerIdPorNombre(String nombre) throws ExceptionBO;
    
    /**
     * Consulta una canción por su ID.
     * 
     * @param id El ID de la canción
     * @return El DTO de la canción
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public CancionDTO consulta(String id) throws ExceptionBO;
    
    /**
     * Realiza una consulta general de canciones restringida por géneros.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @return Lista de canciones que no están en los géneros restringidos
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public List<CancionDTO> consultaGeneralCancion(List<String> generosRestringidos) throws ExceptionBO;

    /**
     * Realiza una búsqueda general de canciones con criterios de género y búsqueda.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @param busqueda Texto de búsqueda
     * @return Lista de canciones que coinciden con los criterios
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public List<CancionDTO> busquedaGeneralCancion(List<String> generosRestringidos, String busqueda) throws ExceptionBO;
}

