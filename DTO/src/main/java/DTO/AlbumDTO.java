package DTO;

import java.time.LocalDate;
import java.util.List;

/**
 * Esta clase encapsula la información de un álbum, como su nombre, artista,
 * fecha de lanzamiento, género, portada y lista de canciones.
 *
 * @author equipo 2
 */
public class AlbumDTO {

    // Identificador único del álbum.
    private String id;
    // Nombre del álbum.
    private String nombre;
    // Fecha de lanzamiento del álbum.
    private LocalDate fechaLanzamiento;
    // Género musical del álbum.
    private String genero;
    // Portada del álbum (ruta o referencia a la imagen).
    private String portada;
    // Nombre del artista o banda que creó el álbum.
    private String artista;
    // Lista de canciones incluidas en el álbum.
    private List<String> canciones;

    /**
     * Constructor por defecto. Crea una instancia vacía de AlbumDTO.
     */
    public AlbumDTO() {
    }

    /**
     * Constructor para crear un álbum.
     *
     * @param nombre Nombre del álbum.
     * @param fechaLanzamiento Fecha en que salió el álbum.
     * @param genero Género musical del álbum.
     * @param portada Portada del álbum.
     * @param artista Artista del álbum.
     * @param canciones Lista de canciones que incluye.
     */
    public AlbumDTO(String nombre, LocalDate fechaLanzamiento, String genero, String portada, String artista, List<String> canciones) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = portada;
        this.artista = artista;
        this.canciones = canciones;
    }

    /**
     * Constructor para crear un álbum.r
     *
     * @param id Identificador único del álbum.
     * @param nombre Nombre del álbum.
     * @param fechaLanzamiento Fecha en que salió el álbum.
     * @param genero Género musical del álbum.
     * @param portada Portada del álbum.
     * @param artista Artista del álbum.
     * @param canciones Lista de canciones que incluye.
     */
    public AlbumDTO(String id, String nombre, LocalDate fechaLanzamiento, String genero, String portada, String artista, List<String> canciones) {
        this.id = id;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = portada;
        this.artista = artista;
        this.canciones = canciones;
    }
  /**
     * Obtiene el identificador único del álbum.
     * 
     * @return ID del álbum.
     */
    public String getId() {
        return id;
    }
  /**
     * Establece el identificador único del álbum.
     * 
     * @param id Identificador único del álbum.
     */
    public void setId(String id) {
        this.id = id;
    }
 /**
     * Obtiene el nombre del álbum.
     * 
     * @return Nombre del álbum.
     */
    public String getNombre() {
        return nombre;
    }
    
     /**
     * Establece el nombre del álbum.
     * 
     * @param nombre Nombre del álbum.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 /**
     * Obtiene la fecha de lanzamiento del álbum.
     * 
     * @return Fecha de lanzamiento.
     */
    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * Establece la fecha de lanzamiento del álbum.
     * 
     * @param fechaLanzamiento Fecha de lanzamiento.
     */
    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
 /**
     * Obtiene el género musical del álbum.
     * 
     * @return Género del álbum.
     */
    public String getGenero() {
        return genero;
    }
 /**
     * Establece el género musical del álbum.
     * 
     * @param genero Género del álbum.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
  /**
     * Obtiene la portada del álbum.
     * 
     * @return Portada del álbum.
     */
    public String getPortada() {
        return portada;
    }
/**
     * Establece la portada del álbum.
     * 
     * @param portada Portada del álbum.
     */
    public void setPortada(String portada) {
        this.portada = portada;
    }
 /**
     * Obtiene el nombre del artista o banda creadora del álbum.
     * 
     * @return Artista del álbum.
     */
    public String getArtista() {
        return artista;
    }
  /**
     * Establece el nombre del artista o banda creadora del álbum.
     * 
     * @param artista Artista del álbum.
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }
/**
     * Obtiene la lista de canciones incluidas en el álbum.
     * 
     * @return Lista de canciones.
     */
    public List<String> getCanciones() {
        return canciones;
    }
   /**
     * Establece la lista de canciones incluidas en el álbum.
     * 
     * @param canciones Lista de canciones.
     */
    public void setCanciones(List<String> canciones) {
        this.canciones = canciones;
    }
 /**
     * Convierte los datos del álbum en una representación de cadena de texto.
     * 
     * @return Una cadena de texto que representa al álbum.
     */
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
