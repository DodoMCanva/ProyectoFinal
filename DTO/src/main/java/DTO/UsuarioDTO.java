package DTO;

import java.util.List;

/**
 * Clase que representa un usuario.
 * Incluye información sobre su ID, nombre, correo electrónico, contraseña, imagen, géneros restringidos y favoritos.
 * 
 * @author equipo 2
 */
public class UsuarioDTO {

    private String id; // Identificador único del usuario
    private String nombre; // Nombre del usuario
    private String email; // Correo electrónico del usuario
    private String password; // Contraseña del usuario
    private String imagen; // Imagen del usuario
    private List<String> restringidosGeneros; // Lista de géneros restringidos para el usuario
    private FavoritosDTO favoritos; // Lista de favoritos del usuario

    /**
     * Constructor por defecto.
     */
    public UsuarioDTO() {
    }

    /**
     * Constructor con parámetros para inicializar un nuevo usuario sin ID.
     * 
     * @param nombre El nombre del usuario
     * @param email El correo electrónico del usuario
     * @param password La contraseña del usuario
     * @param imagen La imagen del usuario
     */
    public UsuarioDTO(String nombre, String email, String password, String imagen) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen = imagen;
    }

    /**
     * Constructor con parámetros para inicializar un nuevo usuario con ID.
     * 
     * @param id El identificador único del usuario
     * @param nombre El nombre del usuario
     * @param email El correo electrónico del usuario
     * @param password La contraseña del usuario
     * @param imagen La imagen del usuario
     * @param restringidosGeneros La lista de géneros restringidos para el usuario
     * @param favoritos La lista de favoritos del usuario
     */
    public UsuarioDTO(String id, String nombre, String email, String password, String imagen, List<String> restringidosGeneros, FavoritosDTO favoritos) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen = imagen;
        this.restringidosGeneros = restringidosGeneros;
        this.favoritos = favoritos;
    }

    /**
     * Obtiene el ID del usuario.
     * 
     * @return El ID del usuario
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID del usuario.
     * 
     * @param id El ID del usuario
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la lista de favoritos del usuario.
     * 
     * @return La lista de favoritos del usuario
     */
    public FavoritosDTO getFavoritos() {
        return favoritos;
    }

    /**
     * Establece la lista de favoritos del usuario.
     * 
     * @param favoritos La lista de favoritos del usuario
     */
    public void setFavoritos(FavoritosDTO favoritos) {
        this.favoritos = favoritos;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombre El nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * 
     * @return El correo electrónico del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del usuario.
     * 
     * @param email El correo electrónico del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return La contraseña del usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     * 
     * @param password La contraseña del usuario
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene la imagen del usuario.
     * 
     * @return La imagen del usuario
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Establece la imagen del usuario.
     * 
     * @param imagen La imagen del usuario
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene la lista de géneros restringidos para el usuario.
     * 
     * @return La lista de géneros restringidos para el usuario
     */
    public List<String> getRestringidosGeneros() {
        return restringidosGeneros;
    }

    /**
     * Establece la lista de géneros restringidos para el usuario.
     * 
     * @param restringidosGeneros La lista de géneros restringidos para el usuario
     */
    public void setRestringidosGeneros(List<String> restringidosGeneros) {
        this.restringidosGeneros = restringidosGeneros;
    }

    /**
     * Representación en formato de cadena del objeto UsuarioDTO.
     * 
     * @return Una cadena con la información del usuario
     */
    @Override
    public String toString() {
        return "UsuarioDTO{" + "nombre=" + nombre + ", email=" + email + ", password=" + password + ", imagen=" + imagen + ", restringidosGeneros=" + restringidosGeneros + '}';
    }
}
