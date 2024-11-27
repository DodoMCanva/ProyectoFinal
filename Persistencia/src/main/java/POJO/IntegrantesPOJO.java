
package POJO;

import java.time.LocalDate;
import org.bson.types.ObjectId;

/**
 *
 * @author equipo 2
 */
public class IntegrantesPOJO {

    private ObjectId id;
    private String nombre;
    private String rol;
    private String imagen;
    private LocalDate ingreso;
    private LocalDate salida;
    private boolean estado;

    public IntegrantesPOJO() {
    }

    public IntegrantesPOJO(String nombre, String rol,String imagen, LocalDate ingreso, LocalDate salida, boolean estado) {
        this.nombre = nombre;
        this.rol = rol;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.imagen=imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public LocalDate getSalida() {
        return salida;
    }

    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "IntegrantesPOJO{" + "id=" + id + ", nombre=" + nombre + ", rol=" + rol + ", imagen=" + imagen + ", ingreso=" + ingreso + ", salida=" + salida + ", estado=" + estado + '}';
    }

   

}
