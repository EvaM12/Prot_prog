package modelo.proyprog;

import java.util.*;

public class Pedido {

    private int IDPedido;
    private ArrayList<Producto> productos;
    private String estado;
    private Date fecha;

    public Pedido(int IDPedido, String estado, Date fecha) {
        this.IDPedido = IDPedido;
        this.productos = new ArrayList<>();
        this.estado = estado;
        this.fecha = fecha;
    }

    public int getIDPedido() {
        return IDPedido;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public String getEstado() {
        return estado;
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

    public void calcularPrecio() {

    }
     public Float precioTotal(){
        float precioTotal=0;
        for(int i=0;i<productos.size();i++){
            precioTotal += productos.get(i).calcularPVP();
           
        } 
        return precioTotal;
    }

}
