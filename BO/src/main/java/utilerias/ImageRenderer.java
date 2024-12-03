/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilerias;

import java.awt.Component;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * Clase que se encarga de renderizar imágenes dentro de una celda de una tabla.
 * Extiende DefaultTableCellRenderer.
 * 
 * @author Equipo2
 */
public class ImageRenderer extends DefaultTableCellRenderer {

    /**
     * Sobrescribe el método para obtener el componente de renderizado de la celda.
     * 
     * @param table La tabla a la que pertenece la celda
     * @param value El valor de la celda
     * @param isSelected Verdadero si la celda está seleccionada
     * @param hasFocus Verdadero si la celda tiene el foco
     * @param row La fila de la celda
     * @param column La columna de la celda
     * @return El componente que debe renderizar la celda
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value instanceof String) {
            String path = (String) value;  // Ruta de la imagen correspondiente a esta fila
            ImageIcon icon = ImageCache.getImageIcon(path); // Usa el caché de imágenes

            if (icon == null) {
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }

            // Redimensiona la imagen para que quepa bien en la celda
            Image img = icon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
            return new JLabel(new ImageIcon(img));
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
