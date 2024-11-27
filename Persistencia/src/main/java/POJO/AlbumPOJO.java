package POJO;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author equipo 2
 */
public class AlbumPOJO {

    private ObjectId id;
    private String nombre;
    private Date fechaLanzamiento;
    private String genero;
    private String portada;
    private ObjectId artistaId;
    private List<ObjectId> canciones;

    public AlbumPOJO() {
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
