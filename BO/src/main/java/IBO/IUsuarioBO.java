package IBO;

import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;
import java.util.List;

/**
 * Interfaz que define los métodos para la lógica de negocio de los usuarios.
 * 
 * @author equipo 2
 */
public interface IUsuarioBO {

    /**
     * Guarda un nuevo usuario en la base de datos.
     * 
     * @param usuarioDTO El DTO del usuario a guardar
     * @throws ExceptionBO En caso de error en la capa BO
     */
    void guardarUsuario(UsuarioDTO usuarioDTO) throws ExceptionBO;

    /**
     * Inicia sesión con el nombre de usuario y la contraseña proporcionados.
     * 
     * @param nombre El nombre del usuario
     * @param password La contraseña del usuario
     * @return true si el inicio de sesión es exitoso, false en caso contrario
     * @throws Exception En caso de error en la capa BO
     */
    boolean iniciarSesion(String nombre, String password) throws Exception;
    
    /**
     * Edita la información de un usuario existente.
     * 
     * @param usuario El DTO del usuario a editar
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public void editarUsuario(UsuarioDTO usuario) throws ExceptionBO; // Edita un usuario en la colección
    
    /**
     * Restringe un género para el usuario en sesión.
     * 
     * @param sesion La sesión del usuario
     * @param genero El género a restringir
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public void restringirGenero(String sesion, String genero) throws ExceptionBO; // Restringe Genero a un usuario en la colección
    
    /**
     * Regresa un género previamente restringido para el usuario en sesión.
     * 
     * @param sesion La sesión del usuario
     * @param genero El género a regresar
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public void regresaGenero(String sesion, String genero) throws ExceptionBO; // Regresa Genero a un usuario en la colección
    
    /**
     * Consulta los géneros restringidos para el usuario en sesión.
     * 
     * @param sesion La sesión del usuario
     * @return Lista de géneros restringidos
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public List<String> consultaRestringidos(String sesion) throws ExceptionBO;
    
    /**
     * Agrega un artista favorito para el usuario en sesión.
     * 
     * @param sesion La sesión del usuario
     * @param artista El ID del artista a agregar
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public void agregarArtistaFavorito(String sesion, String artista) throws ExceptionBO; // Agrega un artista favorito al usuario en la colección
    
    /**
     * Elimina un artista favorito para el usuario en sesión.
     * 
     * @param sesion La sesión del usuario
     * @param artista El ID del artista a eliminar
     * @return true si el artista fue eliminado, false en caso contrario
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public boolean eliminarFavoritoArtista(String sesion, String artista) throws ExceptionBO; // Elimina un artista favorito al usuario en la colección
    
    /**
     * Agrega una canción favorita para el usuario en sesión.
     * 
     * @param sesion La sesión del usuario
     * @param cancion El ID de la canción a agregar
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public void agregarCancionFavorito(String sesion, String cancion) throws ExceptionBO; // Agrega una cancion favorito al usuario en la colección
    
    /**
     * Elimina una canción favorita para el usuario en sesión.
     * 
     * @param sesion La sesión del usuario
     * @param cancion El ID de la canción a eliminar
     * @return true si la canción fue eliminada, false en caso contrario
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public boolean eliminarFavoritoCancion(String sesion, String cancion) throws ExceptionBO; // Elimina una cancion favorito al usuario en la colección
    
    /**
     * Agrega un álbum favorito para el usuario en sesión.
     * 
     * @param sesion La sesión del usuario
     * @param album El ID del álbum a agregar
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public void agregarAlbumFavorito(String sesion, String album) throws ExceptionBO; // Agrega un album favorito al usuario en la colección
    
    /**
     * Elimina un álbum favorito para el usuario en sesión.
     * 
     * @param sesion La sesión del usuario
     * @param album El ID del álbum a eliminar
     * @return true si el álbum fue eliminado, false en caso contrario
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public boolean eliminarFavoritoAlbum(String sesion, String album) throws ExceptionBO; // Elimina un album favorito al usuario en la colección
    
    /**
     * Busca un usuario por su nombre.
     * 
     * @param nombre El nombre del usuario
     * @return El DTO del usuario
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public UsuarioDTO buscarPorNombre(String nombre) throws ExceptionBO;// Busca un usuario por su nombreUsuario
    
    /**
     * Busca un usuario por su ID.
     * 
     * @param id El ID del usuario
     * @return El DTO del usuario
     * @throws ExceptionBO En caso de error en la capa BO
     */
    public UsuarioDTO buscar(String id) throws ExceptionBO;// Busca un usuario por su id;
    
}
