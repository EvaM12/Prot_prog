package modelo;


public class Pantalla extends Producto {

    private float tamanno;
    private String resolucion;

    public Pantalla(float Tamaño, String Resolucion, String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
        this.tamanno = Tamaño;
        this.resolucion = Resolucion;
    }

    public float getTamaño() {
        return tamanno;
    }

    public void setTamaño(float Tamaño) {
        this.tamanno = Tamaño;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String Resolucion) {
        this.resolucion = Resolucion;
    }
    
    @Override
    public float pvp() {
        return super.pvp() * 1.05f;
    }

}
