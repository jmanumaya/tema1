package parte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		// Iniciamos uso de escaner.
		Scanner sc = new Scanner (System.in);
		
		// Creamos las variables para albergar los datos posteriormente.
		String name;
		String address;
		int number;
		
		// Le indicamos al usuario para que vaya introduciendo los datos.
		System.out.print("Buenas! Registra tus datos:\n Nombre: ");
		name = sc.nextLine();
		System.out.print("Dirección: ");
		address = sc.nextLine();
		System.out.print("Número de teléfono: ");
		number = sc.nextInt();
		
		// Le imprimimos en pantalla los resultados.
		System.out.println("Datos registrados satisfactoriamente!");
		System.out.println("Nombre: " + name + "\nDirección: " + address + "\nNumero de teléfono: " + number);

		// Cerramos uso de escaner.
		sc.close();
	}

}
