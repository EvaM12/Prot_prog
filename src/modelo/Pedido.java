package modelo;

import java.util.*;

public class Pedido {

    private int IDPedido;
    private ArrayList<Producto> productos;
    private Date fecha;

    public Pedido(int IDPedido, Date fecha) {
        this.IDPedido = IDPedido;
        this.productos = new ArrayList<>();
        this.fecha = fecha;
    }

    public int getIDPedido() {
        return IDPedido;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void añadirProducto(Producto p) {
        productos.add(p);
    }

    public void eliminarProducto(Producto p) {
        productos.remove(p);
    }

    public float precioTotal() {
        float precio = 0;
        for (Producto producto : productos) {
            precio += producto.getPrecio();
        }
        return precio;
    }

}
