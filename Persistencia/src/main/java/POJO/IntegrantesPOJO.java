package POJO;

import java.time.LocalDate;
import org.bson.types.ObjectId;

/**
 * * Clase que representa un integrante de un artista musical. Contiene
 * información sobre el integrante, como su nombre, rol, imagen, fechas de
 * ingreso y salida, y estado actual.
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

    /**
     * * Constructor por defecto.
     */
    public IntegrantesPOJO() {
    }

    /**
     * Constructor con todos los parámetros excepto el ID.
     *
     * @param nombre el nombre del integrante
     * @param rol el rol del integrante dentro de la banda o grupo
     * @param imagen la ruta de la imagen del integrante
     * @param ingreso la fecha de ingreso del integrante
     * @param salida la fecha de salida del integrante
     * @param estado el estado actual del integrante (activo o inactivo)
     */
    public IntegrantesPOJO(String nombre, String rol, String imagen, LocalDate ingreso, LocalDate salida, boolean estado) {
        this.nombre = nombre;
        this.rol = rol;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estado = estado;
        this.imagen = imagen;
    }

    /**
     * Obtiene la imagen del integrante.
     *
     * @return la imagen del integrante
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Establece la imagen del integrante.
     *
     * @param imagen la imagen del integrante
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene el ID del integrante.
     *
     * @return el ID del integrante
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID del integrante.
     *
     * @param id el ID del integrante
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del integrante.
     *
     * @return el nombre del integrante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del integrante.
     *
     * @param nombre el nombre del integrante
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el rol del integrante dentro de la banda o grupo.
     *
     * @return el rol del integrante
     */
    public String getRol() {
        return rol;
    }

    /**
     * Establece el rol del integrante dentro de la banda o grupo.
     *
     * @param rol el rol del integrante
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Obtiene la fecha de ingreso del integrante.
     *
     * @return la fecha de ingreso del integrante
     */
    public LocalDate getIngreso() {
        return ingreso;
    }

    /**
     * Establece la fecha de ingreso del integrante.
     *
     * @param ingreso la fecha de ingreso del integrante
     */
    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    /**
     * Obtiene la fecha de salida del integrante.
     *
     * @return la fecha de salida del integrante
     */
    public LocalDate getSalida() {
        return salida;
    }

    /**
     * Establece la fecha de salida del integrante.
     *
     * @param salida la fecha de salida del integrante
     */
    public void setSalida(LocalDate salida) {
        this.salida = salida;
    }

    /**
     * Obtiene el estado actual del integrante (activo o inactivo).
     *
     * @return el estado actual del integrante
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado actual del integrante (activo o inactivo).
     *
     * @param estado el estado actual del integrante
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Devuelve una representación en cadena de la información del integrante.
     *
     * @return una cadena de texto con la información del integrante
     */
    @Override
    public String toString() {
        return "IntegrantesPOJO{" + "id=" + id + ", nombre=" + nombre + ", rol=" + rol + ", imagen=" + imagen + ", ingreso=" + ingreso + ", salida=" + salida + ", estado=" + estado + '}';
    }

}
