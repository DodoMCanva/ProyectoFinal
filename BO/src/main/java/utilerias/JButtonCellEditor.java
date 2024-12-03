package utilerias;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;


/**
 * Clase que representa un editor de celdas de tabla con un botón.
 * Implementa TableCellEditor para personalizar la edición de la celda.
 * 
 * @author Equipo2
 */
public class JButtonCellEditor implements TableCellEditor {

    private final JButton button; // Botón que se muestra en la celda
    private int row; // Fila de la celda
    private ActionListener actionListener; // Listener para manejar las acciones del botón

    /**
     * Constructor que inicializa el botón de la celda con el texto y el listener de acción proporcionados.
     * 
     * @param text El texto del botón
     * @param actionListener El listener de acción para manejar los clics del botón
     */
    public JButtonCellEditor(String text, ActionListener actionListener) {
        this.button = new JButton(text);
        this.actionListener = actionListener;
        this.button.addActionListener((ActionEvent evt) -> {
            this.actionListener.actionPerformed(
                new ActionEvent(this.button, ActionEvent.ACTION_PERFORMED, this.row + "")
            );
        });
    }
    
    /**
     * Devuelve el componente del botón para editar la celda.
     * 
     * @param table La tabla a la que pertenece la celda
     * @param value El valor de la celda
     * @param isSelected Si la celda está seleccionada
     * @param row La fila de la celda
     * @param column La columna de la celda
     * @return El componente que edita la celda
     */
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        this.row = row;
        return this.button;
    }

    /**
     * Obtiene el valor del editor de la celda.
     * 
     * @return El valor del editor de la celda
     */
    @Override
    public Object getCellEditorValue() {
        return true;
    }

    /**
     * Indica si la celda es editable.
     * 
     * @param anEvent El evento que inicia la edición
     * @return true si la celda es editable, false en caso contrario
     */
    @Override
    public boolean isCellEditable(EventObject anEvent) {
        return true;
    }

    /**
     * Indica si la celda debería ser seleccionada.
     * 
     * @param anEvent El evento que inicia la selección
     * @return true si la celda debería ser seleccionada, false en caso contrario
     */
    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return true;
    }

    /**
     * Detiene la edición de la celda.
     * 
     * @return true si la edición debería detenerse, false en caso contrario
     */
    @Override
    public boolean stopCellEditing() {
        return true;
    }

    /**
     * Cancela la edición de la celda.
     */
    @Override
    public void cancelCellEditing() {}

    /**
     * Añade un listener de editor de celdas.
     * 
     * @param l El listener a añadir
     */
    @Override
    public void addCellEditorListener(CellEditorListener l) {}

    /**
     * Elimina un listener de editor de celdas.
     * 
     * @param l El listener a eliminar
     */
    @Override
    public void removeCellEditorListener(CellEditorListener l) {}
}
