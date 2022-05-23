package modelo;


public class Grafica extends Producto {

    private int memoria;
    private float frecuencia;
    private String tipoRAM;

    public Grafica(int Memoria, float Frecuencia, String TipoRAM, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.memoria = Memoria;
        this.frecuencia = Frecuencia;
        this.tipoRAM = TipoRAM;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int Memoria) {
        this.memoria = Memoria;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float Frecuencia) {
        this.frecuencia = Frecuencia;
    }

    public String getTipoRAM() {
        return tipoRAM;
    }

    public void setTipoRAM(String TipoRAM) {
        this.tipoRAM = TipoRAM;
    }
    
    @Override
    public float pvp() {
        return super.pvp() * 1.15f;
    }

}
