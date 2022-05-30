package modelo;

import java.util.Date;

public class Venta extends Pedido {

    private Persona cliente;
    private Persona empleado;

    public Venta(int IDPedido, String estado, Date fecha, Persona cliente, Persona empleado) {
        super(IDPedido, estado, fecha);
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public Persona getCliente() {
        return cliente;
    }

    public Persona getEmpleado() {
        return empleado;
    }
}
