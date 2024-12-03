package IDAO;

import Exceptions.ExceptionDAO;
import POJO.UsuarioPOJO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Interfaz que define las operaciones del DAO para usuarios del sistema.
 *
 * @author equipo 2
 */
public interface IUsuarioDAO {

    /**
     * Inserta un usuario en la colección.
     *
     * @param usuario el usuario a insertar
     * @throws ExceptionDAO si ocurre un error durante la inserción
     */
    public void guardarUsuario(UsuarioPOJO usuario) throws ExceptionDAO; // Inserta un usuario en la colección
    //Modificacion

    /**
     * Edita la información de un usuario en la colección.
     *
     * @param usuario el usuario con la información actualizada
     * @throws ExceptionDAO si ocurre un error durante la edición
     */
    void editarUsuario(UsuarioPOJO usuario) throws ExceptionDAO;

    /**
     * Restringe un género para un usuario en la colección.
     *
     * @param sesion la sesión del usuario
     * @param genero el género a restringir
     * @throws ExceptionDAO si ocurre un error durante la restricción
     */
    public void restringirGenero(String sesion, String genero) throws ExceptionDAO; // Restringe Genero a un usuario en la colección

//Modificacion
    /**
     * Revierte la restricción de un género para un usuario en la colección.
     *
     * @param sesion la sesión del usuario
     * @param genero el género a revertir la restricción
     * @throws ExceptionDAO si ocurre un error durante la reversión
     */
    public void regresaGenero(String sesion, String genero) throws ExceptionDAO; // Regresa Genero a un usuario en la colección

    /**
     * Agrega un artista favorito al usuario en la colección.
     *
     * @param usuario el usuario al que se agregará el artista favorito
     * @param artista el ID del artista favorito a agregar
     * @throws ExceptionDAO si ocurre un error durante la adición
     */
    public void agregarArtistaFavorito(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    /**
     * Elimina un artista favorito del usuario en la colección.
     *
     * @param usuario el usuario al que se eliminará el artista favorito
     * @param artista el ID del artista favorito a eliminar
     * @return true si el artista fue eliminado, false en caso contrario
     * @throws ExceptionDAO si ocurre un error durante la eliminación
     */
    public boolean eliminarFavoritoArtista(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    /**
     * Agrega una canción favorita al usuario en la colección.
     *
     * @param usuario el usuario al que se agregará la canción favorita
     * @param cancion el ID de la canción favorita a agregar
     * @throws ExceptionDAO si ocurre un error durante la adición
     */
    public void agregarCancionFavorito(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    /**
     * Elimina una canción favorita del usuario en la colección.
     *
     * @param usuario el usuario al que se eliminará la canción favorita
     * @param cancion el ID de la canción favorita a eliminar
     * @return true si la canción fue eliminada, false en caso contrario
     * @throws ExceptionDAO si ocurre un error durante la eliminación
     */
    public boolean eliminarFavoritoCancion(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    /**
     * Agrega un álbum favorito al usuario en la colección.
     *
     * @param usuario el usuario al que se agregará el álbum favorito
     * @param album el ID del álbum favorito a agregar
     * @throws ExceptionDAO si ocurre un error durante la adición
     */
    public void agregarAlbumFavorito(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    /**
     * Elimina un álbum favorito del usuario en la colección.
     *
     * @param usuario el usuario al que se eliminará el álbum favorito
     * @param album el ID del álbum favorito a eliminar
     * @return true si el álbum fue eliminado, false en caso contrario
     * @throws ExceptionDAO si ocurre un error durante la eliminación
     */
    public boolean eliminarFavoritoAlbum(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    /**
     * Busca un usuario por su nombre de usuario.
     *
     * @param nombre el nombre del usuario
     * @return el usuario correspondiente al nombre
     * @throws ExceptionDAO si ocurre un error durante la búsqueda
     */
    public UsuarioPOJO buscarPorNombre(String nombre) throws ExceptionDAO;// Busca un usuario por su nombreUsuario

    /**
     * Busca un usuario por su ID.
     *
     * @param id el ID del usuario
     * @return el usuario correspondiente al ID
     * @throws ExceptionDAO si ocurre un error durante la búsqueda
     */
    public UsuarioPOJO buscar(ObjectId id) throws ExceptionDAO;// Busca un usuario por su id;

    /**
     * Consulta la lista de géneros restringidos para un usuario.
     *
     * @param sesion la sesión del usuario
     * @return la lista de géneros restringidos
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public List<String> consultaRestringidos(String sesion) throws ExceptionDAO;

    /**
     * Consulta la lista de artistas favoritos de un usuario.
     *
     * @param sesion la sesión del usuario
     * @return la lista de IDs de artistas favoritos
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public List<ObjectId> consultarArtistasFavorito(ObjectId sesion) throws ExceptionDAO;

    /**
     * Consulta la lista de álbumes favoritos de un usuario.
     *
     * @param sesion la sesión del usuario
     * @return la lista de IDs de álbumes favoritos
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public List<ObjectId> consultarAlbumsFavorito(ObjectId sesion) throws ExceptionDAO;

    /**
     * Consulta la lista de canciones favoritas de un usuario.
     *
     * @param sesion la sesión del usuario
     * @return la lista de IDs de canciones favoritas
     * @throws ExceptionDAO si ocurre un error durante la consulta
     */
    public List<ObjectId> consultarCancionesFavorito(ObjectId sesion) throws ExceptionDAO;
}
