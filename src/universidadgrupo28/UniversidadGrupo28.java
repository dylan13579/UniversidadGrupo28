
package universidadgrupo28;

import java.time.LocalDate;
import universidadgrupo28.AccesoADatos.AlumnoData;
import universidadgrupo28.Entidades.Alumno;




public class UniversidadGrupo28 {

    
    public static void main(String[] args) {
       
       
           Alumno estudiante=new Alumno(18,88236714,"Matilda","Alvares",LocalDate.of(1985, 6, 12), true);
           AlumnoData alu=new AlumnoData();
         //alu.guardarAlumno(estudiante);
         alu.modificarAlumno(estudiante);

        
    }
    
}
