package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Pantalla;


public class ModeloPantalla extends AbstractTableModel {

    private List<Pantalla> pantalla;
    
    public ModeloPantalla() {
        pantalla = DAOTienda.getInstancia().getPantalla();
    }
    
    @Override
    public int getRowCount() {
        return pantalla.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Nombre";
            case 1 -> "Marca";
            case 2 -> "Precio";
            case 3 -> "Stock";
            case 4 -> "Tamaño";
             case 5 -> "Resolucion";
            default -> "";
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> pantalla.get(rowIndex).getNombre();
            case 1 -> pantalla.get(rowIndex).getMarca();
            case 2 -> pantalla.get(rowIndex).getPrecio();
            case 3 -> pantalla.get(rowIndex).getStock();
            case 4 -> pantalla.get(rowIndex).getTamaño();
            case 5 -> pantalla.get(rowIndex).getResolucion();
            default -> null;
        };
    }
    
}
