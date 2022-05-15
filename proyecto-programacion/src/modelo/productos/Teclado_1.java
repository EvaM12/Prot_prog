package modelo.productos;

import modelo.proyprog.Producto;

public class Teclado extends Producto{

    private String tipo;
    
    public Teclado(String nombre, float precio, String marca, int stock, String tipo) {
        super(nombre, precio, marca, stock);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
}
