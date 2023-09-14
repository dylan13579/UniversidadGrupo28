
package universidadgrupo28.AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo28.Entidades.Alumno;
import universidadgrupo28.Entidades.Inscripciones;
import universidadgrupo28.Entidades.Materia;



public class InscripcionData {
    
   private Connection red = null;
   private MateriaData md=new MateriaData();
   private AlumnoData ad=new AlumnoData();
   
   
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
    
    public void borrarIncripcion (int idAlumno, int idMateria){
        
        String sql="DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
       try {

           PreparedStatement ps=red.prepareStatement(sql);
           ps.setInt(1, idAlumno);
           ps.setInt(2, idMateria);
           
           int filas=ps.executeUpdate();
           if(filas>0){
               JOptionPane.showMessageDialog(null, "Filas borradas con exito");
               

           }
            ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripcion");
        
       }
       
    }
    
    public List<Inscripciones> obtenerIncripcion(){
     
        ArrayList<Inscripciones> obtener=new ArrayList<>();
        
        String sql="SELECT * FROM inscripcion";
        
       try {
           PreparedStatement ps=red.prepareStatement(sql);
           ResultSet rs=ps.executeQuery();
           
           while(rs.next()){
               Inscripciones ins=new Inscripciones();
               ins.setIdInscripcion(rs.getInt("idInscripcion"));
               Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
               Materia met=md.buscarMateria(rs.getInt("idMateria"));
               ins.setAlumno(alu);
               ins.setMateria(met);
               ins.setNota(rs.getDouble("nota"));
               
               obtener.add(ins);
           }
           ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
       }
       return obtener;
    }
    
    public List<Inscripciones> obtenerIncripcionPorAlumno(int idAlumno){
     
        ArrayList<Inscripciones> obtener=new ArrayList<>();
        
        String sql="SELECT * FROM inscripcion WHERE idAlumno = ?";
        
       try {
           PreparedStatement ps=red.prepareStatement(sql);
           ps.setInt(1, idAlumno);
           ResultSet rs=ps.executeQuery();
           
           while(rs.next()){
               Inscripciones ins=new Inscripciones();
               ins.setIdInscripcion(rs.getInt("idInscripcion"));
               Alumno alu=ad.buscarAlumno(rs.getInt("idAlumno"));
               Materia mat=md.buscarMateria(rs.getInt("idMateria"));
               ins.setAlumno(alu);
               ins.setMateria(mat);
               ins.setNota(rs.getDouble("nota"));
               
               obtener.add(ins);
           }
           ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
       }
       return obtener;
    }
    
    public List<Materia> obternerMateriasCursadas(int idAlumno){
        
        ArrayList<Materia> materias=new ArrayList<>();
        
        String sql="SELECT inscripcion.idMateria, nombre, año FROM inscripcion,"
                + " materia WHERE inscripcion.idMateria = materia.idMateria"
                + " AND inscripcion.idAlumno = ?;";
        
        
       try {
           PreparedStatement ps=red.prepareStatement(sql);
           ps.setInt(1, idAlumno);
           ResultSet rs=ps.executeQuery();
           
            while(rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                
                materias.add(materia);
            }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
       }
       return materias;
    }
    
    public List<Materia> obternerMateriasNoCursadas(int idAlumno){
        
        ArrayList<Materia> materias=new ArrayList<>();
        
        String sql="SELECT * FROM materia WHERE estado = 1 AND idMateria not in"
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        
         try {
           PreparedStatement ps=red.prepareStatement(sql);
           ps.setInt(1, idAlumno);
           ResultSet rs=ps.executeQuery();
           
            while(rs.next()){
                Materia materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                
                materias.add(materia);
            }
            ps.close();
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
       }
       return materias;
    }
    
    public ArrayList<Alumno> obternerAlumnosPorMaterias(int idMateria){
        
        ArrayList<Alumno> alumnosMateria=new ArrayList<>();
        
        String sql="SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado FROM inscripcion i,alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ? AND a.estado = 1";
        
       try {
           PreparedStatement ps=red.prepareStatement(sql);
           ps.setInt(1, idMateria);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
               
               Alumno alumno=new Alumno();
               alumno.setIdAlumno(rs.getInt("idAlumno"));
               alumno.setApellido(rs.getString("apellido"));
               alumno.setNombre(rs.getString("nombre"));
               alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
               alumno.setActivo(rs.getBoolean("estado"));
               
               alumnosMateria.add(alumno);
           }
           ps.close();
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");
       }
       return alumnosMateria;
    }
}
    
       




