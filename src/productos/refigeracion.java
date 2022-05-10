package productos;

import proyprog.Producto;
import java.util.*;

public class refigeracion extends Producto{

    private String Tipo;

    public refigeracion(String Tipo, String nombre, float precio, String marca, int stock, float PVP) {
        super(nombre, precio, marca, stock, PVP);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    
}
