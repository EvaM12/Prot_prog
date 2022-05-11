package modelo.productos;

import modelo.proyprog.Producto;

public class Raton extends Producto {

    private String sensor;
    private int dpi;

    public Raton(String Sensor, int DPi, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.sensor = Sensor;
        this.dpi = DPi;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String Sensor) {
        this.sensor = Sensor;
    }

    public int getDPi() {
        return dpi;
    }

    public void setDPi(int DPi) {
        this.dpi = DPi;
    }

}
