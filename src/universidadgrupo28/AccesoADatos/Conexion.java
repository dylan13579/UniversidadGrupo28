
package universidadgrupo28.AccesoADatos;

import java.sql.*;

import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String BD="universidad";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;

    static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private Conexion () {}
    
    public static Connection getConnection(){
        
        if(connection==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                
                connection = DriverManager.getConnection(URL+BD,USUARIO,PASSWORD);
                
                JOptionPane.showMessageDialog(null, "Conectado");
               
                
                
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Error al cargar DRIVER ");
            } catch (SQLException q) {
                JOptionPane.showMessageDialog(null, "Eror no se pudo conectar al DRIVER");
            }
        }
            return connection;
    }
  
    
}
