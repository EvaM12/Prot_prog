package modelo;

import java.util.Date;

public class Compra extends Pedido {
    private static int contador = 0;
    
    public Compra(Date fecha) {
        super(contador + 1, fecha);
        contador++;
    }
    
}
