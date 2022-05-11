
package dao;
import dao.exception.*;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class ConexionDB {
    private Connection conn;
    private Statement stmt;
    static ConexionDB instancia;
    
    private ConexionDB() throws ErrorConectarDB {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Sin conexión con el driver.");
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/informatica", "root", "");
            stmt = conn.createStatement();
        } catch(SQLException e) {
            throw new ErrorConectarDB();
        }
    }
    
    public Connection getConnection() {
        return conn;
    }
    
    public Statement getStatement() {
        return stmt;
    }
    
    public ConexionDB instancia() {
        return instancia;
    }
    
    public static void conectar() throws ErrorConectarDB {
        if (instancia == null) {
            instancia = new ConexionDB();
        }
    }
    
    public static void desconectar() throws ErrorDesconectarDB {
        if (instancia != null) {
            try {
                instancia.stmt.close();
                instancia.conn.close();
                instancia = null;
            } catch (SQLException e) {
                throw new ErrorDesconectarDB();
            }
        }
    }
}
