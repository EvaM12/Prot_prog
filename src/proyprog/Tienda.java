package proyprog;
import java.util.*;

/**
 *
 */
public class Tienda {

    public Tienda() {
        Pedidos = new ArrayList();
        Productos = new ArrayList();
        Empleados = new ArrayList();
        Clientes = new ArrayList();
    }

    private ArrayList<Pedido> Pedidos;
    private ArrayList<Producto> Productos;

    private ArrayList<Empleado> Empleados;
    private ArrayList<Cliente> Clientes;

    public void AñadirPedidos(Pedido p){
        Pedidos.add(p);
    }

    public void AñadirProducto(Producto p) {
        Productos.add(p);
    }
    
    public void EliminarProducto(Producto p) {
        Productos.remove(p);
    }

   
    public void AñadirEmpleado(Empleado e) {
        Empleados.add(e);
    }
    
    public void EliminarEmpleado (Empleado e){
        Empleados.remove(e);
    }

   
    public void AñadirCliente(Cliente c) {
        Clientes.add(c);
    }
    public void Contabilidad() {
        // TODO implement here
    }

}
