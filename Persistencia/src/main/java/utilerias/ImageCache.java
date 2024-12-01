/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilerias;
import java.net.URL;
   import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
/**
 *
 * @author Valeria
 */
public class ImageCache {
 


    private static Map<String, ImageIcon> cache = new HashMap<>();

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


