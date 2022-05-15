package modelo.productos;

import modelo.proyprog.Producto;

public class Procesador extends Producto {

    private String socket;
    private float frecuencia;
    private int nucleos;
    private int hilos;

    public Procesador(String Socket, float Frecuencia, int Nucleos, int Hilos, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.socket = Socket;
        this.frecuencia = Frecuencia;
        this.nucleos = Nucleos;
        this.hilos = Hilos;
    }

    public String getSocket() {
        return socket;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public int getNucleos() {
        return nucleos;
    }

    public int getHilos() {
        return hilos;
    }

    public void setSocket(String Socket) {
        this.socket = Socket;
    }

    public void setFrecuencia(float Frecuencia) {
        this.frecuencia = Frecuencia;
    }

    public void setNucleos(int Nucleos) {
        this.nucleos = Nucleos;
    }

    public void setHilos(int Hilos) {
        this.hilos = Hilos;
    }
    
    @Override
    public float pvp() {
        return super.pvp() * 1.15f;
    }
}
