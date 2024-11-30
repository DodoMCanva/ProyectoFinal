package DTO;

import java.util.List;

/**
 *
 * @author equipo 2
 */
public class UsuarioDTO {

    private String id;
    private String nombre;
    private String email;
    private String password;
    private String imagen;
    private List<String> restringidosGeneros;
    private FavoritosDTO favoritos;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nombre, String email, String password, String imagen) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen = imagen;
    }

    public UsuarioDTO(String id, String nombre, String email, String password, String imagen, List<String> restringidosGeneros,FavoritosDTO favoritos) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen = imagen;
        this.restringidosGeneros = restringidosGeneros;
        this.favoritos=favoritos;
    }

    public String getId() {
        return id;
    }
    

    public void setId(String id) {
        this.id = id;
    }

    public FavoritosDTO getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(FavoritosDTO favoritos) {
        this.favoritos = favoritos;
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
        return "UsuarioDTO{" + "nombre="
                + nombre + ", email=" + email
                + ", password=" + password
                + ", imagen=" + imagen
                +", restringidosGeneros="
                + restringidosGeneros + '}';
    }

}
