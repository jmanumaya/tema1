package parte1;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		
		// Inicio el uso de escaner.
		Scanner sc = new Scanner (System.in);
		
		// Declaro las variables y constantes.
		int vntManzanas; // valor que introduzca el usuario.
		int vntPeras; // valor que introduzca el usuario.
		final double PRECIOMANZANAS = 2.35; // valor constante.
		final double PRECIOPERAS = 1.95; // valor constante.
		
		// Le indico al usuario lo que va a hacer el programa y lo que tiene que hacer e introducir.
		System.out.println("Voy a calcular el total de beneficios anuales entre tus dos productos.");
		System.out.print("Dime cuantos kilos de manzanas vendistes: ");
		vntManzanas = sc.nextInt(); // Recogemos en la variable lo que introduzca el usuario
		System.out.print("Ahora dime cuantos kilos de peras: ");
		vntPeras = sc.nextInt();// Recogemos en la variable lo que introduzca el usuario
		System.out.println("");
		
		// Se muestra en pantalla el resultado al usuario y se hacen las diferentes operaciones para calcular dicho resultado.
		System.out.println("Beneficios con las manzanas: " + vntManzanas * PRECIOMANZANAS + "Euros");
		System.out.println("Beneficios con las peras: " + vntPeras * PRECIOPERAS + "Euros");
		System.out.println("Beneficios totales: " + ((vntPeras * PRECIOPERAS) + (vntManzanas * PRECIOMANZANAS)) + "Euros");

		// Cerramos uso de escaner.
		sc.close();
	}

}
