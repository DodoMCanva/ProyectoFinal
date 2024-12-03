
package DTO;
import java.util.List;

/**
 * Clase que representa una lista de favoritos, incluyendo artistas, álbumes y canciones.
 * 
 * @autor Equipo2
 */
public class FavoritosDTO {

    private List<String> artistas; // Lista de IDs de artistas favoritos
    private List<String> albums; // Lista de IDs de álbumes favoritos
    private List<String> canciones; // Lista de IDs de canciones favoritas

    /**
     * Constructor para inicializar la lista de favoritos.
     * 
     * @param artistas Lista de IDs de artistas favoritos
     * @param albums Lista de IDs de álbumes favoritos
     * @param canciones Lista de IDs de canciones favoritas
     */
    public FavoritosDTO(List<String> artistas, List<String> albums, List<String> canciones) {
        this.artistas = artistas;
        this.albums = albums;
        this.canciones = canciones;
    }

    /**
     * Obtiene la lista de IDs de artistas favoritos.
     * 
     * @return La lista de IDs de artistas favoritos
     */
    public List<String> getArtistas() {
        return artistas;
    }

    /**
     * Establece la lista de IDs de artistas favoritos.
     * 
     * @param artistas La lista de IDs de artistas favoritos
     */
    public void setArtistas(List<String> artistas) {
        this.artistas = artistas;
    }

    /**
     * Obtiene la lista de IDs de álbumes favoritos.
     * 
     * @return La lista de IDs de álbumes favoritos
     */
    public List<String> getAlbums() {
        return albums;
    }

    /**
     * Establece la lista de IDs de álbumes favoritos.
     * 
     * @param albums La lista de IDs de álbumes favoritos
     */
    public void setAlbums(List<String> albums) {
        this.albums = albums;
    }

    /**
     * Obtiene la lista de IDs de canciones favoritas.
     * 
     * @return La lista de IDs de canciones favoritas
     */
    public List<String> getCanciones() {
        return canciones;
    }

    /**
     * Establece la lista de IDs de canciones favoritas.
     * 
     * @param canciones La lista de IDs de canciones favoritas
     */
    public void setCanciones(List<String> canciones) {
        this.canciones = canciones;
    }

    /**
     * Representación en formato de cadena del objeto FavoritosDTO.
     * 
     * @return Una cadena con la información de los favoritos
     */
    @Override
    public String toString() {
        return "FavoritosDTO{" + "artistas=" + artistas + ", albums=" + albums + ", canciones=" + canciones + '}';
    }
}
