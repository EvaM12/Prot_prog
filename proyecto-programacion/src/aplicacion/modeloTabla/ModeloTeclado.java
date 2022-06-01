package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Teclado;


public class ModeloTeclado extends AbstractTableModel {

    private List<Teclado> teclado;
    
    public ModeloTeclado() {
        teclado = DAOTienda.getInstancia().getTeclado();
    }
    
    @Override
    public int getRowCount() {
        return teclado.size();
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
            case 0 -> teclado.get(rowIndex).getNombre();
            case 1 -> teclado.get(rowIndex).getMarca();
            case 2 -> teclado.get(rowIndex).getPrecio();
            case 3 -> teclado.get(rowIndex).getStock();
            case 4 -> teclado.get(rowIndex).getTipo();
           
            default -> null;
        };
    }
    
}
