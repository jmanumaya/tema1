package parte1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		// Inicio el escaner para poder usarlo.
		Scanner sc = new Scanner(System.in);

		final double IVA = 21; // Declaro la constante IVA para que valga 21.
									
		double precio; // Declaramos la variable precios para albergar el dato del usuario.

		// Le indicamos al usuario lo que tiene que hacer y lo que hará el programa.
		System.out.println("Buenas, voy a calcular el precio total de un producto aplicandole el IVA.");
		System.out.print("Dime que precio tiene tu producto sin IVA: ");
		precio = sc.nextDouble(); // Entrada del dato del usuario por consola
		
		// Calcular el precio con IVA
        double precioFinal = precio * (1 + IVA / 100);
        
		// Le devuelvo al usuario el resultado de lo que le dije que haría el programa.
		System.out.println("El precio total (IVA incluido) sería: " + precioFinal + " Euros");
		
		// Cerramos uso del escaner
		sc.close();
	}

}
