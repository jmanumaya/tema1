package parte1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		
		// Inicio el escaner para poder recoger datos de parte del usuario.
		Scanner sc = new Scanner (System.in);
		
		int number; // Variable para albergar el numero que el usuario nos dé posteriormente.
		boolean result; // Boleano para posteriormente imprimir true si ocurre lo que le digamos o false si no.
		
		// Le pedimos al usuario un número para decirle posteriormente si es par o impar con un true o false.
		System.out.print("Dime un número y adivinaré si es par (true) o impar (false): ");
		
		// Entrada por teclado del usuario.
		number = sc.nextInt();
		
		// Le damos valor a nuestro boleano con una condición para que sepa si tiene que ser true o false
		result = (number % 2 == 0);
		
		//Imprimimos el resultado del boleano por pantalla para informar al usuario.
		System.out.println(result);
		
		// Cerramos uso de escaner.
		sc.close();
		
	}

}
