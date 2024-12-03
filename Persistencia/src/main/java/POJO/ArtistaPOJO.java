package POJO;

import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase que representa un artista musical. Contiene información sobre el
 * artista.
 *
 * @author equipo 2
 */
public class ArtistaPOJO {

    private ObjectId id;
    private String nombre;
    private String imagen;
    private String tipo;
    private String genero;
    private List<IntegrantesPOJO> integrantes;

    /**
     * Constructor por defecto.
     */
    public ArtistaPOJO() {
    }

    /**
     * Constructor con todos los parámetros.
     *
     * @param id el ID del artista
     * @param nombre el nombre del artista
     * @param imagen la ruta de la imagen del artista
     * @param tipo el tipo de artista (solista, banda, etc.)
     * @param genero el género musical del artista
     * @param integrantes la lista de integrantes del artista
     */
    public ArtistaPOJO(ObjectId id, String nombre, String imagen, String tipo, String genero, List<IntegrantesPOJO> integrantes) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
        this.integrantes = integrantes;
    }

    /**
     * Constructor sin el parámetro ID y sin integrantes.
     *
     * @param nombre el nombre del artista
     * @param imagen la ruta de la imagen del artista
     * @param tipo el tipo de artista (solista, banda, etc.)
     * @param genero el género musical del artista
     */
    public ArtistaPOJO(String nombre, String imagen, String tipo, String genero) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
    }

    /**
     * Constructor sin el parámetro ID.
     *
     * @param nombre el nombre del artista
     * @param imagen la ruta de la imagen del artista
     * @param tipo el tipo de artista (solista, banda, etc.)
     * @param genero el género musical del artista
     * @param integrantes la lista de integrantes del artista
     */
    public ArtistaPOJO(String nombre, String imagen, String tipo, String genero, List<IntegrantesPOJO> integrantes) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
        this.integrantes = integrantes;
    }

    /**
     * Obtiene el ID del artista.
     *
     * @return el ID del artista
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID del artista.
     *
     * @param id el ID del artista
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del artista.
     *
     * @return el nombre del artista
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del artista.
     *
     * @param nombre el nombre del artista
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la ruta de la imagen del artista.
     *
     * @return la ruta de la imagen del artista
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Establece la ruta de la imagen del artista.
     *
     * @param imagen la ruta de la imagen del artista
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene el tipo de artista (solista, banda, etc.).
     *
     * @return el tipo de artista
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo de artista (solista, banda, etc.).
     *
     * @param tipo el tipo de artista
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtiene el género musical del artista.
     *
     * @return el género musical del artista
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género musical del artista.
     *
     * @param genero el género musical del artista
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la lista de integrantes del artista.
     *
     * @return la lista de integrantes del artista
     */
    public List<IntegrantesPOJO> getIntegrantes() {
        return integrantes;
    }

    /**
     * Establece la lista de integrantes del artista.
     *
     * @param integrantes la lista de integrantes del artista
     */
    public void setIntegrantes(List<IntegrantesPOJO> integrantes) {
        this.integrantes = integrantes;
    }

    /**
     * Devuelve una representación en cadena de la información del artista.
     *
     * @return una cadena de texto con la información del artista
     */
    @Override
    public String toString() {
        return "ArtistaPOJO{" + "id=" + id
                + ", nombre=" + nombre
                + ", imagen=" + imagen
                + ", tipo=" + tipo
                + ", genero=" + genero
                + ", integrantes="
                + integrantes + '}';
    }

}
