package guia_del_parcial3;
import java.util.*;

public class EstructurasDeControl {

    
    public static void simple(){
    	Scanner sc = new Scanner(System.in);
    	String secret;
    	System.out.println("Desea saber nuestro secreto, si quieres verlo ingrese 'SI' ");
    	secret = sc.nextLine();
    	if (secret == "SI") {
    		System.out.println("Nuestro secreto es que no sabemos que estamos haciendo");
    	}

    }
    
    public static void doble(){
    	Scanner sc = new Scanner(System.in);
    	int respuesta;
    	System.out.println("Hola es usted una mujer?, si es mujer ingrese 1, de lo contrario ingrese cualquier otro numero");
    	respuesta = sc.nextInt();
    	if (respuesta == 1) {
    		System.out.println("Gracias por confirmar, usted es una mujer");
    	}
    	else{
    		System.out.println("Gracias por aclarar, usted es un hombre");
    	}
    }

    public static void multiple(){
    	Scanner sc = new Scanner(System.in);
    	int seleccion, num1, num2, total;
    	System.out.println("Seleccione la operacion a realiza");
    	System.out.println("Para realizar una suma ingrese 1");
    	System.out.println("Para realizar una resta ingrese 2");
    	System.out.println("Para realizar una multiplicacion ingrese 3");
    	System.out.println("Para realizar una division ingrese 4");
    	seleccion = sc.nextInt();
    	System.out.println("Ingrese su primer numero");
    	num1 = sc.nextInt();
    	System.out.println("Ingrese su segundo numero");
    	num2 = sc.nextInt();
    	switch (seleccion){
    		case 1:
    		total = num1 + num2;
    		System.out.println("El resultado de su operacion es: "+total);
    		break;

    		case 2:
    		total = num1 - num2;
    		System.out.println("El resultado de su operacion es: "+total);
    		break;

    		case 3:
    		total = num1 * num2;
    		System.out.println("El resultado de su operacion es: "+total);
    		break;

    		case 4:
    		total = num1 / num2;
    		System.out.println("El resultado de su operacion es: "+total);
    		break;   		
    	}
    }

    public static void dowhile(){
    	Scanner sc = new Scanner(System.in);
    	int base, potencia, total = 1;
    	System.out.println("Vamos a elevar un numero a una potencia");
    	System.out.println("ingrese la base");
    	base = sc.nextInt();
    	System.out.println("ingrese la potencia");
    	potencia = sc.nextInt();
    	if (potencia > 0) {
    		do{
    			total = total * base;
    			potencia = potencia - 1;
    		}
    		while (potencia != 0);
    		total = total / base;
    	System.out.println(base+"^"+potencia+"= "+total);
    	}
    	else{
    		System.out.println("Syntax Error");
    	}
    }

    public static void formethod(){
    	Scanner sc = new Scanner(System.in);
    	int base, radical, total;
    	System.out.println("Vamos a sacar la raiz de un numero");
    	System.out.println("ingrese la base");
    	base = sc.nextInt();
    	System.out.println("ingrese el radical");
    	radical = sc.nextInt();
    	total = base;
    	if (radical > 0 && base > 0) {
    		for (radical = radical;radical <= 0; radical--); {
				total = total/base;
    		}   		
    	System.out.println(radical+"√"+base+"= "+total);
    	}
    	else{
    		System.out.println("Syntax Error");
    	}
    }
}
