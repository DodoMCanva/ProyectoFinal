package POJO;

import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase que representa un usuario del sistema. Contiene información sobre el
 * usuario.
 *
 * @author equipo 2
 */
public class UsuarioPOJO {

    private ObjectId id;
    private String nombre;
    private String email;
    private String password;
    private String imagen;
    private List<String> restringidosGeneros;
    private FavoritosPOJO favoritos;

    /**
     * Constructor por defecto.
     */
    public UsuarioPOJO() {
    }

    /**
     * Constructor sin el parámetro ID y favoritos.
     *
     * @param nombre el nombre del usuario
     * @param email el correo electrónico del usuario
     * @param password la contraseña del usuario
     * @param imagen la ruta de la imagen del usuario
     * @param restringidosGeneros la lista de géneros restringidos por el
     * usuario
     */
    public UsuarioPOJO(String nombre, String email, String password, String imagen, List<String> restringidosGeneros) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen = imagen;
        this.restringidosGeneros = restringidosGeneros;
    }

    /**
     * Constructor con todos los parámetros.
     *
     * @param id el ID del usuario
     * @param nombre el nombre del usuario
     * @param email el correo electrónico del usuario
     * @param password la contraseña del usuario
     * @param imagen la ruta de la imagen del usuario
     * @param restringidosGeneros la lista de géneros restringidos por el
     * usuario
     * @param favoritos la lista de favoritos del usuario
     */
    public UsuarioPOJO(ObjectId id, String nombre, String email, String password, String imagen, List<String> restringidosGeneros, FavoritosPOJO favoritos) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen = imagen;
        this.restringidosGeneros = restringidosGeneros;
        this.favoritos = favoritos;
    }

    /**
     * Obtiene la lista de favoritos del usuario.
     *
     * @return la lista de favoritos del usuario
     */
    public FavoritosPOJO getFavoritos() {
        return favoritos;
    }

    /**
     * Establece la lista de favoritos del usuario.
     *
     * @param favoritos la lista de favoritos del usuario
     */
    public void setFavoritos(FavoritosPOJO favoritos) {
        this.favoritos = favoritos;
    }

    /**
     * Obtiene el ID del usuario.
     *
     * @return el ID del usuario
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID del usuario.
     *
     * @param id el ID del usuario
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return el nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre el nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return el correo electrónico del usuario
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del usuario.
     *
     * @param email el correo electrónico del usuario
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return la contraseña del usuario
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param password la contraseña del usuario
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene la ruta de la imagen del usuario.
     *
     * @return la ruta de la imagen del usuario
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Establece la ruta de la imagen del usuario.
     *
     * @param imagen la ruta de la imagen del usuario
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene la lista de géneros restringidos por el usuario.
     *
     * @return la lista de géneros restringidos por el usuario
     */
    public List<String> getRestringidosGeneros() {
        return restringidosGeneros;
    }

    /**
     * Establece la lista de géneros restringidos por el usuario.
     *
     * @param restringidosGeneros la lista de géneros restringidos por el
     * usuario
     */
    public void setRestringidosGeneros(List<String> restringidosGeneros) {
        this.restringidosGeneros = restringidosGeneros;
    }

    /**
     * Devuelve una representación en cadena de la información del usuario.
     *
     * @return una cadena de texto con la información del usuario
     */
    @Override
    public String toString() {
        return "UsuarioPOJO{" + "id="
                + id + ", nombre=" + nombre
                + ", email=" + email + ", password="
                + password + ", imagen=" + imagen
                + ", restringidosGeneros=" + restringidosGeneros
                + '}';
    }

}
