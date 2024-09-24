package parte1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		
		// Iniciamos el escaner para usarlo mas adelante.
		Scanner sc = new Scanner (System.in);
		
		// Creamos las variables para albergar posteriormente datos en ellas.
		String name; // Cadena de caracteres
		int edad; // Número entero
		
		// Le indicamos al usuario lo que tiene que hacer y este nos lo dá por consola.
		System.out.print("Hola! dime tu nombre: ");
		name = sc.nextLine();
		System.out.print("Ahora, dime tu edad: ");
		edad = sc.nextInt();
		
		// Imprimimos el resultado al usuario de lo que le hemos pedido con una concatenación.
		System.out.println("Hola " + name + ", tienes " + edad + " años, ¡qué mayor eres!");
		
		// Cerramos el escaner.
		sc.close();

	}

}
