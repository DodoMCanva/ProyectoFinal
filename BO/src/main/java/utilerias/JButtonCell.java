package utilerias;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 * Clase que representa una celda de tabla con un botón. 
 * Implementa TableCellRenderer y TableCellEditor para personalizar la celda.
 *
 * @autor Equipo2
 */
public class JButtonCell implements TableCellRenderer, TableCellEditor {

    private JButton button; // Botón que se muestra en la celda
    private int row; // Fila de la celda
    private ActionListener actionListener; // Listener para manejar las acciones del botón

    /**
     * Constructor que inicializa el botón de la celda con el texto y el
     * listener de acción proporcionados.
     *
     * @param table La tabla a la que pertenece la celda
     * @param text El texto del botón
     * @param actionListener El listener de acción para manejar los clics del
     * botón
     */
    public JButtonCell(JTable table, String text, ActionListener actionListener) {
        this.button = new JButton(text);
        this.actionListener = actionListener;
        this.button.addActionListener((ActionEvent evt) -> {
            this.actionListener.actionPerformed(new ActionEvent(this.button, ActionEvent.ACTION_PERFORMED, this.row + ""));
        });
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
     * @return true si la celda debería ser seleccionada, false en caso
     * contrario
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
    public void cancelCellEditing() {
    }

    /**
     * Añade un listener de editor de celdas.
     *
     * @param l El listener a añadir
     */
    @Override
    public void addCellEditorListener(CellEditorListener l) {
    }

    /**
     * Elimina un listener de editor de celdas.
     *
     * @param l El listener a eliminar
     */
    @Override
    public void removeCellEditorListener(CellEditorListener l) {
    }

}
