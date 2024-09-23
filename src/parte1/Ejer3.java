package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Creo el scaner para que pueda recoger entrada de teclado.
		Scanner sc = new Scanner (System.in);
		
		// Creo las variable para albergar los datos que el usuario nos introduzca
		int anoActual;
		int anoNacimiento;
		
		// Le indicamos al usuario por pantalla
		System.out.println("Buenas! Voy a adivinar cuantos años tienes...\nIndicame el año actual en el que estamos:");
		
		// Recogemos los datos que introduce el usuario por teclado
		anoActual = sc.nextInt();
		
		// Imprimimos por pantalla la siguiente indicación al usuario
		System.out.println("Ahora, indicame el año de tu nacimiento:");
		
		// 
		anoNacimiento =  sc.nextInt();
		
		System.out.println("Tienes: " + (anoActual - anoNacimiento) + " años");
		
		sc.close();

	}

}
