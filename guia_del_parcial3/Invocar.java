package guia_del_parcial3;
import java.util.*;
public class Invocar {
    public void Invoca(){
        int resp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("INVOCANDO TODAS LAS CLASES ANTERIORES ");
        System.out.println("INGRESE LA CLASE QUE DESEA INVOCAR");
        System.out.println("1.Estructuras de control  2.Alumnnos  3.Evaluaciones");
        while (resp !=1 && resp !=2 && resp !=3) {
            resp= sc.nextInt();
            switch (resp) {
                case 1:
                EstructurasDeControl edc = new EstructurasDeControl();
                edc.seleccionar();
                    
                    break;
                case 2:
                    
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
