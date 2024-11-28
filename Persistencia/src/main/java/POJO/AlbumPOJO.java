package POJO;

import java.time.LocalDate;
import java.util.List;
import org.bson.types.ObjectId;

/**
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

    public AlbumPOJO() {
    }

    public AlbumPOJO(String nombre, LocalDate fechaLanzamiento, String genero, String portada, ObjectId artistaId, List<ObjectId> canciones) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.portada = portada;
        this.artistaId = artistaId;
        this.canciones = canciones;
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

    public ObjectId getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(ObjectId artistaId) {
        this.artistaId = artistaId;
    }

    public List<ObjectId> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<ObjectId> canciones) {
        this.canciones = canciones;
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
