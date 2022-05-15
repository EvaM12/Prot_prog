package dao;

import dao.exception.*;
import java.sql.*;
import modelo.productos.*;
import modelo.proyprog.*;

public class DAOTienda {

    static DAOTienda instancia = null;

    public DAOTienda() {

    }

    //CREAR PERSONA
    public void crearPersona(Persona p) throws ErrorCrearPersona {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into persona values('"
                    + p.getDni() + "', '"
                    + p.getNombre() + "', '"
                    + p.getApellidos() + "', "
                    + Long.toString(p.getTelefono()) + ", '"
                    + p.getEmail() + "')"
            );

            if (p instanceof Cliente) {
                crearCliente((Cliente) p);
            } else {
                crearEmpleado((Empleado) p);
            }
        } catch (SQLException e) {
            throw new ErrorCrearPersona();
        }
    }

    public void crearCliente(Cliente c) throws ErrorCrearPersona {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into Cliente values('"
                    + c.getDni() + "', '"
                    + c.isSocio() + ")"
            );
        } catch (SQLException e) {
            throw new ErrorCrearPersona();
        }
    }

    public void crearEmpleado(Empleado e) throws ErrorCrearPersona {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into Empleado values('"
                    + e.getDni() + "', '"
                    + e.getSalario() + ", "
                    + e.isAdministrador() + ", '"
                    + e.getContrasenna() + "')"
            );
        } catch (SQLException a) {
            throw new ErrorCrearPersona();
        }
    }

    public void eliminarPersona(Persona p) {
        try {
            if (p instanceof Cliente) {
                eliminarCliente((Cliente) p);
            }
            if (p instanceof Empleado) {
                eliminarEmpleado((Empleado) p);
            }
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from Persona where dni = '"
                    + p.getDni() + "')"
            );

        } catch (SQLException e) {

        }
    }

    public void eliminarEmpleado(Empleado c) {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from Empleado where dni = '"
                    + c.getDni() + "')"
            );
        } catch (SQLException e) {

        }
    }

    public void eliminarCliente(Cliente c) {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from Cliente where dni = '"
                    + c.getDni() + "')"
            );
        } catch (SQLException e) {

        }
    }

    //CREAR PRODUCTO-------------------------------------------------------------------------
    public void crearProducto(Producto p) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into Producto values('"
                    + p.getNombre() + "', "
                    + Float.toString(p.getPrecio()) + ", '"
                    + p.getMarca() + "', "
                    + Integer.toString(p.getStock()) + ", "
                    + Float.toString(p.pvp()) + ")"
            );
            if (p instanceof PlacaBase) {
                crearPlacaBase((PlacaBase) p);
            }
            if (p instanceof DiscoDuro) {
                crearDiscoDuro((DiscoDuro) p);
            }
            if (p instanceof Alimentacion) {
                crearAlimentacion((Alimentacion) p);
            }
            if (p instanceof Caja) {
                crearCaja((Caja) p);
            }
            if (p instanceof Grafica) {
                crearGrafica((Grafica) p);
            }
            if (p instanceof Pantalla) {
                crearPantalla((Pantalla) p);
            }
            if (p instanceof Procesador) {
                crearProcesador((Procesador) p);
            }
            if (p instanceof Ram) {
                crearRam((Ram) p);
            }
            if (p instanceof Raton) {
                crearRaton((Raton) p);
            }
            if (p instanceof Refrigeracion) {
                crearRefrigeracion((Refrigeracion) p);
            }
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearPlacaBase(PlacaBase p) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into placa_base values ('"
                    + p.getNombre() + "', '"
                    + p.getSocket() + "', '"
                    + p.getTipo() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearDiscoDuro(DiscoDuro d) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into disco_duro values ('"
                    + d.getNombre() + "', '"
                    + d.getTipo() + "', "
                    + d.getCapacidad() + ", "
                    + d.getVelocidadLectura() + ", "
                    + d.getVelocidadEscritura() + ")"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearAlimentacion(Alimentacion a) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into fuente_alimentacion values ('"
                    + a.getNombre() + "', '"
                    + a.getCertificacion() + "', "
                    + a.getPotencia() + ")"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearCaja(Caja c) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into caja values ('"
                    + c.getNombre() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearGrafica(Grafica g) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into grafica values ('"
                    + g.getNombre() + "', "
                    + g.getMemoria() + ", "
                    + g.getFrecuencia() + ",'"
                    + g.getTipoRAM() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearPantalla(Pantalla p) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into pantalla values ('"
                    + p.getNombre() + "', "
                    + p.getTamaño() + ", '"
                    + p.getResolucion() + "', "
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearProcesador(Procesador p) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into procesador values ('"
                    + p.getNombre() + "', '"
                    + p.getSocket() + "', "
                    + p.getFrecuencia() + ", "
                    + p.getNucleos() + ", "
                    + p.getHilos() + ")"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearRam(Ram r) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into Ram values (' "
                    + r.getNombre() + "', '"
                    + r.getTipo() + "', "
                    + r.getFrecuencia() + ", "
                    + r.getCapacidad() + ", "
                    + r.getLatencia() + ")"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearRaton(Raton r) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into Raton values (' "
                    + r.getNombre() + "', '"
                    + r.getSensor() + "', "
                    + r.getDPi() + ")"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearRefrigeracion(Refrigeracion r) throws ErrorCrearProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into Refrigeracion values ('"
                    + r.getNombre() + "', '"
                    + r.getTipo() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }
    //--------------------------------------------------------------------------------------

    public static Empleado buscarEmpleado(String dni) {
        Empleado temporal = null;
        try {
            ResultSet rs = ConexionDB.getInstancia().getStatement().executeQuery("select cliente.*, dni_empleado, contrasenna_empleado, salario_empleado, administrador_empleado from cliente,empleado where dni_persona = '"
                    + dni + "')"
            );
            if (rs.next()) {
                temporal = new Empleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getFloat(7), rs.getBoolean(8));
            }
        } catch (SQLException e) {

        }
        return temporal;
    }

    public void crearPedido(Pedido p) throws ErrorCrearPedido, ErrorCrearDetallePedido {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into Pedido values ("
                    + Integer.toString(p.getIDPedido()) + ", "
                    + Float.toString(p.precioTotal()) + ", '"
                    + p.getFecha() + "')"
            );
            for (Producto producto : p.getProductos()) {
                crearDetallePedido(p, producto);
            }
        } catch (SQLException e) {
            throw new ErrorCrearPedido();
        }
    }

    public void crearDetallePedido(Pedido pedido, Producto producto) throws ErrorCrearDetallePedido {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("insert into DetallePedidos values ("
                    + Integer.toString(pedido.getIDPedido()) + " '"
                    + producto.getNombre() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearDetallePedido();
        }
    }

    //ELIMINAR PRODUCTOS
    public void eliminarProducto(Producto p) throws ErrorEliminarProducto {

        try {
            if (p instanceof Alimentacion) {
                borrarAlimentacion((Alimentacion) p);
            }
            if (p instanceof Caja caja) {
                borrarCaja(caja);
            }
            if (p instanceof DiscoDuro) {
                borrarDiscoDuro((DiscoDuro) p);
            }
            if (p instanceof Grafica) {
                borrarGrafica((Grafica) p);
            }
            if (p instanceof Pantalla) {
                borrarPantalla((Pantalla) p);
            }
            if (p instanceof PlacaBase) {
                borrarPlacaBase((PlacaBase) p);
            }
            if (p instanceof Procesador) {
                borrarProcesador((Procesador) p);
            }
            if (p instanceof Ram) {
                borrarRam((Ram) p);
            }
            if (p instanceof Raton) {
                borrarraton((Raton) p);
            }
            if (p instanceof Refrigeracion) {
                borrarRefigeracion((Refrigeracion) p);
            }
            if (p instanceof Teclado) {
                borrarTeclado((Teclado) p);
            }
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from Producto where nombre='"
                    + p.getNombre()
            );
        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarAlimentacion(Alimentacion a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from placa_base where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarCaja(Caja a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from caja where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarDiscoDuro(DiscoDuro a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from disco_duro where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarGrafica(Grafica a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from grafica where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarPantalla(Pantalla a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from pantalla where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarPlacaBase(PlacaBase a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from placa_base where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarProcesador(Procesador a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from procesador where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarRam(Ram a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from ram where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarraton(Raton a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from raton where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarRefigeracion(Refrigeracion a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from refigeracion where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarTeclado(Teclado a) throws ErrorEliminarProducto {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate("delete from teclado where nombre='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }
    
    public static DAOTienda getInstancia() {
        if(instancia == null) {
            instancia = new DAOTienda();
        } 
        return instancia;
    }
}
