package modelo.proyprog;

public class Cliente extends Persona {

    private float saldo;
    private boolean socio;

    public Cliente(String dni, String nombre, String apellidos, long telefono, String email, String usuario, String contraseña, float saldo, boolean socio) {
        super(dni, nombre, apellidos, telefono, email, usuario, contraseña);
        this.saldo = saldo;
        this.socio = socio;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean isSocio() {
        return socio;
    }

    public void hacerPedido() {

    }

}
