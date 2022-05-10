package modelo.proyprog;

import java.util.Date;


/**
 * 
 */
public class Compra extends Pedido {

    /**
     * Default constructor
     */
    public Compra(int IDPedido, String estado, Date fecha, String proveedor) {
        super(IDPedido, estado, fecha, proveedor);
        this.proveedor = proveedor;
    }
    
    public String getProveedor() {
        return proveedor;
    }

    private String proveedor;

}
