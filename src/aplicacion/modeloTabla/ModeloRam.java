package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Ram;


public class ModeloRam extends AbstractTableModel {

    private List<Ram> ram;
    
    public ModeloRam() {
        ram = DAOTienda.getInstancia().getRam();
    }
    
    @Override
    public int getRowCount() {
        return ram.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Nombre";
            case 1 -> "Marca";
            case 2 -> "Precio";
            case 3 -> "Stock";
            case 4 -> "Tipo";
            case 5 -> "Capacidad";
            case 6 -> "Frecuencia";
            case 7 -> "Latencia";
                    
            default -> "";
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> ram.get(rowIndex).getNombre();
            case 1 -> ram.get(rowIndex).getMarca();
            case 2 -> ram.get(rowIndex).getPrecio();
            case 3 -> ram.get(rowIndex).getStock();
            case 4 -> ram.get(rowIndex).getTipo();
            case 5 -> ram.get(rowIndex).getCapacidad();
            case 6 -> ram.get(rowIndex).getFrecuencia();
            case 7 -> ram.get(rowIndex).getLatencia();
            default -> null;
        };
    }
    
}
