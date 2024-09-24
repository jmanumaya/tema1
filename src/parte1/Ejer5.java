package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		// Creo el scaner para que pueda recoger entrada de teclado.
		Scanner sc = new Scanner (System.in);
		
		// Creo la variable double para albergar el dato que el usuario nos introduzca.
		double radio;
		
		// Le indicamos al usuario por pantalla
		System.out.println("Hola! Soy capaz de calcular la longitud y área de una circunferencia\nDime el radio de la circunferencia: ");
		
		/* Recogemos el dato que introduce el usuario por teclado en dicha variable 
		 * (esta vez ponemos double por si decide poner un número decimal).
		 */
		radio = sc.nextDouble();
		
		/* Realizamos los cálculos para obtener la longitud y el área 
		 *  con la ayuda de Math.PI y Math.pow para elevar un numero a una determinada potencia.
		 */
		double longitud = (2 * Math.PI) * radio; // Obtenemos la longitud
		double area = Math.PI * Math.pow(radio, 2); // Obtenemos el área
		
		// Le imprimimos por pantalla al usuario el resultado de lo que le digimos que iba a hacer el programa.
		System.out.println("La longitud es: " + longitud + " y el área es: " + area);
		
		// Cerramos el uso del escaner.
		sc.close();
	}

}
