package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.PlacaBase;


public class ModeloProcesador extends AbstractTableModel {

    private List<PlacaBase> procesador;
    
    public ModeloProcesador() {
        procesador = DAOTienda.getInstancia().getPlaca_Base();
    }
    
    @Override
    public int getRowCount() {
        return procesador.size();
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
            case 4 -> "Socket";
            case 5 -> "Frecuencia";
            case 6 -> "Núcleos";
            case 7 -> "Hilos";
            default -> "";
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> procesador.get(rowIndex).getNombre();
            case 1 -> procesador.get(rowIndex).getMarca();
            case 2 -> procesador.get(rowIndex).getPrecio();
            case 3 -> procesador.get(rowIndex).getStock();
            case 4 -> procesador.get(rowIndex).getSocket();
            case 5 -> procesador.get(rowIndex).getTipo();
            case 6 -> procesador.get(rowIndex).getTipo();
            case 7 -> procesador.get(rowIndex).getTipo();
            case 8 -> procesador.get(rowIndex).getTipo();
            default -> null;
        };
    }
    
}