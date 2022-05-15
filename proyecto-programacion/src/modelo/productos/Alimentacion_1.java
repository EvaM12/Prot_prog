package modelo.productos;

import modelo.proyprog.Producto;

public class Alimentacion extends Producto {

    private String certificacion;
    private float potencia;

    public Alimentacion(String Certificacion, float Potencia, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.certificacion = Certificacion;
        this.potencia = Potencia;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String Certificacion) {
        this.certificacion = Certificacion;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float Potencia) {
        this.potencia = Potencia;
    }

    @Override
    public float pvp() {
        return super.pvp() * 1.15f;
    }
}
