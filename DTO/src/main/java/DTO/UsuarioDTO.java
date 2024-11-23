/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.List;

/**
 *
 * @author cesar
 */
public class UsuarioDTO {

    private String nombre;
    private String email;
    private String password;
    private String imagen;
    //private FavoritosDTO favoritos;
    //private List<String> restringidosGeneros;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nombre, String email, String password, String imagen) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.imagen = imagen;
        // this.favoritos = new FavoritosDTO();
        // this.restringidosGeneros = restringidosGeneros;
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

//    public FavoritosDTO getFavoritos() {
//        return favoritos;
//    }
//
//    public void setFavoritos(FavoritosDTO favoritos) {
//        this.favoritos = favoritos;
//    }
//
//    public List<String> getRestringidosGeneros() {
//        return restringidosGeneros;
//    }
//
//    public void setRestringidosGeneros(List<String> restringidosGeneros) {
//        this.restringidosGeneros = restringidosGeneros;
//    }
    @Override
    public String toString() {
        return "UsuarioDTO{" + "nombre="
                + nombre + ", email=" + email
                + ", password=" + password + ", imagen="
                + imagen + '}';
    }

}
