
package IBO;

/**
 * Interfaz que define los métodos para el arranque inicial de la aplicación.
 * 
 * @autor Equipo 2
 */
public interface IArranqueInicio {
    
    /**
     * Inicia el proceso de creación de datos iniciales.
     */
    public void iniciar();
    
    /**
     * Crea los artistas iniciales.
     */
    public void crearArtistas();
    
    /**
     * Crea las canciones iniciales.
     */
    public void crearCanciones();
    
    /**
     * Crea los álbumes iniciales.
     */
    public void crearAlbums();
    
}

