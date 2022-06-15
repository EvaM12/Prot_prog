package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Refrigeracion;


public class ModeloRefrigeracion extends AbstractTableModel {

    private List<Refrigeracion> refrigeracion;
    
    public ModeloRefrigeracion() {
        refrigeracion = DAOTienda.getInstancia().getRefrigeracion();
    }
    
    @Override
    public int getRowCount() {
        return refrigeracion.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Nombre";
            case 1 -> "Marca";
            case 2 -> "Precio";
            case 3 -> "Stock";
            case 4 -> "Tipo";
            
            default -> "";
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> refrigeracion.get(rowIndex).getNombre();
            case 1 -> refrigeracion.get(rowIndex).getMarca();
            case 2 -> refrigeracion.get(rowIndex).getPrecio();
            case 3 -> refrigeracion.get(rowIndex).getStock();
            case 4 -> refrigeracion.get(rowIndex).getTipo();
           
            default -> null;
        };
    }
    
}
