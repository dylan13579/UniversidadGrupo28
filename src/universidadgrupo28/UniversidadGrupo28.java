
package universidadgrupo28;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import universidadgrupo28.AccesoADatos.*;

import universidadgrupo28.Entidades.Inscripciones;
import universidadgrupo28.Entidades.Materia;
import universidadgrupo28.Entidades.Alumno;








public class UniversidadGrupo28 {

    
    public static void main(String[] args) {
       
        
         /*
        //ALUMNO DATA
        
     Alumno estudiante=new Alumno(20,852967143,"Soria Rodriguez","Mirta Luna",LocalDate.of(1982, 4, 20), true);
            AlumnoData alu=new AlumnoData();
         alu.guardarAlumno(estudiante);
         alu.modificarAlumno(estudiante);
               alu.eliminarAlumno(46);
               alu.eliminarAlumnoPorDni(12345678);
                    Alumno encontrado=alu.buscarAlumno(19);
                    Alumno encontrado=alu.buscarAlumnoPorDni(45612398);
                    
                     if(encontrado!=null){     
                     System.out.println("dni = "+encontrado.getDni());
                     System.out.println("apellido = "+encontrado.getApellido());
                     System.out.println("nombre = "+encontrado.getNombre());
         
    
       AlumnoData alu =new AlumnoData();
       for(Alumno alumno:alu.listarAlumnos()){
       System.out.println(alumno.getDni());
       System.out.println(alumno.getApellido());
       System.out.println(alumno.getNombre());
       System.out.println(alumno.getFechaNac());
       System.out.println("-----------------");
        }
        */




      
        //MATERIA DATA    

//    Materia mat=new Materia(1,"Histora",2,true);
//           MateriaData estudios=new MateriaData();
//         estudios.guaradarMateria(mat);
//         estudios.modificarMateria(mat);
//               estudios.elimnarMateria(11);
//                    Materia encuentra=estudios.buscarMateria(16);
//                    Materia encuentra=estudios.buscarMateriaPorAnio(2);
//                    if(encuentra!=null){
//                        System.out.println("id = "+encuentra.getIdMateria());
//                        System.out.println("nombre = "+encuentra.getNombre());
//                        System.out.println("año = "+encuentra.getAnioMateria());
//                        System.out.println("estado = "+encuentra.isEstado());
//                       
//                   
//                    }
//         
//      MateriaData estudios=new MateriaData(); 
//      for(Materia materia:estudios.listarMateria()){
//          System.out.println("Materia = "+materia.getNombre());
//          System.out.println("Año = "+materia.getIdMateria());
//          System.out.println("-----------------");
//            }
        


        //INCRIPCIONES DATA                 

//      AlumnoData ad=new AlumnoData();
//      MateriaData md=new MateriaData();
      InscripcionData id=new InscripcionData();
//      
//
//       Alumno alum=ad.buscarAlumno(58);
//       Materia mate=md.buscarMateria(20);
//       Inscripciones ins=new Inscripciones(alum,mate,7);
         
      
            //id.guardarInscripcion(ins);
//            id.actualizarNota(51, 12, 7);
//            id.borrarIncripcion(51,12);



  

//             for(Inscripciones i:id.obtenerIncripcion()){
//              System.out.println("iD de Inscripcion = "+i.getIdInscripcion());
//              System.out.println("Materia = "+i.getMateria().getNombre());
//              System.out.println("Nota = "+i.getNota());
//              System.out.println("--------------");
//            }

            
//        for(Inscripciones estudi:id.obtenerIncripcionPorAlumno(19)){
//            System.out.println("ID Inscripcion = "+estudi.getIdInscripcion());
//            System.out.println("materia = "+estudi.getMateria().getIdMateria());
//            System.out.println("apellido = "+estudi.getAlumno().getApellido());
//            System.out.println("nombre = "+estudi.getAlumno().getNombre());
//            System.out.println("nota = "+estudi.getNota());
//        }



//            for(Materia materia:id.obternerMateriasCursadas(3)){ 
//                System.out.println("Las materias de este alumno son = "+materia.getNombre());
//               
//            }



//          for(Materia materias:id.obternerMateriasNoCursadas(2)){
//              System.out.println("Materia no Cursada  = "+materias.getNombre());
//         }
           
//
//           for(Alumno estudi:id.obternerAlumnosPorMaterias(3)){
//             
//            System.out.println("ID de Alumno: " + estudi.getIdAlumno());
//               System.out.println("nombre = "+estudi.getApellido()+ " "+ estudi.getNombre());
//               System.out.println("-------");
//             
//           }
    }
}
