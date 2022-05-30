package dao;

import dao.exception.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.*;

public class DAOTienda {

    static DAOTienda instancia = null;

    public DAOTienda() {

    }

    //CREAR PERSONA
    public void crearPersona(Persona p) throws ErrorCrearPersona, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate (
                    "insert into persona values ('"
                    + p.getDni() + "', '"
                    + p.getNombre() + "', '"
                    + p.getApellidos() + "', "
                    + p.getTelefono() + ", '"
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

    public void crearCliente(Cliente c) throws ErrorCrearPersona, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into Cliente values ('"
                    + c.getDni() + "', "
                    + c.isSocio() + ")"
            );
        } catch (SQLException e) {
            throw new ErrorCrearPersona();
        }
    }

    public void crearEmpleado(Empleado e) throws ErrorCrearPersona, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into Empleado values ('"
                    + e.getDni() + "', "
                    + e.getSalario() + ", "
                    + e.isAdministrador() + ", '"
                    + e.getContrasenna() + "')"
            );
        } catch (SQLException a) {
            throw new ErrorCrearPersona();
        }
    }

    public void eliminarPersona(Persona p) throws ErrorConectarDB {
        try {
            if (p instanceof Cliente) {
                eliminarCliente((Cliente) p);
            }
            if (p instanceof Empleado) {
                eliminarEmpleado((Empleado) p);
            }
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from Persona where dni_persona = '"
                    + p.getDni() + "'"
            );

        } catch (SQLException e) {

        }
    }

    public void eliminarEmpleado(Empleado c) throws ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from Empleado where dni_empleado = '"
                    + c.getDni() + "'"
            );
        } catch (SQLException e) {

        }
    }

    public void eliminarCliente(Cliente c) throws ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from Cliente where dni = '"
                    + c.getDni() + "'"
            );
        } catch (SQLException e) {

        }
    }
    
    public static Empleado buscarEmpleado(String dni) throws ErrorConectarDB {
        Empleado temporal = null;
        try {
            ResultSet rs = ConexionDB.getInstancia().getStatement().executeQuery(
                    "select persona.*, salario_empleado, administrador_empleado, contraseña_empleado from persona,empleado where dni_persona = '"
                    + dni + "' and dni_persona = dni_empleado"
            );
            if (rs.next()) {
                temporal = new Empleado(rs.getString(1), rs.getString(2), rs.getString(3), rs.getLong(4), rs.getString(5), rs.getFloat(6), rs.getBoolean(7), rs.getString(8));
            }
        } catch (SQLException e) {

        }
        return temporal;
    }

    //CREAR PRODUCTO-------------------------------------------------------------------------
    public void crearProducto(Producto p) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into Producto values ('"
                    + p.getNombre() + "', "
                    + p.getPrecio() + ", '"
                    + p.getMarca() + "', "
                    + p.getStock() + ", "
                    + p.pvp() + ")"
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

    public void crearPlacaBase(PlacaBase p) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into placa_base values ('"
                    + p.getNombre() + "', '"
                    + p.getSocket() + "', '"
                    + p.getTipo() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearDiscoDuro(DiscoDuro d) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into disco_duro values ('"
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

    public void crearAlimentacion(Alimentacion a) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into fuente_alimentacion values ('"
                    + a.getNombre() + "', '"
                    + a.getCertificacion() + "', "
                    + a.getPotencia() + ")"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearCaja(Caja c) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into caja values ('"
                    + c.getNombre() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearGrafica(Grafica g) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into grafica values ('"
                    + g.getNombre() + "', "
                    + g.getMemoria() + ", "
                    + g.getFrecuencia() + ",'"
                    + g.getTipoRAM() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearPantalla(Pantalla p) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into pantalla values ('"
                    + p.getNombre() + "', "
                    + p.getTamaño() + ", '"
                    + p.getResolucion() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearProcesador(Procesador p) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into procesador values ('"
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

    public void crearRam(Ram r) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into Ram values (' "
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

    public void crearRaton(Raton r) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into Raton values (' "
                    + r.getNombre() + "', '"
                    + r.getSensor() + "', "
                    + r.getDPi() + ")"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }

    public void crearRefrigeracion(Refrigeracion r) throws ErrorCrearProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into Refrigeracion values ('"
                    + r.getNombre() + "', '"
                    + r.getTipo() + "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearProducto();
        }
    }
    //-----------------------------------PEDIDOS--------------------------------------------

    

    public void crearPedido(Pedido p) throws ErrorCrearPedido, ErrorCrearDetallePedido, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into Pedido values ("
                    + p.getIDPedido() + ", "
                    + p.precioTotal() + ", '"
                    + p.getFecha() + "')"
            );
            for (Producto producto : p.getProductos()) {
                crearDetallePedido(p, producto);
            }
        } catch (SQLException e) {
            throw new ErrorCrearPedido();
        }
    }

    public void crearDetallePedido(Pedido pedido, Producto producto) throws ErrorCrearDetallePedido, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "insert into DetallePedido values ("
                    + Integer.toString(pedido.getIDPedido()) + " '"
                    + producto.getNombre() + "')"
                    //+ producto.getCantidad()+ "')"
            );
        } catch (SQLException e) {
            throw new ErrorCrearDetallePedido();
        }
    }

    //------------------------------------------------------ELIMINAR PRODUCTOS
    public void eliminarProducto(Producto p) throws ErrorEliminarProducto, ErrorConectarDB {

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
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from Producto where nombre_producto = '"
                    + p.getNombre() + "'"
            );
        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarAlimentacion(Alimentacion a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from fuente_alimentacion where nombre_fuente_alimentacion = '"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarCaja(Caja a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from caja where nombre_caja ='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarDiscoDuro(DiscoDuro a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from disco_duro where nombre_disco_duro='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarGrafica(Grafica a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from grafica where nombre_grafica='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarPantalla(Pantalla a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from pantalla where nombre_pantalla='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarPlacaBase(PlacaBase a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from placa_base where nombre_placa_base='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarProcesador(Procesador a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from procesador where nombre_procesador='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarRam(Ram a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from ram where nombre_ram='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarraton(Raton a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from raton where nombre_raton='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarRefigeracion(Refrigeracion a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from refigeracion where nombre_refrigeracion='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }

    public void borrarTeclado(Teclado a) throws ErrorEliminarProducto, ErrorConectarDB {
        try {
            ConexionDB.getInstancia().getStatement().executeUpdate(
                    "delete from teclado where nombre_teclado='"
                    + a.getNombre() + "'"
            );

        } catch (SQLException e) {
            throw new ErrorEliminarProducto();
        }
    }
    
   
    
    public List<Alimentacion> getAlimentacion() {
        List<Alimentacion> retorno = null;
        try {
            retorno = new ArrayList<>();
            String sentencia = "select producto.*, certificacion_fuente_alimentacion, potencia_fuente_alimentacion from producto, fuente_alimentacion where nombre_fuente_alimentacion = nombre_producto";
            PreparedStatement ps = ConexionDB.getInstancia().getConnection().prepareStatement(sentencia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                retorno.add(new Alimentacion(
                        rs.getString("certificacion_fuente_alimentacion"),
                        rs.getFloat("potencia_fuente_alimentacion"),
                        rs.getString("nombre_producto"),
                        rs.getFloat("precio_producto"),
                        rs.getString("marca_producto"),
                        rs.getInt("stock_producto")
                        )
                );
            }
        } catch (SQLException | ErrorConectarDB ex) {
        
        }
        return  retorno;
    }
    
    public List<Ram> getRam() {
        List<Ram> retorno = null;
        try {
            retorno = new ArrayList<>();
            String sentencia = "select producto.*, tipo_ram, frecuencia_ram, capacidad_ram, latencia_ram from producto, fuente_alimentacion where nombre_fuente_alimentacion = nombre_producto";
            PreparedStatement ps = ConexionDB.getInstancia().getConnection().prepareStatement(sentencia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                retorno.add(new Ram(
                        rs.getString("tipo_ram"),
                        rs.getFloat(""),
                        rs.getInt("nombre_producto"),
                        rs.getFloat("precio_producto"),
                        rs.getString("marca_producto"),
                        rs.getFloat("stock_producto"),
                        rs.getString(""),
                        rs.getInt("")
                        )
                );
            }
        } catch (SQLException | ErrorConectarDB ex) {
        
        }
        return  retorno;
    }
    
    
    public List<Procesador> getProcesador() {
    List<Procesador> retorno = null;
    try {
        retorno = new ArrayList<>();
        String sentencia = "select producto.*, socket_procesador, frecuencia_procesador, nucleos_procesador, hilos_procesador from producto, procesador where nombre_procesador = nombre_producto";
        PreparedStatement ps = ConexionDB.getInstancia().getConnection().prepareStatement(sentencia);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            retorno.add(new Procesador(
                    rs.getString("socket_procesador"),
                    rs.getFloat("frecuencia_procesador"),
                    rs.getInt("nucleos_procesador"),
                    rs.getInt("hilos_procesador"),
                    rs.getString("nombre_producto"),
                    rs.getFloat("precio_producto"),
                    rs.getString("marca_producto"),
                    rs.getInt("stock_producto")
                    )
            );
        }
    } catch (SQLException | ErrorConectarDB ex) {
    
    }
    return  retorno;
}

public List<PlacaBase> getPlaca_Base() {
    List<PlacaBase> retorno = null;
    try {
        retorno = new ArrayList<>();
        String sentencia = "select producto.*, socket, tipo from producto, placa_base where nombre_placa_base = nombre_producto";
        PreparedStatement ps = ConexionDB.getInstancia().getConnection().prepareStatement(sentencia);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
            retorno.add(new PlacaBase(
                    rs.getString("socket"),
                    rs.getString("tipo"),
                    rs.getString("nombre_producto"),
                    rs.getFloat("precio_producto"),
                    rs.getString("marca_producto"),
                    rs.getInt("stock_producto")
                    )
            );
        }
    } catch (SQLException | ErrorConectarDB ex) {
    
    }
    return  retorno;
}
    
    
    
    public List<Caja> getCaja() throws ErrorConectarDB{
        List<Caja> retorno = null;
        try{
            retorno=new ArrayList<>();
            String sentencia ="Select producto.* from producto , caja where nombre_producto=nombre";
            PreparedStatement ps=ConexionDB.getInstancia().getConnection().prepareStatement(sentencia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                retorno.add(new Caja(
                rs.getString("nombre_producto"),
                rs.getFloat("precio_producto"),
                rs.getString("marca_producto"),
                rs.getInt("stock_producto")
                )
                );
            }
        }
        catch(SQLException ex){
            
        }
        return retorno;
    }
    public List<DiscoDuro> getDiscoDuro() throws ErrorConectarDB{
        List<DiscoDuro> retorno= null;
        try{
            retorno=new ArrayList<>();
            String sentencia ="Select producto.*,tipo_disco_duro, capacidad_disco_duro,velLectura_disco_duro,velEscritura_disco_duro from producto , disco_duro where nombre_producto=nombre_disco_duro";
            PreparedStatement ps=ConexionDB.getInstancia().getConnection().prepareStatement(sentencia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                retorno.add(new DiscoDuro(
                        rs.getString("tipo_disco_duro"),
                        rs.getInt("  capacidad_disco_duro"),
                        rs.getInt("velLectura_disco_duro"),
                        rs.getInt("velEscritura_disco_duro"),
                rs.getString("nombre_producto"),
                rs.getFloat("precio_producto"),
                rs.getString("marca_producto"),
                rs.getInt("stock_producto")
                )
                );
            }
        }
        catch(SQLException ex){
            
        }
        return retorno;
    }    
    

public List<Grafica> getGrafica(){
        List<Grafica> retorno = null;
        try{
            retorno = new ArrayList<>();
            String sentencia = "select producto.*, memoria_grafica, frecuencia_grafica, tiporam_grafica from producto, grafica where nombre_producto = nombre_grafica ";
            PreparedStatement ps = ConexionDB.getInstancia().getConnection().prepareStatement(sentencia);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                retorno.add(new Grafica(
                        rs.getInt("memoria_grafica"),
                        rs.getFloat("frecuencia_grafica"),
                        rs.getString("tiporam_grafica"),
                        rs.getString("nombre_producto"),
                        rs.getFloat("precio_producto"),
                        rs.getString("marca_producto"),
                        rs.getInt("stock_producto")
                )
                );
            }
        }catch (SQLException | ErrorConectarDB ex) {
        
        }
        return  retorno;
    }
    public List<Pantalla> getPantalla() {
        List<Pantalla> retorno = null;
        try {
            retorno = new ArrayList<>();
            String sentencia = "select producto.*, tamaño_pantalla, resolucion_pantalla from producto,pantalla where nombre_pantalla = nombre_producto";
            PreparedStatement ps = ConexionDB.getInstancia().getConnection().prepareStatement(sentencia);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                retorno.add(new Pantalla(
                        rs.getFloat("tamaño_pantalla"),
                        rs.getInt("resolucion_pantalla"),
                        rs.getString("nombre_producto"),
                        rs.getFloat("precio__producto"),
                        rs.getString("marca_producto"),
                        rs.getInt("stock_producto")
                        )
                );
            }
        } catch (SQLException | ErrorConectarDB ex) {
        
        }
        return  retorno;
    }
    

    
    
    public static DAOTienda getInstancia() {
        if(instancia == null) {
            instancia = new DAOTienda();
        } 
        return instancia;
    }
}

