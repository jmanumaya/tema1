package parte1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		// Creo el scaner para que pueda recoger entrada de teclado.
		Scanner sc = new Scanner(System.in);

		// Creo las variable para albergar los datos que el usuario nos introduzca.
		int nota1;
		int nota2;
		

		// Le indicamos al usuario por pantalla
		System.out.println("Hola! Voy a calcular tu nota media.\nIntroduce una nota:");

		// Recogemos los datos que introduce el usuario por teclado en dicha variable.
		nota1 = sc.nextInt();

		// Le indicamos al usuario por pantalla
		System.out.println("Introduce tu otra nota: ");

		// Recogemos los datos que introduce el usuario por teclado en dicha variable.
		nota2 = sc.nextInt();

		// Calculamos la nota media con los datos obtenidos por el usuario (PONGO 2.0 PARA FORZAR LOS DECIMALES).
		double notaMedia = (nota1 + nota2) / 2.0;

		// Le imprimimos por pantalla al usuario el resultado
		System.out.println("Tu nota media es" + notaMedia);

		// Cerramos el uso del escaner.
		sc.close();

	}

}
