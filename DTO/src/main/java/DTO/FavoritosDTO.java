
package DTO;

import org.bson.types.ObjectId;
import java.util.List;

/**
 *
 * @author equipo 2
 */
public class FavoritosDTO {

    private List<String> artistas;
    private List<String> albums;
    private List<String> canciones;

    public FavoritosDTO(List<String> artistas, List<String> albums, List<String> canciones) {
        this.artistas = artistas;
        this.albums = albums;
        this.canciones = canciones;
    }

    public List<String> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<String> artistas) {
        this.artistas = artistas;
    }

    public List<String> getAlbums() {
        return albums;
    }

    public void setAlbums(List<String> albums) {
        this.albums = albums;
    }

    public List<String> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<String> canciones) {
        this.canciones = canciones;
    }

   

    @Override
    public String toString() {
        return "FavoritosDTO{"
                + "artistas=" + artistas
                + ", albums=" + albums + ", canciones="
                + canciones + '}';
    }

}
