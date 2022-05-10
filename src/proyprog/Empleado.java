package modelo.proyprog;


/**
 * 
 */
public class Empleado extends Persona {

    /**
     * Default constructor
     */
    public Empleado(String dni, String nombre, String apellidos, long telefono, String email,String usuario, String contraseña, float salario, boolean gestor) {
        super(dni, nombre, apellidos, telefono, email, usuario, contraseña);
        this.salario = salario;
        this.gestor = gestor;
    }

    public float getSalario() {
        return salario;
    }

    public boolean isGestor() {
        return gestor;
    }

    private float salario;

    private boolean gestor;

}
