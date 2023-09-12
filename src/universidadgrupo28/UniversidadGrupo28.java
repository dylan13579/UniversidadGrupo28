
package universidadgrupo28;

import java.time.LocalDate;
import universidadgrupo28.AccesoADatos.AlumnoData;
import universidadgrupo28.AccesoADatos.MateriaData;
import universidadgrupo28.Entidades.Alumno;
import universidadgrupo28.Entidades.Materia;




public class UniversidadGrupo28 {

    
    public static void main(String[] args) {
       
         
           //Alumno estudiante=new Alumno(20,852967143,"Soria Rodriguez","Mirta Luna",LocalDate.of(1982, 4, 20), true);
           //AlumnoData alu=new AlumnoData();
         //alu.guardarAlumno(estudiante);
         //alu.modificarAlumno(estudiante);
         //alu.eliminarALumno(20);
         //Alumno encontrado=alu.buscarAlumno(20);
         //Alumno encontrado=alu.buscarAlumnoPorDni(45612398);
         //if(encontrado!=null){
             
//         
//         System.out.println("dni = "+encontrado.getDni());
//         System.out.println("apellido = "+encontrado.getApellido());
//         System.out.println("nombre = "+encontrado.getNombre());
         
    
//    AlumnoData alu =new AlumnoData();
//    for(Alumno alumno:alu.listarAlumnos()){
//        System.out.println(alumno.getDni());
//        System.out.println(alumno.getApellido());
//        System.out.println(alumno.getNombre());
//        System.out.println(alumno.getFechaNac());
//        
//        System.out.println("-----------------");
//    }
        
      Materia mat=new Materia(9,"Lengua",5,true);
      MateriaData estudios=new MateriaData();
      //estudios.guaradarMateria(mat);
      estudios.modificarMateria(mat);
       //estudios.elimnarMateria(5);
    }
    
     
}
    

