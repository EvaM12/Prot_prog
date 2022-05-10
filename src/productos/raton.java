package productos;

import proyprog.Producto;
import java.util.*;

public class raton extends Producto{

    private String Sensor;
    private int DPi;

    public String getSensor() {
        return Sensor;
    }

    public void setSensor(String Sensor) {
        this.Sensor = Sensor;
    }

    public int getDPi() {
        return DPi;
    }

    public void setDPi(int DPi) {
        this.DPi = DPi;
    }

    public raton(String Sensor, int DPi, String nombre, float precio, String marca, int stock, float PVP) {
        super(nombre, precio, marca, stock, PVP);
        this.Sensor = Sensor;
        this.DPi = DPi;
    }

}

