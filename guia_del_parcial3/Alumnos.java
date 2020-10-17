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
}
