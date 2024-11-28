package IBO;

import DTO.UsuarioDTO;
import Exceptions.ExceptionBO;

/**
 *
 * @author equipo 2
 */
public interface IUsuarioBO {

    void guardarUsuario(UsuarioDTO usuarioDTO) throws ExceptionBO;

    boolean iniciarSesion(String nombre, String password) throws Exception;
    
    public void editarUsuario(UsuarioDTO usuario) throws ExceptionBO; // Edita un usuario en la colección
    
    public void restringirGenero(UsuarioDTO usuario, String genero) throws ExceptionBO; // Restringe Genero a un usuario en la colección
    
    public void regresaGenero(UsuarioDTO usuario, String genero) throws ExceptionBO; // Regresa Genero a un usuario en la colección
    
    public void agregarArtistaFavorito(UsuarioDTO usuario, String artista) throws ExceptionBO; // Agrega un artista favorito al usuario en la colección
    
    public void eliminarFavoritoArtista(UsuarioDTO usuario, String artista) throws ExceptionBO; // Elimina un artista favorito al usuario en la colección
    
    public void agregarCancionFavorito(UsuarioDTO usuario, String cancion) throws ExceptionBO; // Agrega una cancion favorito al usuario en la colección
    
    public void eliminarFavoritoCancion(UsuarioDTO usuario, String cancion) throws ExceptionBO; // Elimina una cancion favorito al usuario en la colección
    
    public void agregarAlbumFavorito(UsuarioDTO usuario, String album) throws ExceptionBO; // Agrega un album favorito al usuario en la colección
    
    public void eliminarFavoritoAlbum(UsuarioDTO usuario, String album) throws ExceptionBO; // Elimina un album favorito al usuario en la colección

    public UsuarioDTO buscarPorNombre(String nombre) throws ExceptionBO;// Busca un usuario por su nombreUsuario
    
    public UsuarioDTO buscar(String id) throws ExceptionBO;// Busca un usuario por su id;
    
}
