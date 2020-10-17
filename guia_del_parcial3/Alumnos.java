package guia_del_parcial3;
import java.util.Scanner;
public class Alumnos {
	//creando el metodo DatosAlumno
	public static void DatosAlumno(String Nombres,String Apellidos,String Carnet)
	{
			Scanner Leer=new Scanner(System.in);
			
			//creando las variables locales a utilizar.
		    String NombresAlumno,ApellidosAlumno,CarnetAlumno;
			
			NombresAlumno=Nombres;
			ApellidosAlumno=Apellidos;
			CarnetAlumno=Carnet;
			
			//Mostrando Los ingresados.
			System.out.println("*******************************************");
			System.out.println("El nombre del Alumno es: "+NombresAlumno);
			System.out.println("Los Apellidos del alumno son: "+ApellidosAlumno);
			System.out.println("El carnet es: "+CarnetAlumno);
			System.out.println("*******************************************");
	}
    
}
