/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion;
import dao.exception.ErrorConectarDB;
import dao.exception.ErrorCrearPersona;
import modelo.proyprog.*;
/**
 *
 * @author Alumno
 */
public class PruebaDB {
    public static void main (String[]args) throws ErrorCrearPersona {
        try {
            Tienda tienda = new Tienda();
            Empleado a = new Empleado("79856783j" ,"Juan", "Garcia", 678469712, "juan@garcia", 1000, false, "1234");
            tienda.annadirEmpleado(a);
        } catch(ErrorConectarDB e) {
            
        }
    }
}
