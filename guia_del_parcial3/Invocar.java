package guia_del_parcial3;
import java.util.*;
public class Invocar {
    public void Invoca(){
        int resp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("INVOCANDO TODAS LAS CLASES ANTERIORES ");
        System.out.println("INGRESE LA CLASE QUE DESEA INVOCAR");
        System.out.println("1.Estructuras de control  2.Alumnos  3.Evaluaciones");
        while (resp !=1 && resp !=2 && resp !=3) {
            resp= sc.nextInt();
            switch (resp) {
                case 1:
                EstructurasDeControl edc = new EstructurasDeControl();
                edc.seleccionar();
                    
                    break;
                case 2: 
                        
                
						int c=0;
		                do{
		                c++;
                        String nom,cod,duracion;
                        System.out.println("------------------------------");
                        System.out.println("Ingrese el codigo de la carrera");
                        sc.nextLine();
                        cod = sc.nextLine();
                        System.out.println("Ingrese el Nombre de la carrera");
                        nom = sc.nextLine();
                        System.out.println("Ingrese la Duracion de la carrera");
                        duracion = sc.nextLine();
                        
                        
						String NombresAlumno,ApellidosAlumno,CarnetAlumno;
						System.out.println("------------------------------");
						System.out.println("Ingrese el numero de carnet");
                        CarnetAlumno = sc.nextLine();
                        System.out.println("Ingrese sus Nombres");
                        NombresAlumno = sc.nextLine();
						
                        System.out.println("Ingrese sus Apellidos");
                        ApellidosAlumno = sc.nextLine();
                        
                        
                        String NombreMat;
						int UnidadVal;
						System.out.println("------------------------------");
						System.out.println("Ingrese el nombre de la materia");
                        NombreMat = sc.nextLine();
		
                        System.out.println("Ingrese las unidades valorativas");
                        UnidadVal= sc.nextInt();
                        Alumnos.Carrera_Alumno(cod,nom,duracion);
                        Alumnos.DatosAlumno(NombresAlumno,ApellidosAlumno,CarnetAlumno);
                        Alumnos.MateriasAcursar(NombreMat,UnidadVal);
                         }while(c<5);
                         

		                
                    
                    break;
                 case 3:
						
                    
                    break;
                default:
                System.out.println("Datos incorrectos por favor intenta de nuevo");
                resp--;
                    break;
            }
        }
    }
}
