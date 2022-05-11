package modelo.proyprog;

import java.util.*;

public class Tienda {

    private ArrayList<Pedido> pedidos;
    private ArrayList<Producto> productos;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Tienda() {
        this.pedidos = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void AñadirPedidos(Pedido p) {
        pedidos.add(p);
    }

    public void AñadirProducto(Producto p) {
        productos.add(p);
    }

    public void EliminarProducto(Producto p) {
        productos.remove(p);
    }

    public void AñadirEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void EliminarEmpleado(Empleado e) {
        empleados.remove(e);
    }

    public void AñadirCliente(Cliente c) {
        clientes.add(c);
    }

    public void Contabilidad() {
        // TODO implement here
    }

}
