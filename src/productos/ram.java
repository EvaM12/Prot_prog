package productos;

import proyprog.Producto;
import java.util.*;

public class ram extends Producto{

    public ram() {
    }

    private String tipo;

    private float frecuencia;

    private int capacidad;

    private float latencia;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String type) {
        tipo = type;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float freq) {
        frecuencia = freq;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int cap) {
        capacidad = cap;
    }

    public float getLatencia() {
        return latencia;
    }

    public void setLatencia(float late) {
        latencia = late;
    }

}
