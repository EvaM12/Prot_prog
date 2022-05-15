package modelo.proyprog;

import java.util.Date;

public class Compra extends Pedido {

    private String proveedor;

    public Compra(int IDPedido, String estado, Date fecha, String proveedor) {
        super(IDPedido, estado, fecha);
        this.proveedor = proveedor;
    }

    public String getProveedor() {
        return proveedor;
    }
}
