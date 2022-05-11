package modelo.productos;

import modelo.proyprog.Producto;

public class teclado {

    private String tipo;
    
    public teclado(String nombre, float precio, String marca, int stock, String tipo) {
        super(nombre, precio, marca, stock);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
}
