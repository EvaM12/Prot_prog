package modelo;


public class Ram extends Producto {

    private String tipo;
    private float frecuencia;
    private int capacidad;
    private String latencia;

    public Ram(String tipo, float frecuencia, int capacidad, String latencia, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.tipo = tipo;
        this.frecuencia = frecuencia;
        this.capacidad = capacidad;
        this.latencia = latencia;
    }

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

    public String getLatencia() {
        return latencia;
    }

    public void setLatencia(String late) {
        latencia = late;
    }
    
    @Override
    public float pvp() {
        return super.pvp() * 1.15f;
    }
}
