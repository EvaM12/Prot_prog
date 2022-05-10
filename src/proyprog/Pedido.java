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
        this.IDPedido = IDPedido;
        Productos = new ArrayList();
        this.estado = estado;
        this.Fecha = Fecha;
    }

    public void calcularPrecio() {
        // TODO implement here
    }

}
