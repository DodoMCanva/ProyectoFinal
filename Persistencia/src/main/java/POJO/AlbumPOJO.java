package POJO;

import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase que representa un álbum musical. Contiene información sobre el álbum..
 *
 * @author equipo 2
 */
public class AlbumPOJO {

    private ObjectId id;
    private String nombre;
    private LocalDate fechaLanzamiento;
    private String genero;
    private String portada;
    private ObjectId artistaId;
    private List<ObjectId> canciones;

    /**
     * Constructor por defecto.
     */
    public AlbumPOJO() {
    }

    /**
     * Constructor con todos los parámetros.
     *
     * @param id el ID del álbum
     * @param nombre el nombre del álbum
     * @param fechaLanzamiento la fecha de lanzamiento del album
     * @param genero el género del album
     * @param portada la ruta de la imagen de la portada del álbum
     * @param artistaId el ID del artista asociado al álbum
     * @param canciones la lista de IDs de canciones del álbum
     */
    public AlbumPOJO(ObjectId id, String nombre, LocalDate fechaLanzamiento, String genero, String portada, ObjectId artistaId, List<ObjectId> canciones) {
        this.id = id;
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = portada;
        this.artistaId = artistaId;
        this.canciones = canciones;
    }

    /**
     * Constructor sin el parámetro ID.
     *
     * @param nombre el nombre del álbum
     * @param fechaLanzamiento la fecha de lanzamiento del álbum
     * @param genero el género del álbum
     * @param portada la ruta de la imagen de la portada del álbum
     * @param artistaId el ID del artista asociado al álbum
     * @param canciones la lista de IDs de canciones del álbum
     */
    public AlbumPOJO(String nombre, LocalDate fechaLanzamiento, String genero, String portada, ObjectId artistaId, List<ObjectId> canciones) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = portada;
        this.artistaId = artistaId;
        this.canciones = canciones;
    }

    /**
     * Obtiene el ID del álbum.
     *
     * @return el ID del álbum
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID del álbum.
     *
     * @param id el ID del álbum
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del álbum.
     *
     * @return el nombre del álbum
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del álbum.
     *
     * @param nombre el nombre del álbum
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la fecha de lanzamiento del álbum.
     *
     * @return la fecha de lanzamiento del álbum
     */
    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    /**
     * Establece la fecha de lanzamiento del álbum.
     *
     * @param fechaLanzamiento la fecha de lanzamiento del álbum
     */
    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    /**
     * Obtiene el género del álbum.
     *
     * @return el género del álbum
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género del álbum.
     *
     * @param genero el género del álbum
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la ruta de la imagen de la portada del álbum.
     *
     * @return la ruta de la imagen de la portada del álbum
     */
    public String getPortada() {
        return portada;
    }

    /**
     * Establece la ruta de la imagen de la portada del álbum.
     *
     * @param portada la ruta de la imagen de la portada del álbum
     */
    public void setPortada(String portada) {
        this.portada = portada;
    }

    /**
     * Obtiene el ID del artista asociado al álbum.
     *
     * @return el ID del artista asociado al álbum
     */
    public ObjectId getArtistaId() {
        return artistaId;
    }

    /**
     * Establece el ID del artista asociado al álbum.
     *
     * @param artistaId el ID del artista asociado al álbum
     */
    public void setArtistaId(ObjectId artistaId) {
        this.artistaId = artistaId;
    }

    /**
     * Obtiene la lista de IDs de canciones del álbum.
     *
     * @return la lista de IDs de canciones del álbum
     */
    public List<ObjectId> getCanciones() {
        return canciones;
    }

    /**
     * Establece la lista de IDs de canciones del álbum.
     *
     * @param canciones la lista de IDs de canciones del álbum
     */
    public void setCanciones(List<ObjectId> canciones) {
        this.canciones = canciones;
    }

    /**
     * Devuelve una representación en cadena de la información del álbum.
     *
     * @return una cadena de texto con la información del álbum
     */
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
