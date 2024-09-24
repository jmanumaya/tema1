package parte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		// Iniciamos uso de escaner.
		Scanner sc = new Scanner (System.in);
		
		// Creamos las variables para albergar los datos posteriormente.
		String name; // Cadena de caracteres.
		String address; // Cadena de caracteres.
		int number; // Variable numérica entera.
		
		// Le indicamos al usuario y él introduce los datos.
		System.out.print("Buenas! Registra tus datos:\n Nombre: ");
		name = sc.nextLine();
		System.out.print("Dirección: ");
		address = sc.nextLine();
		System.out.print("Número de teléfono: ");
		number = sc.nextInt();
		
		// Le imprimimos en pantalla los resultados que le pedimos al usuario.
		System.out.println("Datos registrados satisfactoriamente!");
		System.out.println("Nombre: " + name + "\nDirección: " + address + "\nNumero de teléfono: " + number);

		// Cerramos uso de escaner.
		sc.close();
	}

}
