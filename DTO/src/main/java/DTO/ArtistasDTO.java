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
public class ArtistasDTO {

    private String id;
    private String nombre;
    private String imagen;
    private String tipo; 
    private String genero;
    private List<IntegranteDTO> integrantes;

    public ArtistasDTO() {
    }

    public ArtistasDTO(String nombre, String imagen, String tipo, String genero) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
    }

    public ArtistasDTO(String nombre, String imagen, String tipo, String genero, List<IntegranteDTO> integrantes) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
        this.integrantes = integrantes;
    }

    public ArtistasDTO(String id, String nombre, String imagen, String tipo, String genero, List<IntegranteDTO> integrantes) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
        this.integrantes = integrantes;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<IntegranteDTO> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<IntegranteDTO> integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "ArtistasDTO{" + "id=" + id
                + ", nombre=" + nombre
                + ", imagen=" + imagen
                + ", tipo=" + tipo
                + ", genero=" + genero
                + ", integrantes="
                + integrantes + '}';
    }

}
