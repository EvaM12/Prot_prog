package modelo.productos;

import modelo.proyprog.Producto;

public class Refigeracion extends Producto {

    private String tipo;

    public Refigeracion(String Tipo, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.tipo = Tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

}
