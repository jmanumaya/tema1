package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Creo el scaner para que pueda recoger entrada de teclado.
		Scanner sc = new Scanner (System.in);
		
		// Creo la variable number de tipo entero para luego albergar el número que escriba el usuario.
		
		int number;
		
		// Le indico al usuario que introduzca un número.
		System.out.println("Hola! Escribe un número y lo mostraré en pantalla!!!");
		
		// Creo la opción de entrada de teclado de un numero entero y lo guardo en la variable que cree al principio.
		number = sc.nextInt();
		
		// Devuelvo en pantalla el número que el usuario ha introducido.
		System.out.println(number);
		
		// Cierro el uso de escaner.
		sc.close();
	}

}
