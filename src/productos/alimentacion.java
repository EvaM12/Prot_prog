package productos;

import proyprog.Producto;
import java.util.*;

public class alimentacion extends Producto{

    public alimentacion(String Certificacion, float Potencia, String nombre, float precio, String marca, int stock, float PVP) {
        super(nombre, precio, marca, stock, PVP);
        this.Certificacion = Certificacion;
        this.Potencia = Potencia;
    }

    public String getCertificacion() {
        return Certificacion;
    }

    public void setCertificacion(String Certificacion) {
        this.Certificacion = Certificacion;
    }

    public float getPotencia() {
        return Potencia;
    }

    public void setPotencia(float Potencia) {
        this.Potencia = Potencia;
    }

    private String Certificacion;
    private float Potencia;

}

