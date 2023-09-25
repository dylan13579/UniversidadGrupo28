
package universidadgrupo28.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




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
        
        String sql = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";

    try {
        PreparedStatement ps = red.prepareStatement(sql);
        
        ps.setString(1, materia.getNombre());
        ps.setInt(2, materia.getAnioMateria());
        ps.setBoolean(3, materia.isEstado());
        ps.setInt(4, materia.getIdMateria());

        int modi = ps.executeUpdate();

        if (modi == 1) {
            JOptionPane.showMessageDialog(null, "Materia modificada");
        } else {
            JOptionPane.showMessageDialog(null, "La materia no pudo ser modificada");
        }

        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia: " + ex.getMessage());
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
   
    
    public Materia buscarMateria(int id){
        String sql="SELECT  nombre, año FROM materia WHERE idMateria = ? AND estado = 1 ";
        
        Materia materia=null;
        
        try {
            PreparedStatement ps=red.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                materia=new Materia();
                materia.setIdMateria(id);              
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(true);
     
            }else {
                JOptionPane.showMessageDialog(null, "No exixte la materia con ese ID");
            }
           
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla materia"+ex.getMessage());
        }
        return materia;
        
    } 
    
    public Materia buscarMateriaPorNombre(String nombre){
        String sql = "SELECT idMateria, nombre, año FROM materia WHERE nombre = ? AND estado = 1";
        
        Materia materia=null;
         try {
         PreparedStatement ps = red.prepareStatement(sql);
         ps.setString(1, nombre);
         ResultSet rs = ps.executeQuery();
         
          if (rs.next()) {
            materia = new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnioMateria(rs.getInt("año"));
            materia.setEstado(true);
             
          }else{
              JOptionPane.showMessageDialog(null, "No existe esta materia");
          }
          ps.close();
         } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia: " + ex.getMessage());
        }
         return materia;
          
    }
    
            
    public Materia buscarMateriaPorAnio (int año){
            
          String sql="SELECT idMateria, nombre, año FROM materia WHERE año = ? AND estado = 1";
            
            Materia materia=null;
            
        try {
            PreparedStatement ps=red.prepareStatement(sql);
            
            ps.setInt(1, año);
            ResultSet rs=ps.executeQuery();
            
              if(rs.next()){
                materia=new Materia();
                materia.setIdMateria(año);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materia.setEstado(true);
     
               }else {
                JOptionPane.showMessageDialog(null, "No existe el año de es materia");
               }
            ps.close();
          } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
          }
          return materia;
          
    }
      
    public List<Materia> listarMateria(){
        String sql="SELECT idMateria, nombre, año FROM materia WHERE estado = 1";
        
         ArrayList<Materia> materias= new ArrayList<>();
         
        try {
            PreparedStatement ps=red.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
                
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setIdMateria(rs.getInt("año"));
                materia.setEstado(true);
                
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder ala tabla materia");
        }
         return materias;
    }
    
    
}
        

  
            
            


