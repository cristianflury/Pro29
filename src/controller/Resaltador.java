package controller;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class Resaltador implements TableCellRenderer {

    private Integer columna;
    public static final DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer();

    /**
     * Creamos el resaltador indicando que fila se coloreara por defecto
     *
     * @param row
     */
    public Resaltador(Integer column) {
        columna = column;
    }

    /**
     * Colorea la celda si pertenece a la fila indicada, esta funcion es llamada
     * internamente por la tabla que use esta clase como renderizados
     *
     * @param table Tabla
     * @param value Valor de la celda
     * @param isSelected Celda selecionada
     * @param hasFocus Celta tiene el foco
     * @param row Fila de la celda
     * @param column Columna de la celda
     * @return Celda de la tabla
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Obtenemos la celda que se esta renderizando
        Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        // Si la celda esta en la fila indicada y no esta seleccionada se coloreara de este modo        
        if (columna.compareTo(column) == 0 && isSelected == false) {
            c.setBackground(Color.LIGHT_GRAY);
            c.setForeground(Color.BLACK);
            // Si la celda esta en la fila indicada y esta seleccionada se coloreara de este modo
        } else if (columna.compareTo(row) == 0 && isSelected == true) {
            c.setBackground(new Color(0, 128, 128));
            c.setForeground(Color.WHITE);
            // Si la celda no esta en la fila indicada y esta seleccionada se coloreara de este modo
        } else if (columna.compareTo(row) != 0 && isSelected == true) {
            c.setBackground(new Color(0, 128, 128));
            c.setForeground(Color.WHITE);
            // En los demas casos se coloreara de este modo
        } else {
            c.setBackground(Color.WHITE);
            c.setForeground(Color.BLACK);
        }
        // Regresamos la celda para que se agrege a la tabla
        return c;
    }

    /**
     * @return the fila
     */
    public Integer getColumna() {
        return columna;
    }

    /**
     * @param fila the fila to set
     */
    public void setColumna(Integer columna) {
        this.columna = columna;
    }
}