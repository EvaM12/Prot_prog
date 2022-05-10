package modelo.proyprog;

/**
 * 
 */
public class Cliente extends Persona {

    /**
     * Default constructor
     */
    public Cliente(String dni, String nombre, String apellidos, long telefono, String email,String usuario, String contraseña, float saldo, boolean socio) {
        super(dni, nombre, apellidos, telefono, email, usuario, contraseña);
        this.saldo = saldo;
        this.socio = socio;
    }

    private float saldo;

    private boolean socio;

    public void hacerPedido() {
        // TODO implement here
    }

}
