
package POJO;

import java.util.List;
import org.bson.types.ObjectId;

/**
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

    public UsuarioPOJO() {
    }

    public UsuarioPOJO(String nombre, String email, String password, String imagen, List<String> restringidosGeneros) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen = imagen;
        this.restringidosGeneros = restringidosGeneros;
    }

    public UsuarioPOJO(ObjectId id, String nombre, String email, String password, String imagen, List<String> restringidosGeneros,FavoritosPOJO favoritos) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen = imagen;
        this.restringidosGeneros = restringidosGeneros;
        this.favoritos= favoritos;
    }

    public FavoritosPOJO getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(FavoritosPOJO favoritos) {
        this.favoritos = favoritos;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<String> getRestringidosGeneros() {
        return restringidosGeneros;
    }

    public void setRestringidosGeneros(List<String> restringidosGeneros) {
        this.restringidosGeneros = restringidosGeneros;
    }

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
