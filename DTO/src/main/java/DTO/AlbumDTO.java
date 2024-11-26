/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;
import java.util.List;

/**
 *
 * @author cesar
 */
public class AlbumDTO {

    private String id;
    private String nombre;
    private Date fechaLanzamiento;
    private String genero;
    private String portada;
    private List<CancionDTO> canciones;

    public AlbumDTO() {
    }

    public AlbumDTO(String nombre, Date fechaLanzamiento, String genero, String portada, List<CancionDTO> canciones) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = portada;
        this.canciones = canciones;
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

    public Date getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(Date fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public List<CancionDTO> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<CancionDTO> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "AlbumDTO{" + "id="
                + id + ", nombre=" + nombre
                + ", fechaLanzamiento="
                + fechaLanzamiento + ", genero="
                + genero + ", portada=" + portada
                + ", canciones=" + canciones + '}';
    }

}
