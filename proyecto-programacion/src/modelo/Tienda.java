package modelo;

import dao.DAOTienda;
import dao.exception.*;
import java.util.*;

public class Tienda {

    private ArrayList<Pedido> pedidos;
    private ArrayList<Producto> productos;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Tienda() {
        this.pedidos = new ArrayList<>();
        this.productos = DAOTienda.getInstancia().getProductos();
        this.empleados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }
    
    public String[][] getTabla() {
        String[][] tabla = new String [productos.size()][4];
        for (int i = 0; i < productos.size(); i++) {
            Producto aux = productos.get(i);
            tabla[i][0] = aux.getNombre();
            tabla[i][1] = aux.getMarca();
            tabla[i][2] = ""+aux.getPrecio();
            tabla[i][3] = ""+aux.getStock();
        }
        
        return tabla;
    }

    public void annadirPedidos(Pedido p) throws ErrorCrearPedido, ErrorCrearDetallePedido, ErrorConectarDB {
        pedidos.add(p);
        DAOTienda.getInstancia().crearPedido(p);
    }

    public void annadirProducto(Producto p) throws ErrorCrearProducto, ErrorConectarDB {
        productos.add(p);
        DAOTienda.getInstancia().crearProducto(p);
        
    }

    public void eliminarProducto(Producto p) throws ErrorEliminarProducto, ErrorConectarDB {
        DAOTienda.getInstancia().eliminarProducto(p);
        productos.remove(p);
    }

    public void annadirEmpleado(Empleado e) throws ErrorCrearPersona, ErrorConectarDB {
        empleados.add(e);
        DAOTienda.getInstancia().crearPersona(e);
    }

    public void eliminarEmpleado(Empleado e) throws ErrorConectarDB {
       DAOTienda.getInstancia().eliminarPersona(e);
        empleados.remove(e);
    }
    
    public Empleado buscarEmpleado(String dni) throws ErrorConectarDB {
        return DAOTienda.getInstancia().buscarEmpleado(dni);
    }

    public void annadirCliente(Cliente c) throws ErrorCrearPersona, ErrorConectarDB {
        clientes.add(c);
        DAOTienda.getInstancia().crearPersona(c);
    }
}
