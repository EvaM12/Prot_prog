
package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Alimentacion;


public class ModeloAlimentacion extends AbstractTableModel {

    private List<Alimentacion> alimentacion;
    
    public ModeloAlimentacion() {
        alimentacion = DAOTienda.getInstancia().getAlimentacion();
    }
    
    @Override
    public int getRowCount() {
        return alimentacion.size();
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
            case 4 -> "Certificacion";
            case 5 -> "Potencia";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> alimentacion.get(rowIndex).getNombre();
            case 1 -> alimentacion.get(rowIndex).getMarca();
            case 2 -> alimentacion.get(rowIndex).getPrecio();
            case 3 -> alimentacion.get(rowIndex).getStock();
            case 4 -> alimentacion.get(rowIndex).getCertificacion();
            case 5 -> alimentacion.get(rowIndex).getPotencia();
            default -> null;
        };
    }
    
}
