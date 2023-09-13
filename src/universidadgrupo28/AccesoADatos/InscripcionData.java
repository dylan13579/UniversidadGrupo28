
package universidadgrupo28.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo28.Entidades.Inscripciones;



public class InscripcionData {
    
   private Connection red = null;
   
   public InscripcionData(){
      
       
       this.red=Conexion.getConexion();
       
   }
  
  public void guardarInscripcion(Inscripciones insc){
      
      String sql="INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?,?,?)";
      
       try {
           PreparedStatement ps= red.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, insc.getAlumno().getIdAlumno());
           ps.setInt(2, insc.getMateria().getIdMateria());
           ps.setDouble(3, insc.getNota());
           ps.executeUpdate();
           
           ResultSet rs=ps.getGeneratedKeys();
           if(rs.next()){
               insc.setIdInscripcion(rs.getInt(1));
               JOptionPane.showMessageDialog(null, "Inscripcion Registrada");
           }
           ps.close();
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripciones");
       }
      
      
  }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
        String sql="UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMAteria = ?";
        
       try {
           PreparedStatement ps=red.prepareStatement(sql);
           ps.setDouble(1, nota);
           ps.setInt(2, idAlumno);
           ps.setInt(3, idMateria);
           
           int f=ps.executeUpdate();
           if(f>0){
              JOptionPane.showMessageDialog(null, "Nota actualizada");
          } 
           ps.close();
           
                   } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
       }
    }
  
}

   

