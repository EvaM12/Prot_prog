package modelo.proyprog;

public class Producto {

    private String nombre;
    private float precio;
    private String marca;
    private int stock;

    public Producto(String nombre, float precio, String marca, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.stock = stock;
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

    public float calcularPVP() {
        return precio;
    }

}
