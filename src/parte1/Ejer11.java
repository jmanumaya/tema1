package parte1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		// Inicio el uso de escaner.
		Scanner sc = new Scanner (System.in);
		
		// Declaro las variables
		final double EUROS = 0.006; // Variable constante que conlleva el valor de euros
		int pesetas; // Variable para el valor que introduzca el usuario
		
		// Le imprimimos en pantalla lo que hará el programa y lo que tiene que introducir.
		System.out.print("Hola! voy a pasar la moneda de pesetas a euros.\nIndica las pesetas: ");
		pesetas = sc.nextInt(); // Recogemos lo que el usuario introduzca.
		
		// Le imprimimos al usuario el resultado de la operación que le dijimos que mostraremos.
		System.out.println("Son " + (pesetas * EUROS) + " Euros");
		
		// Cerramos uso de escaner.
		sc.close();

	}

}
