package POJO;

import org.bson.types.ObjectId;

/**
 * Clase que representa una canción musical. Contiene información sobre la
 * canción.
 *
 * @author equipo 2
 */
public class CancionPOJO {

    private ObjectId id;
    private String nombre;
    private String duracion;
    private String genero;

    /**
     * Constructor por defecto.
     */
    public CancionPOJO() {
    }

    /**
     * Constructor sin el parámetro ID.
     *
     * @param nombre el nombre de la canción
     * @param duracion la duración de la canción
     * @param genero el género musical de la canción
     */
    public CancionPOJO(String nombre, String duracion, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }

    /**
     * Constructor con todos los parámetros.
     *
     * @param id el ID de la canción
     * @param nombre el nombre de la canción
     * @param duracion la duración de la canción
     * @param genero el género musical de la canción
     */
    public CancionPOJO(ObjectId id, String nombre, String duracion, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }

    /**
     * Obtiene el ID de la canción.
     *
     * @return el ID de la canción
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID de la canción.
     *
     * @param id el ID de la canción
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la canción.
     *
     * @return el nombre de la canción
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la canción.
     *
     * @param nombre el nombre de la canción
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la duración de la canción.
     *
     * @return la duración de la canción
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración de la canción.
     *
     * @param duracion la duración de la canción
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtiene el género musical de la canción.
     *
     * @return el género musical de la canción
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género musical de la canción.
     *
     * @param genero el género musical de la canción
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Devuelve una representación en cadena de la información de la canción.
     *
     * @return una cadena de texto con la información de la canción
     */
    @Override
    public String toString() {
        return "CancionPOJO{" + "id="
                + id + ", nombre="
                + nombre + ", duracion="
                + duracion + '}';
    }

}
