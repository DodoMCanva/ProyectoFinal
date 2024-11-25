/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POJO;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author cesar
 */
public class AlbumPOJO {

    private ObjectId id;
    private String nombre;
    private Date fechaLanzamiento;
    private String genero;
    private String portada;
    private List<CancionPOJO> canciones;
    private ObjectId artistaId;

    public AlbumPOJO() {
    }

    public AlbumPOJO(String nombre, Date fechaLanzamiento, String genero, String portada, List<CancionPOJO> canciones, ObjectId artistaId) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = portada;
        this.canciones = canciones;
        this.artistaId = artistaId;
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

    public List<CancionPOJO> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<CancionPOJO> canciones) {
        this.canciones = canciones;
    }

    public ObjectId getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(ObjectId artistaId) {
        this.artistaId = artistaId;
    }

    @Override
    public String toString() {
        return "AlbumPOJO{" + "id="
                + id + ", nombre="
                + nombre + ", fechaLanzamiento="
                + fechaLanzamiento + ", genero="
                + genero + ", portada="
                + portada + ", canciones="
                + canciones + ", artistaId="
                + artistaId + '}';
    }

}
