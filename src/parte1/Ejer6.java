package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		// Creo el scaner para que pueda recoger entrada de teclado.
		Scanner sc = new Scanner (System.in);
		
		// Creamos las variables para un futuro albergar datos.
		int num1;
		int num2;
		
		// Le idicamos al usuario que me dé dos números.
		System.out.print("Buenas! dame dos números y te mostraré varias cuentas con ellos\nPrimer número: ");
		num1 = sc.nextInt();
		System.out.print("Segundo número: ");
		num2 = sc.nextInt();
		
		// Le imprimimos por pantalla el resultado del ejercicio.
		System.out.println("Resultados:");

		System.out.println("Suma --> " + num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("Resta --> " + num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("Multiplicación --> " + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println("División --> " + num1 + " / " + num2 + " = " + (num1 / num2));
		
		// Cerramos uso de escaner.
		sc.close();
	}

}
