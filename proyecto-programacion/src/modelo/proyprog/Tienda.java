package modelo.proyprog;

import dao.ConexionDB;
import dao.DAOTienda;
import dao.exception.*;
import java.util.*;

public class Tienda {

    static Tienda instancia;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Producto> productos;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    private Tienda() throws ErrorConectarDB {
        ConexionDB.conectar();
        this.pedidos = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void annadirPedidos(Pedido p) {
        pedidos.add(p);
    }

    public void annadirProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(Producto p) throws ErrorEliminarProducto {
        DAOTienda.getInstancia().eliminarProducto(p);
        productos.remove(p);
    }

    public void annadirEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void eliminarEmpleado(Empleado e) {
        
        empleados.remove(e);
    }

    public void annadirCliente(Cliente c) {
        clientes.add(c);
    }
    
    public static Tienda getInstancia() throws ErrorConectarDB {
        if (instancia == null) {
            instancia = new Tienda();
        }
        return instancia;
    }
}
