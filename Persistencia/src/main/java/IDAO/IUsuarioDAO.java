package IDAO;

import Exceptions.ExceptionDAO;
import POJO.UsuarioPOJO;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author equipo 2
 */
public interface IUsuarioDAO {

    public void guardarUsuario(UsuarioPOJO usuario) throws ExceptionDAO; // Inserta un usuario en la colección

    void editarUsuario(UsuarioPOJO usuario) throws ExceptionDAO;

    public void restringirGenero(UsuarioPOJO usuario, String genero) throws ExceptionDAO; // Restringe Genero a un usuario en la colección

    public void regresaGenero(UsuarioPOJO usuario, String genero) throws ExceptionDAO; // Regresa Genero a un usuario en la colección

    public void agregarArtistaFavorito(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    public void eliminarFavoritoArtista(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    public void agregarCancionFavorito(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    public void eliminarFavoritoCancion(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    public void agregarAlbumFavorito(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    public void eliminarFavoritoAlbum(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    public UsuarioPOJO buscarPorNombre(String nombre) throws ExceptionDAO;// Busca un usuario por su nombreUsuario

    public UsuarioPOJO buscar(ObjectId id) throws ExceptionDAO;// Busca un usuario por su id;

    public List<String> consultaRestringidos(String sesion) throws ExceptionDAO;
}
