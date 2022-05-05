package proyprog;

import java.util.*;

/**
 *
 */
public abstract class Producto {

    public Producto() {
    }

    private String nombre;

    private float precio;

    private String marca;

    private int stock;

    private float PVP;

    public void CalcularPrecio() {
        // TODO implement here
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String name) {
        nombre = name;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float price) {
        precio = price;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String brand) {
        marca = brand;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int cant) {
        stock = cant;
    }

    public float getPVP() {
        return PVP;
    }

    public void setPVP(float pvp) {
        PVP = pvp;
    }

}
