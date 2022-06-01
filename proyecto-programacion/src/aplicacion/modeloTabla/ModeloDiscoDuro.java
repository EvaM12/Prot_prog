
package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.DiscoDuro;


public class ModeloDiscoDuro extends AbstractTableModel {

    private List<DiscoDuro> discoDuro;
    
    public ModeloDiscoDuro() {
        discoDuro = DAOTienda.getInstancia().getDiscoDuro();
    }
    
    @Override
    public int getRowCount() {
        return discoDuro.size();
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
            case 5 -> "Capacidad";
            case 6 -> "Velocidad lectura";
            case 7 -> "Velocidad escritura";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> discoDuro.get(rowIndex).getNombre();
            case 1 -> discoDuro.get(rowIndex).getMarca();
            case 2 -> discoDuro.get(rowIndex).getPrecio();
            case 3 -> discoDuro.get(rowIndex).getStock();
            case 4 -> discoDuro.get(rowIndex).getTipo();
            case 5 -> discoDuro.get(rowIndex).getCapacidad();
            case 6 -> discoDuro.get(rowIndex).getVelocidadLectura();
            case 7 -> discoDuro.get(rowIndex).getVelocidadEscritura();
            default -> null;
        };
    }
    
}
