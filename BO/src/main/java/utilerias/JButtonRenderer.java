package utilerias;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


/**
 * Clase que representa un renderer de celdas de tabla con un botón.
 * Implementa TableCellRenderer para personalizar la renderización de la celda.
 * 
 * @author Equipo2
 */
public class JButtonRenderer implements TableCellRenderer {

    private final JButton button; // Botón que se muestra en la celda
    
    /**
     * Constructor que inicializa el botón de la celda con el texto proporcionado.
     * 
     * @param text El texto del botón
     */
    public JButtonRenderer(String text) {
        this.button = new JButton(text);
    }
    
    /**
     * Devuelve el componente del botón para renderizar la celda.
     * 
     * @param table La tabla a la que pertenece la celda
     * @param value El valor de la celda
     * @param isSelected Si la celda está seleccionada
     * @param hasFocus Si la celda tiene el foco
     * @param row La fila de la celda
     * @param column La columna de la celda
     * @return El componente que renderiza la celda
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this.button;
    }
    
}

