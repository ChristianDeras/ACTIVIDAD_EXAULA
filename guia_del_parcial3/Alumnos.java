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
			System.out.println("El codigo de la carrera es: "+Nombres);
			System.out.println("El Nombre de la carrera es: "+Apellidos);
			System.out.println("La Duracion  de la carrera es: "+Carnet);
			System.out.println("*******************************************");
	}
    
}
