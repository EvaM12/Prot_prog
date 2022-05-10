package productos;

import proyprog.Producto;
import java.util.*;

public class PlacaBase extends Producto{

    public PlacaBase(String Socket, String Tipo, String nombre, float precio, String marca, int stock, float PVP) {
        super(nombre, precio, marca, stock, PVP);
        this.Socket = Socket;
        this.Tipo = Tipo;
    }

    public String getSocket() {
        return Socket;
    }

    public void setSocket(String Socket) {
        this.Socket = Socket;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    private String Socket;
    private String Tipo;
}
