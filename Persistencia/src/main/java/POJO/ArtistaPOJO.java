package POJO;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author cesar
 */
public class ArtistaPOJO {

    private ObjectId id;
    private String nombre;
    private String imagen;
    private String tipo;
    private String genero;
    private List<IntegrantesPOJO> integrantes;

    public ArtistaPOJO() {
    }

    public ArtistaPOJO(ObjectId id, String nombre, String imagen, String tipo, String genero, List<IntegrantesPOJO> integrantes) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
        this.integrantes = integrantes;
    }

    public ArtistaPOJO(String nombre, String imagen, String tipo, String genero) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
    }

    public ArtistaPOJO(String nombre, String imagen, String tipo, String genero, List<IntegrantesPOJO> integrantes) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipo = tipo;
        this.genero = genero;
        this.integrantes = integrantes;
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

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<IntegrantesPOJO> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<IntegrantesPOJO> integrantes) {
        this.integrantes = integrantes;
    }

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
