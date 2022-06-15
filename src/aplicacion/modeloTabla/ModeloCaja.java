
package aplicacion;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Caja;


public class ModeloCaja extends AbstractTableModel {

    private List<Caja> caja;
    
    public ModeloCaja() {
        caja = DAOTienda.getInstancia().getCaja();
    }
    
    @Override
    public int getRowCount() {
        return caja.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Nombre";
            case 1 -> "Marca";
            case 2 -> "Precio";
            case 3 -> "Stock";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> caja.get(rowIndex).getNombre();
            case 1 -> caja.get(rowIndex).getMarca();
            case 2 -> caja.get(rowIndex).getPrecio();
            case 3 -> caja.get(rowIndex).getStock();
            default -> null;
        };
    }
    
}
