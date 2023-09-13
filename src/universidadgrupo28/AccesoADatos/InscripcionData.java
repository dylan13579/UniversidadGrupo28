
package universidadgrupo28.AccesoADatos;

import java.sql.Connection;



public class InscripcionData {
    
   private Connection red = null;
   private String sql;
   
   
   private InscripcionData(){
       red = Conexion.getConexion();
   }
   
  
  
}

   

