package parte2;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo con el usuario.
		Scanner sc = new Scanner (System.in);

		// Creo las variables para albergar los valores.
		int milimetros; // Contendrá el dato de mm que diga el usuario.
		//Contendrá el dato de cm que diga el usuario.
		int centimetros;
		// Contendrá el dato de m que diga el usuario.
		int metros;
		// Contendá el dato total de la operación
		int total;
		
		// Le explico al usuario que hará el programa y que tiene que hacer.
		System.out.println("Hola! Necesitos que me des tres distancias y te diré el total de la suma de estas.");
		System.out.println("¿Cuantos milímetros?: ");
		// El usuario introduce el dato que se le pide.
		milimetros = sc.nextInt();
		System.out.println("¿Cuantos centímetros?: ");
		// El usuario introduce el dato que se le pide.
		centimetros = sc.nextInt();
		System.out.println("¿Cuantos metros?: ");
		// El usuario introduce el dato que se le pide.
		metros = sc.nextInt();
		
		// Operación para determinar el resultado.
		total = (milimetros/10) + centimetros + (metros*100);
		
		// Imprimo en pantalla al usuario el resultado de lo que le dije que haría el programa.
		System.out.println("La distancia total en centimetros es: " + total);
		
		// Cierro uso de escaner.
		sc.close();
		
	}

}
