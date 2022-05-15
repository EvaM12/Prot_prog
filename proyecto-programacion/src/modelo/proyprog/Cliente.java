package modelo.proyprog;

public class Cliente extends Persona {

    private boolean socio;

    public Cliente(String dni, String nombre, String apellidos, long telefono, String email, boolean socio) {
        super(dni, nombre, apellidos, telefono, email);
        this.socio = socio;
    }

    public boolean isSocio() {
        return socio;
    }
}
