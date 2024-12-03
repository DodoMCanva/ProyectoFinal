package POJO;

import org.bson.types.ObjectId;
import java.util.List;

/**
 * Clase que representa los favoritos de un usuario. Contiene listas de IDs de
 * artistas, álbumes y canciones favoritas.
 *
 * @author equipo2
 */
public class FavoritosPOJO {

    private List<ObjectId> artistas;
    private List<ObjectId> albums;
    private List<ObjectId> canciones;

    /**
     * Constructor con todos los parámetros.
     *
     * @param artistas la lista de IDs de artistas favoritos
     * @param albums la lista de IDs de álbumes favoritos
     * @param canciones la lista de IDs de canciones favoritas
     */
    public FavoritosPOJO(List<ObjectId> artistas, List<ObjectId> albums, List<ObjectId> canciones) {
        this.artistas = artistas;
        this.albums = albums;
        this.canciones = canciones;
    }

    /**
     * Obtiene la lista de IDs de artistas favoritos.
     *
     * @return la lista de IDs de artistas favoritos
     */
    public List<ObjectId> getArtistas() {
        return artistas;
    }

    /**
     * Establece la lista de IDs de artistas favoritos.
     *
     * @param artistas la lista de IDs de artistas favoritos
     */
    public void setArtistas(List<ObjectId> artistas) {
        this.artistas = artistas;
    }

    /**
     * Obtiene la lista de IDs de álbumes favoritos.
     *
     * @return la lista de IDs de álbumes favoritos
     */
    public List<ObjectId> getAlbums() {
        return albums;
    }

    /**
     * Establece la lista de IDs de álbumes favoritos.
     *
     * @param albums la lista de IDs de álbumes favoritos
     */
    public void setAlbums(List<ObjectId> albums) {
        this.albums = albums;
    }

    /**
     * Obtiene la lista de IDs de canciones favoritas.
     *
     * @return la lista de IDs de canciones favoritas
     */
    public List<ObjectId> getCanciones() {
        return canciones;
    }

    /**
     * Establece la lista de IDs de canciones favoritas.
     *
     * @param canciones la lista de IDs de canciones favoritas
     */
    public void setCanciones(List<ObjectId> canciones) {
        this.canciones = canciones;
    }

    /**
     * Devuelve una representación en cadena de la información de favoritos.
     *
     * @return una cadena de texto con la información de favoritos
     */
    @Override
    public String toString() {
        return "FavoritosPOJO{"
                + "artistas=" + artistas
                + ", albums=" + albums
                + ", canciones=" + canciones + '}';
    }

}
