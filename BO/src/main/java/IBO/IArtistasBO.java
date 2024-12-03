package IBO;

import DTO.ArtistasDTO;
import Exceptions.ExceptionBO;
import java.util.List;

/**
 * Interfaz que define los métodos para la lógica de negocio de los artistas.
 * 
 * @author Equipo 2
 */
public interface IArtistasBO {

    /**
     * Inserta un nuevo artista.
     * 
     * @param artista El artista a insertar
     */
    public void insertarArtista(ArtistasDTO artista);

    /**
     * Obtiene el ID de un artista por su nombre.
     * 
     * @param nombreArtista El nombre del artista
     * @return El ID del artista
     */
    String obtenerIdPorNombre(String nombreArtista);
    
    /**
     * Consulta un artista por su ID.
     * 
     * @param id El ID del artista
     * @return El DTO del artista
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public ArtistasDTO consulta(String id) throws ExceptionBO;

    /**
     * Realiza una consulta general de artistas restringida por géneros.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @return Lista de artistas que no están en los géneros restringidos
     * @throws ExceptionBO En caso de error en la capa BO
     */
    List<ArtistasDTO> consultaGeneralArtista(List<String> generosRestringidos) throws ExceptionBO;

    /**
     * Realiza una búsqueda general de artistas con criterios de género y búsqueda.
     * 
     * @param generosRestringidos Lista de géneros restringidos
     * @param busqueda Texto de búsqueda
     * @return Lista de artistas que coinciden con los criterios
     * @throws ExceptionBO En caso de error en la capa BO
     */
    List<ArtistasDTO> busquedaGeneralArtista(List<String> generosRestringidos, String busqueda) throws ExceptionBO;
}

