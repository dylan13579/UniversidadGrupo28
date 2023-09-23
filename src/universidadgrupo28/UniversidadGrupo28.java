
package universidadgrupo28;

import java.time.LocalDate;
import universidadgrupo28.AccesoADatos.*;
import universidadgrupo28.Entidades.Alumno;
import universidadgrupo28.Entidades.Inscripciones;

import universidadgrupo28.Entidades.Materia;




public class UniversidadGrupo28 {

    
    public static void main(String[] args) {
       
         
        //ALUMNO DATA
        
    //Alumno estudiante=new Alumno(20,852967143,"Soria Rodriguez","Mirta Luna",LocalDate.of(1982, 4, 20), true);
            //AlumnoData alu=new AlumnoData();
         //alu.guardarAlumno(estudiante);
         //alu.modificarAlumno(estudiante);
               //alu.eliminarAlumno(19);
              // alu.eliminarAlumnoPorDni(85321);
                    //Alumno encontrado=alu.buscarAlumno(19);
                    //Alumno encontrado=alu.buscarAlumnoPorDni(45612398);
                    
                     //if(encontrado!=null){     
                     //System.out.println("dni = "+encontrado.getDni());
                     //System.out.println("apellido = "+encontrado.getApellido());
                     //System.out.println("nombre = "+encontrado.getNombre());
         
//    
//    AlumnoData alu =new AlumnoData();
//    for(Alumno alumno:alu.listarAlumnos()){
//    System.out.println(alumno.getDni());
//    System.out.println(alumno.getApellido());
//    System.out.println(alumno.getNombre());
//    System.out.println(alumno.getFechaNac());
//    System.out.println("-----------------");
//    }
        





        //MATERIA DATA    

    //Materia mat=new Materia(1,"Base de Datos ",1,true);
            //MateriaData estudios=new MateriaData();
         //estudios.guaradarMateria(mat);
         //estudios.modificarMateria(mat);
               //estudios.elimnarMateria(11);
                    //Materia encuentra=estudios.buscarMateria(3);
                    //Materia encuentra=estudios.buscarMateriaPorAnio(2);
//                    if(encuentra!=null){
//                    System.out.println("nombre = "+encuentra.getNombre());
//                    System.out.println("año = "+encuentra.getAnioMateria());
//                        System.out.println("estado = "+encuentra.isEstado());
//                       
//                    
//                    }
         
//      MateriaData estudios=new MateriaData(); 
//      for(Materia materia:estudios.listarMateria()){
//          System.out.println("Materia = "+materia.getNombre());
//          System.out.println("Año = "+materia.getIdMateria());
//          System.out.println("-----------------");
//      }







        //INCRIPCIONES DATA                 

//      AlumnoData ad=new AlumnoData();
//      MateriaData md=new MateriaData();
      InscripcionData id=new InscripcionData();

       //Alumno alum=ad.buscarAlumno(19);
       //Materia mate=md.buscarMateria(3);
       //Inscripciones ins=new Inscripciones(alum,mate,8);
         
//      
//            id.guardarInscripcion(ins);
//            id.actualizarNota(2, 4, 8);
//            id.borrarIncripcion(1, 3);

//          for(Inscripciones inscrip:id.obtenerIncripcion()){
//              System.out.println("ID = "+inscrip.getIdInscripcion());
//              System.out.println("Apellido = "+inscrip.getAlumno().getApellido());
//              System.out.println("Materia = "+inscrip.getMateria().getNombre());
//              System.out.println("-----------------");
//          }


            
//        for(Inscripciones estudi:id.obtenerIncripcionPorAlumno(19)){
//            System.out.println("ID Inscripcion = "+estudi.getIdInscripcion());
//            System.out.println("materia = "+estudi.getMateria().getIdMateria());
//            System.out.println("apellido = "+estudi.getAlumno().getApellido());
//            System.out.println("nombre = "+estudi.getAlumno().getNombre());
//            System.out.println("nota = "+estudi.getNota());
//        }


//          for(Materia materias:id.obternerMateriasCursadas(2)){
//              
//           
//              System.out.println("id = "+materias.getIdMateria());
//              System.out.println("nombre = "+materias.getNombre());
//
//              System.out.println("-------");                
//         }



//            for(Materia materia:id.obternerMateriasCursadas(3)){ 
//                System.out.println("Laa materias de este alumno son = "+materia.getNombre());
//               
//            }



//          for(Materia materias:id.obternerMateriasNoCursadas(4)){
//              System.out.println("Materia no Cursada  = "+materias.getNombre());
//         }
           

//           for(Alumno estudi:id.obternerAlumnosPorMaterias(5)){
//             
//            System.out.println("ID de Alumno: " + estudi.getIdAlumno());
//               System.out.println("nombre = "+estudi.getApellido()+ " "+ estudi.getNombre());
//               System.out.println("-------");
//             
//           }
   }
}
