package productos;

import proyprog.Producto;
import java.util.*;

public class procesador extends Producto{
    private String Socket;
    private float Frecuencia;
   private int Nucleos;
    private int Hilos;
    
    

    public String getSocket() {
        return Socket;
    }

    public float getFrecuencia() {
        return Frecuencia;
    }

    public int getNucleos() {
        return Nucleos;
    }

    public int getHilos() {
        return Hilos;
    }

    public void setSocket(String Socket) {
        this.Socket = Socket;
    }

    public void setFrecuencia(float Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public void setNucleos(int Nucleos) {
        this.Nucleos = Nucleos;
    }

    public void setHilos(int Hilos) {
        this.Hilos = Hilos;
    }


    public procesador(String Socket, float Frecuencia, int Nucleos, int Hilos, String nombre, float precio, String marca, int stock, float PVP) {
        super(nombre, precio, marca, stock, PVP);
        this.Socket = Socket;
        this.Frecuencia = Frecuencia;
        this.Nucleos = Nucleos;
        this.Hilos = Hilos;
    }

   
    
    

}

