
package utilerias;
import java.net.URL;
   import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
/**
 * Clase que maneja el almacenamiento en caché de imágenes para optimizar el rendimiento.
 * 
 * @author Equipo2
 */
public class ImageCache {

    private static Map<String, ImageIcon> cache = new HashMap<>(); // Caché para almacenar las imágenes

    /**
     * Obtiene el ImageIcon correspondiente a la ruta especificada.
     * Si la imagen ya está en la caché, se devuelve desde allí.
     * Si no, se carga desde el recurso y se almacena en la caché.
     * 
     * @param path La ruta del recurso de la imagen
     * @return El ImageIcon correspondiente a la ruta, o null si la imagen no se encuentra
     */
    public static ImageIcon getImageIcon(String path) {
        if (cache.containsKey(path)) {
            return cache.get(path);
        }
        URL imageUrl = ImageCache.class.getResource(path);
        if (imageUrl == null) {
            System.out.println("Imagen no encontrada: " + path);
            return null;
        }
        ImageIcon icon = new ImageIcon(imageUrl);
        cache.put(path, icon);
        return icon;
    }
}




