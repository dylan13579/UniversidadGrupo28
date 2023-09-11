
package universidadgrupo28;

import java.time.LocalDate;
import universidadgrupo28.AccesoADatos.AlumnoData;
import universidadgrupo28.Entidades.Alumno;




public class UniversidadGrupo28 {

    
    public static void main(String[] args) {
       
       
           Alumno estudiante=new Alumno(20,852967143,"Soria Rodriguez","Mirta Luna",LocalDate.of(1982, 4, 20), true);
           AlumnoData alu=new AlumnoData();
         //alu.guardarAlumno(estudiante);
         alu.modificarAlumno(estudiante);

        
    }
    
}
