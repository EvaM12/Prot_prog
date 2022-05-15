package modelo.productos;

import modelo.proyprog.Producto;

public class DiscoDuro extends Producto {

    private String tipo;
    private int capacidad;
    private float velocidadLectura;
    private float velocidadEscritura;

    public DiscoDuro(String Tipo, int Capacidad, float VelocidadLectura, float VelocidadEscritura, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.tipo = Tipo;
        this.capacidad = Capacidad;
        this.velocidadLectura = VelocidadLectura;
        this.velocidadEscritura = VelocidadEscritura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.capacidad = Capacidad;
    }

    public float getVelocidadLectura() {
        return velocidadLectura;
    }

    public void setVelocidadLectura(float VelocidadLectura) {
        this.velocidadLectura = VelocidadLectura;
    }

    public float getVelocidadEscritura() {
        return velocidadEscritura;
    }

    public void setVelocidadEscritura(float VelocidadEscritura) {
        this.velocidadEscritura = VelocidadEscritura;
    }
    
    @Override
    public float pvp() {
        return super.pvp() * 1.15f;
    }
}
