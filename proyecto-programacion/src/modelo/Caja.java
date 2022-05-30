package modelo;


public class Caja extends Producto {

    public Caja(String nombre, float precio, String marca, int stock) {
        super(nombre, precio, marca, stock);
    }
    
    @Override
    public float pvp() {
        return super.pvp() + 1.15f;
    }
}
