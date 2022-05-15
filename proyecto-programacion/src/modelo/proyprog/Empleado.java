package modelo.proyprog;

public class Empleado extends Persona {

    private String contrasenna;
    private float salario;
    private boolean administrador;
    

    public Empleado(String dni, String nombre, String apellidos, long telefono, String email, String contrasenna, float salario, boolean administrador) {
        super(dni, nombre, apellidos, telefono, email);
        this.salario = salario;
        this.administrador = administrador;
        this.contrasenna = contrasenna;
    }

    public float getSalario() {
        return salario;
    }

    public boolean isAdministrador() {
        return administrador;
    }
    
    public String getContrasenna() {
        return contrasenna;
    }
}
