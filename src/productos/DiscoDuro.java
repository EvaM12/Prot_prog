package productos;

import proyprog.Producto;
import java.util.*;

public class DiscoDuro extends Producto{

    public DiscoDuro(String Tipo, int Capacidad, float VelocidadLectura, float VelocidadEscritura, String nombre, float precio, String marca, int stock, float PVP) {
        super(nombre, precio, marca, stock, PVP);
        this.Tipo = Tipo;
        this.Capacidad = Capacidad;
        this.VelocidadLectura = VelocidadLectura;
        this.VelocidadEscritura = VelocidadEscritura;
    }


    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public float getVelocidadLectura() {
        return VelocidadLectura;
    }

    public void setVelocidadLectura(float VelocidadLectura) {
        this.VelocidadLectura = VelocidadLectura;
    }

    public float getVelocidadEscritura() {
        return VelocidadEscritura;
    }

    public void setVelocidadEscritura(float VelocidadEscritura) {
        this.VelocidadEscritura = VelocidadEscritura;
    }

    private String Tipo;
    private int Capacidad;
    private float VelocidadLectura;
    private float VelocidadEscritura;
}
