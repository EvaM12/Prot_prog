package modelo.productos;

import modelo.proyprog.Producto;

public class Pantalla extends Producto {

    private float tamanno;
    private int resolucion;

    public Pantalla(float Tamaño, int Resolucion, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.tamanno = Tamaño;
        this.resolucion = Resolucion;
    }

    public float getTamaño() {
        return tamanno;
    }

    public void setTamaño(float Tamaño) {
        this.tamanno = Tamaño;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int Resolucion) {
        this.resolucion = Resolucion;
    }

}
