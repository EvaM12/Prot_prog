package productos;

import proyprog.Producto;
import java.util.*;

public class pantalla extends Producto{

   
    private float Tamaño;
    private int Resolucion;

    

    public pantalla(float Tamaño, int Resolucion, String nombre, float precio, String marca, int stock, float PVP) {
        super(nombre, precio, marca, stock, PVP);
        this.Tamaño = Tamaño;
        this.Resolucion = Resolucion;
    }
   
    public float getTamaño() {
        return Tamaño;
    }

    public void setTamaño(float Tamaño) {
        this.Tamaño = Tamaño;
    }

    public int getResolucion() {
        return Resolucion;
    }

    public void setResolucion(int Resolucion) {
        this.Resolucion = Resolucion;
    }

}
