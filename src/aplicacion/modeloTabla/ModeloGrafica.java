package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Grafica;


public class ModeloGrafica extends AbstractTableModel {

    private List<Grafica> grafica;
    
    public ModeloGrafica() {
        grafica = DAOTienda.getInstancia().getGrafica();
    }
    
    @Override
    public int getRowCount() {
        return grafica.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Nombre";
            case 1 -> "Marca";
            case 2 -> "Precio";
            case 3 -> "Stock";
            case 4 -> "Memoria";
            case 5 -> "Frecuencia";
            case 6 -> "TipoRAM";
            default -> "";
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> grafica.get(rowIndex).getNombre();
            case 1 -> grafica.get(rowIndex).getMarca();
            case 2 -> grafica.get(rowIndex).getPrecio();
            case 3 -> grafica.get(rowIndex).getStock();
            case 4 -> grafica.get(rowIndex).getMemoria();
            case 5 -> grafica.get(rowIndex).getFrecuencia();
            case 6 -> grafica.get(rowIndex).getTipoRAM();
            default -> null;
        };
    }
    
}