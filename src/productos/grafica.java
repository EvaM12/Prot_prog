package productos;

import proyprog.Producto;
import java.util.*;

public class grafica extends Producto{

    public grafica(int Memoria, float Frecuencia, String TipoRAM, String nombre, float precio, String marca, int stock, float PVP) {
        super(nombre, precio, marca, stock, PVP);
        this.Memoria = Memoria;
        this.Frecuencia = Frecuencia;
        this.TipoRAM = TipoRAM;
    }

    private int Memoria;
    private float Frecuencia;
    private String TipoRAM;

    public int getMemoria() {
        return Memoria;
    }

    public void setMemoria(int Memoria) {
        this.Memoria = Memoria;
    }

    public float getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(float Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public String getTipoRAM() {
        return TipoRAM;
    }

    public void setTipoRAM(String TipoRAM) {
        this.TipoRAM = TipoRAM;
    }

}
