package modelo.proyprog;

import dao.ConexionDB;
import dao.DAOTienda;
import dao.exception.*;
import java.util.*;

public class Tienda {

    private ArrayList<Pedido> pedidos;
    private ArrayList<Producto> productos;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Tienda() throws ErrorConectarDB {
        ConexionDB.conectar();
        this.pedidos = new ArrayList<>();
        this.productos = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void annadirPedidos(Pedido p) throws ErrorCrearPedido, ErrorCrearDetallePedido {
        pedidos.add(p);
        DAOTienda.getInstancia().crearPedido(p);
    }

    public void annadirProducto(Producto p) throws ErrorCrearProducto {
        productos.add(p);
        DAOTienda.getInstancia().crearProducto(p);
        
    }

    public void eliminarProducto(Producto p) throws ErrorEliminarProducto {
        DAOTienda.getInstancia().eliminarProducto(p);
        productos.remove(p);
    }

    public void annadirEmpleado(Empleado e) throws ErrorCrearPersona {
        empleados.add(e);
        DAOTienda.getInstancia().crearPersona(e);
    }

    public void eliminarEmpleado(Empleado e) {
       DAOTienda.getInstancia().eliminarPersona(e);
        empleados.remove(e);
    }
    
    public Empleado buscarEmpleado(String dni) {
        return DAOTienda.getInstancia().buscarEmpleado(dni);
    }

    public void annadirCliente(Cliente c) throws ErrorCrearPersona {
        clientes.add(c);
        DAOTienda.getInstancia().crearPersona(c);
    }
}
