package guia_del_parcial3;
import java.util.*;

public class EstructurasDeControl {

	public static void seleccionar(){
		Scanner sc = new Scanner(System.in);
		int slc;
		System.out.println("Seleccione la estructura de control a ejecutar");
		System.out.println("Para la estructura simple ingrese 1");
		System.out.println("Para la estructura doble ingrese 2");
		System.out.println("Para la estructura multiple ingrese 3");
		System.out.println("Para la estructura Do While ingrese 4");
		System.out.println("Para la estructura For ingrese 5");
		slc = sc.nextInt();
		switch (slc){
			case 1:
			EstructurasDeControl.simple();
			break;
			case 2:
			EstructurasDeControl.doble();
			break;
			case 3:
			EstructurasDeControl.multiple();
			break;
			case 4:
			EstructurasDeControl.dowhile();
			break;
			case 5:
			EstructurasDeControl.formethod();
			break;
			default:
				System.out.println("Seleccion erronea");
			break;
		}
	}
    
    public static void simple(){
    	Scanner sc = new Scanner(System.in);
    	String secret;
    	System.out.println("Desea saber nuestro secreto, si quieres verlo ingrese 'SI' ");
    	secret = sc.nextLine();
    	if (secret.equalsIgnoreCase("si")) {
    		System.out.println("Nuestro secreto es, que nos gusta el chambre igual que a ti");
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
    	int base, potencia, total = 1, mem = 0;
    	System.out.println("Vamos a elevar un numero a una potencia");
    	System.out.println("ingrese la base");
    	base = sc.nextInt();
    	System.out.println("ingrese la potencia");
    	potencia = sc.nextInt();
    	if (potencia > 0) {
    		do{
    			total = total * base;
    			potencia = potencia - 1;
    			mem = mem +1;
    		}
    		while (potencia != 0);
    	System.out.println(base+"^"+mem+"= "+total);
    	}
    	else{
    		System.out.println("Syntax Error");
    	}
    }

    public static void formethod(){
    	Scanner sc = new Scanner(System.in);
    	Double base, radical, total, mem;
    	System.out.println("Vamos a sacar la raiz de un numero");
    	System.out.println("ingrese la base");
    	base = sc.nextDouble();
    	System.out.println("ingrese el radical");
    	radical = sc.nextDouble();
    	total = base;
    	mem = radical;
    	if (radical > 0 && base > 0) {
    		for (radical = radical;radical <= 0; radical--); {
				total = (mem + base/mem) / mem;
    		}   		
    	System.out.println(radical+"√"+base+"= "+total);
    	}
    	else{
    		System.out.println("Syntax Error");
    	}
    }
}
