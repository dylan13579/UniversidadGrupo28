
package universidadgrupo28.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import universidadgrupo28.Entidades.Materia;


public class MateriaData {
    
    private Connection red = null;
    private String sql;
    
    public MateriaData(){
        red = Conexion.getConexion();
        
    }
    
    public void guaradarMateria (Materia materia){
         String sql= "INSERT INTO materia (nombre, año, estado)"
                    + "VALUES (?, ?, ?)";
        
        try {
           PreparedStatement ps = red.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
           ps.setString(1, materia.getNombre());
           ps.setInt(2, materia.getAnioMateria());
           ps.setBoolean(3,materia.isEstado());
           ps.executeUpdate();
           
           ResultSet rs=ps.getGeneratedKeys();
           if(rs.next()){
               materia.setIdMateria(rs.getInt(1));
               JOptionPane.showMessageDialog(null, "Se añadido un nueva materia");
               ps.close();
           }
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia"+ex.getMessage());
        }
      
    }
    
    public void modificarMateria (Materia materia ){
        
        String sql="UPDATE materia SET nombre = ?, año = ?"
                    + "WHERE idMateria = ?";
        
        try {

            PreparedStatement ps = red.prepareStatement(sql);
           
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
             ps.setInt(3, materia.getIdMateria());
            int modi = ps.executeUpdate();
            
            if(modi==1){
                JOptionPane.showMessageDialog(null, "Materia modificada");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
    
    public void elimnarMateria(int id){
         String sql="UPDATE materia SET estado = 0 WHERE idMateria = ?";
        try {
          
            
            PreparedStatement ps =red.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Se ha eliminado la materia");
            }
            
           } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
}
