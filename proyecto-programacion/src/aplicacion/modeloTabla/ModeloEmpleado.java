
package aplicacion.modeloTabla;

import dao.DAOTienda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Empleado;


public class ModeloEmpleado extends AbstractTableModel {

    private List<Empleado> empleado;
    
    public ModeloEmpleado() {
        empleado = DAOTienda.getInstancia().getEmpleado();
    }
    
    @Override
    public int getRowCount() {
        return empleado.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
    @Override
    public String getColumnName(int column) {
        return switch (column) {
            case 0 -> "Nombre";
            case 1 -> "Apellidos";
            case 2 -> "Telefono";
            case 3 -> "Email";
            case 4 -> "Salario";
            case 5 -> "Administrador";
            default -> null;
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch(columnIndex) {
            case 0 -> empleado.get(rowIndex).getNombre();
            case 1 -> empleado.get(rowIndex).getApellidos();
            case 2 -> empleado.get(rowIndex).getTelefono();
            case 3 -> empleado.get(rowIndex).getEmail();
            case 4 -> empleado.get(rowIndex).getSalario();
            case 5 -> empleado.get(rowIndex).isAdministrador() ? "Si" : "No";
            default -> null;
        };
    }
    
}
