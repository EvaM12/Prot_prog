package proyprog;

import java.util.*;

/**
 *
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona(String Nombre, String Apellidos, String DNI, long Telefono, String Email, String Contraseña, String Usuario) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.Telefono = Telefono;
        this.Email = Email;
        this.Contraseña = Contraseña;
        this.Usuario = Usuario;
    }


    
    private String Nombre;

    private String Apellidos;

    private String DNI;

    private long Telefono;

    private String Email;

    private String Contraseña;

    private String Usuario;

}
