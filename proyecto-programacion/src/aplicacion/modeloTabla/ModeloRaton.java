package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Raton;


public class ModeloRaton extends AbstractTableModel {

    private List<Raton> raton;
    
    public ModeloRaton() {
        raton = DAOTienda.getInstancia().getRaton();
    }
    
    @Override
    public int getRowCount() {
        return raton.size();
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
            case 4 -> "Tipo";
            case 5 -> "Sensor";
            default -> "";
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> raton.get(rowIndex).getNombre();
            case 1 -> raton.get(rowIndex).getMarca();
            case 2 -> raton.get(rowIndex).getPrecio();
            case 3 -> raton.get(rowIndex).getStock();
            case 4 -> raton.get(rowIndex).getDPi();
           case 5 -> raton.get(rowIndex).getSensor();
            default -> null;
        };
    }
    
}
