package IBO;

import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;
import java.util.List;

/**
 *
 * @author equipo 2
 */
public interface IUsuarioBO {

    void guardarUsuario(UsuarioDTO usuarioDTO) throws ExceptionBO;

    boolean iniciarSesion(String nombre, String password) throws Exception;
    
    public void editarUsuario(UsuarioDTO usuario) throws ExceptionBO; // Edita un usuario en la colección
    
    public void restringirGenero(String sesion, String genero) throws ExceptionBO; // Restringe Genero a un usuario en la colección
    
    public void regresaGenero(String sesion, String genero) throws ExceptionBO; // Regresa Genero a un usuario en la colección
    
    public List<String> consultaRestringidos(String sesion) throws ExceptionBO;
    
    public void agregarArtistaFavorito(String sesion, String artista) throws ExceptionBO; // Agrega un artista favorito al usuario en la colección
    
    public void eliminarFavoritoArtista(String sesion, String artista) throws ExceptionBO; // Elimina un artista favorito al usuario en la colección
    
    public boolean comprobarFavoritoArtista(String id) throws ExceptionBO;
    
    public void agregarCancionFavorito(String sesion, String cancion) throws ExceptionBO; // Agrega una cancion favorito al usuario en la colección
    
    public void eliminarFavoritoCancion(String sesion, String cancion) throws ExceptionBO; // Elimina una cancion favorito al usuario en la colección
    
    public boolean comprobarFavoritoCancion(String id) throws ExceptionBO;
    
    public void agregarAlbumFavorito(String sesion, String album) throws ExceptionBO; // Agrega un album favorito al usuario en la colección
    
    public void eliminarFavoritoAlbum(String sesion, String album) throws ExceptionBO; // Elimina un album favorito al usuario en la colección

    public boolean comprobarFavoritoAlbum(String id) throws ExceptionBO;
    
    public UsuarioDTO buscarPorNombre(String nombre) throws ExceptionBO;// Busca un usuario por su nombreUsuario
    
    public UsuarioDTO buscar(String id) throws ExceptionBO;// Busca un usuario por su id;
    
}
