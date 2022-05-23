/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;
import dao.exception.ErrorConectarDB;
import dao.exception.ErrorCrearPersona;
import dao.exception.ErrorCrearProducto;
import dao.exception.ErrorEliminarProducto;
import modelo.*;
/**
 *
 * @author Alumno
 */
public class PruebaDB {
    public static void main (String[]args) throws ErrorCrearPersona, ErrorCrearProducto, ErrorEliminarProducto {
        try {
            Tienda tienda = new Tienda();
            Producto e = new DiscoDuro("sdkl", 0, 0, 0, "aaaaa", 0, "dddd", 0);
            tienda.annadirProducto(e);
            tienda.eliminarProducto(e);
        } catch(ErrorConectarDB e) {
            
        }
    }
}
