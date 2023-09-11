
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
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) "
                + "VALUES (?, ?, ?, ?, ?)";
    try {
        PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
        if (rs.next()) {
            alumno.setIdAlumno(rs.getInt(1));
        JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");}
        ps.close();

    } catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+e.getMessage());}    
        
    
    }
    
    public void modificarAlumno (Alumno alumno){
        
     
            String sql="UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? "
                    + "WHERE idAlumno = ?";
       try {
            PreparedStatement ps= red.prepareStatement(sql);
            ps.setInt(1,alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Alumno modificado");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
        
    }
    
    
}
