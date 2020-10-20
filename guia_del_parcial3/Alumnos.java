package guia_del_parcial3;
public class Alumnos {
    //creando el metodo Carrera_Alumno
    public static void Carrera_Alumno(String cod_carrera,String Nom_carrera,String Duracion){
        //crreando las variables locales a utilizar.
        String cod,nom,duracion;
        cod=cod_carrera;
        nom=Nom_carrera;
        duracion=Duracion;

        //Mostrando Los ingresados.
        System.out.println("*******************************************");
        System.out.println("El codigo de la carrera es: "+cod);
        System.out.println("El Nombre de la carrera es: "+nom);
        System.out.println("La Duracion  de la carrera es: "+duracion);
        System.out.println("*******************************************");
    }


	//creando el metodo DatosAlumno
	public static void DatosAlumno(String Nombres,String Apellidos,String Carnet)
	{
			
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
	
	//creando el metodo MateriasAcursar
	public static void MateriasAcursar(String NombreMateria,int UnidadValorativa)
	{
		
		//creando las variables locales a utilizar.
			String NombreMat;
			int UnidadVal;
			
			NombreMat=NombreMateria;
			UnidadVal=UnidadValorativa;
			
			//Mostrando Los ingresados.
			System.out.println("*******************************************");
			System.out.println("El nombre de la materia es: "+NombreMat);
			System.out.println("Las Unidades Valorativas son: "+UnidadVal);
			System.out.println("*******************************************");
	}
}
    
