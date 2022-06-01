
package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.PlacaBase;


public class ModeloPlacaBase extends AbstractTableModel {

    private List<PlacaBase> placaBase;
    
    public ModeloPlacaBase() {
        placaBase = DAOTienda.getInstancia().getPlaca_Base();
    }
    
    @Override
    public int getRowCount() {
        return placaBase.size();
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
            case 4 -> "Socket";
            case 5 -> "Tipo";
            default -> "";
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> placaBase.get(rowIndex).getNombre();
            case 1 -> placaBase.get(rowIndex).getMarca();
            case 2 -> placaBase.get(rowIndex).getPrecio();
            case 3 -> placaBase.get(rowIndex).getStock();
            case 4 -> placaBase.get(rowIndex).getSocket();
            case 5 -> placaBase.get(rowIndex).getTipo();
            default -> null;
        };
    }
    
}