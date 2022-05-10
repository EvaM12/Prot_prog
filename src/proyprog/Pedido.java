package proyprog;
import java.util.*;

/**
 * 
 */
public class Pedido {

    private int IDPedido;    
    private ArrayList<Producto> Productos;
    private String estado;
    private Date Fecha;
    
    public Pedido(int IDPedido, String estado, Date Fecha) {
        IDPedido = this.IDPedido;
        Productos = new ArrayList();
        estado = this.estado;
        Fecha = this.Fecha;
    }    

    public void calcularPrecio() {
        // TODO implement here
    }

}
