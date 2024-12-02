
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
    private String genero;

    public CancionPOJO() {
    }

     public CancionPOJO(String nombre, String duracion,String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }
    public CancionPOJO(ObjectId id, String nombre, String duracion,String genero) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    @Override
    public String toString() {
        return "CancionPOJO{" + "id="
                + id + ", nombre="
                + nombre + ", duracion="
                + duracion + '}';
    }

}
