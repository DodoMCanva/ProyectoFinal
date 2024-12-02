package DTO;

/**
 *
 * @author cesar
 */
public class CancionDTO {

    private String id;
    private String nombre;
    private String duracion;
    private String genero;

    public CancionDTO() {
    }

    public CancionDTO(String nombre, String duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public CancionDTO(String id, String nombre, String duracion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;

    }

    public CancionDTO(String id, String nombre, String duracion, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "CancionDTO{" + "id="
                + id + ", nombre=" + nombre
                + ", duracion=" + duracion
                + '}';
    }

}
