
package POJO;

import org.bson.types.ObjectId;
import java.util.List;

/**
 *
 * @author cesar
 */
public class FavoritosPOJO {

    private List<ObjectId> artistas;
    private List<ObjectId> albums;
    private List<ObjectId> canciones;

    public FavoritosPOJO(List<ObjectId> artistas, List<ObjectId> albums, List<ObjectId> canciones) {
        this.artistas = artistas;
        this.albums = albums;
        this.canciones = canciones;
    }

    public List<ObjectId> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<ObjectId> artistas) {
        this.artistas = artistas;
    }

    public List<ObjectId> getAlbums() {
        return albums;
    }

    public void setAlbums(List<ObjectId> albums) {
        this.albums = albums;
    }

    public List<ObjectId> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<ObjectId> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return "FavoritosPOJO{"
                + "artistas=" + artistas
                + ", albums=" + albums
                + ", canciones=" + canciones + '}';
    }

}
