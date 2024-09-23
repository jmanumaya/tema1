package parte1;

import java.util.Scanner;


public class Ejer2 {

	public static void main(String[] args) {
		
		// Creo el scaner para que pueda recoger entrada de teclado.
		Scanner sc = new Scanner (System.in);
		
		// Creo la variable number para luego albergar el número que escriba el usuario.
		int edad;
		
		// Le indico al usuario que introduzca un número.
		System.out.println("Hola!! Escribe tu edad y te diré cuantos años tendrás el año que viene:");
		
		// Entrada de teclado por parte del usuario para recoger en la variable edad el número que escriba
		edad = sc.nextInt();
		
		// Le decimos al usuario en pantalla la edad que tendrá con una concatenación de variables
		System.out.println("Tendrás: " + (edad + 1) + " años");
		
		// cerramos el uso del escaner
		sc.close();

	}

}
