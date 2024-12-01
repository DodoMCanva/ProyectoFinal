/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilerias;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Valeria
 */
public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof String) {
            String path = (String) value;  // Ruta de la imagen correspondiente a esta fila
            ImageIcon icon = ImageCache.getImageIcon(path); // Usa el caché de imágenes

            if (icon == null) {
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }

            // Redimensiona la imagen para que quepa bien en la celda
            Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
            return new JLabel(new ImageIcon(img));
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}


