package parte1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		
		// Iniciamos el escaner.
		Scanner sc = new Scanner (System.in);
		
		// Variable booleana que indicará si es mayor de edad.
		boolean over18;
		//Variable para guardar la edad que introduzca el usuario.
		int edad;
		
		// Le indicamos al usuario y nos da el dato.
		System.out.print("Hola! dime tu edad: ");
		edad = sc.nextInt();
		
		// Le damos valor al booleano comparando la edad si es mayor o igual de 18.
		over18 = (edad >= 18);
		
		// Imprimimos el valor del booleano.
		System.out.println(over18);
		
		// Cerramos uso de escaner.
		sc.close();
	}

}
