package parte1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		// Inicio el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);

		final double IVA = 1.21; // En el ejercicio dice de darle valor 21 pero supongo que te refieres a que sea
									// 1.21 que es lo que se incrementa de IVA.
		double precio; // Declaramos la variable precios para albergar el dato del usuario.

		// Le indicamos al usuario lo que tiene que hacer y lo que hará el programa.
		System.out.println("Buenas, voy a calcular el precio total de un producto aplicandole el IVA.");
		System.out.print("Dime que precio tiene tu producto sin IVA: ");
		precio = sc.nextDouble(); // Entrada del dato del usuario por consola

		// Le devuelvo al usuario el resultado de lo que le dije que haría el programa.
		System.out.println("El precio total (IVA incluido) sería: " + (precio * IVA) + " Euros");
		
		sc.close();
	}

}
