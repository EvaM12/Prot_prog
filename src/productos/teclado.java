package modelo.productos;


public class teclado {

    private String tipo;
    
    public teclado(String nombre, float precio, String marca, int stock, float pvp, String tipo) {
        super(nombre, precio, marca, stock, pvp);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
}
