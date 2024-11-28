
package POJO;

import org.bson.types.ObjectId;

/**
 *
 * @author equipo 2
 */
public class CancionPOJO {

    private ObjectId id;
    private String nombre;
    private String duracion;

    public CancionPOJO() {
    }

    public CancionPOJO(ObjectId id, String nombre, String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public CancionPOJO(String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "CancionPOJO{" + "id="
                + id + ", nombre="
                + nombre + ", duracion="
                + duracion + '}';
    }

}
