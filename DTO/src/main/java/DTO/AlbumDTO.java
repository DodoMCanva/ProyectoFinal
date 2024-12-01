
package DTO;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author equipo 2
 */
public class AlbumDTO {

    private String id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private String genero;
    private String portada;
    private String artista;
    private List<String> canciones;

    public AlbumDTO() {
    }

    public AlbumDTO(String nombre, LocalDate fechaLanzamiento, String genero, String portada, String artista, List<String> canciones) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = portada;
        this.artista = artista;
        this.canciones = canciones;
    }

    public AlbumDTO(String id, String nombre, LocalDate fechaLanzamiento, String genero, String portada, String artista, List<String> canciones) {
        this.id = id;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = portada;
        this.artista = artista;
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

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
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

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public List<String> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<String> canciones) {
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
