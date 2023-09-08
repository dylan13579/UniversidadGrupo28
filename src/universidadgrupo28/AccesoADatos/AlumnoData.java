
package universidadgrupo28.AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import universidadgrupo28.Entidades.Alumno;



public class AlumnoData {
    private Connection red = null;
    public AlumnoData (){
        red = Conexion.getConexion();
        
    
    }
    public void guardarAlumno (Alumno alumno){
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNac, estado) VALUES (?, ?, ?, ?, ?)";
    try {
        PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, alumno.getdni());
        ps.setString(2, alumno.getapellido());
        ps.setString(3, alumno.getnombre());
        ps.setDate(4, Date.valueOf(alumno.getfechaNac()));
        ps.setBoolean(5, alumno.isestado());
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        
        if (rs.next()) {
            alumno.setIdAlumno(rs.getInt("idAlumno"));
        JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");}
        ps.close();

    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());}    
        
    
    }
    
    
}
