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

    //Creacion
    public void guardarUsuario(UsuarioPOJO usuario) throws ExceptionDAO; // Inserta un usuario en la colección
    //Modificacion

    void editarUsuario(UsuarioPOJO usuario) throws ExceptionDAO;

    //Modificacion
    public void restringirGenero(String sesion, String genero) throws ExceptionDAO; // Restringe Genero a un usuario en la colección
    //Modificacion

    public void regresaGenero(String sesion , String genero) throws ExceptionDAO; // Regresa Genero a un usuario en la colección
    //Creacion

    public void agregarArtistaFavorito(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección
    //Modificacion

    public void eliminarFavoritoArtista(UsuarioPOJO usuario, ObjectId artista) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    //Creacion
    public void agregarCancionFavorito(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    //Modificacion
    public boolean eliminarFavoritoCancion(UsuarioPOJO usuario, ObjectId cancion) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    //Creacion
    public void agregarAlbumFavorito(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    //Modificacion
    public void eliminarFavoritoAlbum(UsuarioPOJO usuario, ObjectId album) throws ExceptionDAO; // Agrega un artista favorito al usuario en la colección

    //Consulta
    public UsuarioPOJO buscarPorNombre(String nombre) throws ExceptionDAO;// Busca un usuario por su nombreUsuario

    //Consulta
    public UsuarioPOJO buscar(ObjectId id) throws ExceptionDAO;// Busca un usuario por su id;

    //Consulta
    public List<String> consultaRestringidos(String sesion) throws ExceptionDAO;

    //Consulta
    public List<ObjectId> consultarArtistasFavorito(ObjectId sesion) throws ExceptionDAO;

    //Consulta
    public List<ObjectId> consultarAlbumsFavorito(ObjectId sesion) throws ExceptionDAO;

//Consulta
    public List<ObjectId> consultarCancionesFavorito(ObjectId sesion) throws ExceptionDAO;
}
