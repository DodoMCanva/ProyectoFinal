package DTO;

/**
 * Clase que representa una canción. Contiene información sobre el ID, nombre,
 * duración y género de la canción.
 *
 * @autor Equipo2
 */
public class CancionDTO {

    private String id; // Identificador único de la canción
    private String nombre; // Nombre de la canción
    private String duracion; // Duración de la canción
    private String genero; // Género de la canción

    /**
     * Constructor por defecto.
     */
    public CancionDTO() {
    }

    /**
     * Constructor con parámetros para inicializar la canción sin ID.
     *
     * @param nombre El nombre de la canción
     * @param duracion La duración de la canción
     * @param genero El género de la canción
     */
    public CancionDTO(String nombre, String duracion, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }

    /**
     * Constructor con parámetros para inicializar la canción con ID.
     *
     * @param id El identificador único de la canción
     * @param nombre El nombre de la canción
     * @param duracion La duración de la canción
     * @param genero El género de la canción
     */
    public CancionDTO(String id, String nombre, String duracion, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.genero = genero;
    }

    /**
     * Obtiene el ID de la canción.
     *
     * @return El ID de la canción
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el ID de la canción.
     *
     * @param id El ID de la canción
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la canción.
     *
     * @return El nombre de la canción
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la canción.
     *
     * @param nombre El nombre de la canción
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la duración de la canción.
     *
     * @return La duración de la canción
     */
    public String getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración de la canción.
     *
     * @param duracion La duración de la canción
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtiene el género de la canción.
     *
     * @return El género de la canción
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género de la canción.
     *
     * @param genero El género de la canción
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Representación en formato de cadena del objeto CancionDTO.
     *
     * @return Una cadena con la información de la canción
     */
    @Override
    public String toString() {
        return "CancionDTO{"
                + "id=" + id
                + ", nombre="
                + nombre + ", duracion="
                + duracion + ", genero="
                + genero + '}';
    }
}
