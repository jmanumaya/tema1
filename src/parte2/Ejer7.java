package parte2;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo con el usuario.
		Scanner sc = new Scanner (System.in);
		
		// Creo las diferentes variables y constantes.
		// Número de entradas indicado por el usuario.
		int numEntradas;
		// Precio constante de las entradas de infantil y adulto.
		final double precioIn = 13.50;
		final int precioAd = 20;
		// Variable tipo String para recoger un valor de cadena de carácteres.
		String tipoEntrada;
		// Variables para contener los resultados del programa.
		double total0;
		double total;
		
		// Le indico al usuario y le pido que me de ciertos valores y datos para continuar.
		System.out.println("¡Bienvenido al Parque Acuático! Precios de las entradas:\n Infantiles: " + precioIn + "€\n Adultos: " + precioAd + "€\n ¡¡¡TENEMOS UNA PROMOCIÓN: +100€ SE APLICA UN 5%");
		System.out.println("Primero introduce cuantas entradas querrias comprar: ");
		// Entrada del usuario para albergar el dato correspondiente a la variable.
		numEntradas = sc.nextInt();
		System.out.println("Indica el tipo de entrada (Si quiere Infantil introduce 'infantil', si quiere Adulto introduce 'adulto'): ");
		// Entrada del usuario para albergar el dato correspondiente a la variable.
		tipoEntrada = sc.next();
		
		// Operaciones para averiguar el resultado. // variable.equals() para comparar cadenas en java.
		total0 = (tipoEntrada.equals("infantil")) ? precioIn * numEntradas : precioAd * numEntradas;
		total = (total0 >= 100) ? total0 - (total0 * 0.05) : total0;
		
		// Le imprimo por pantalla el resultado al usuario o lo que le valdrá la entrada.
		System.out.println("El precio de tus entradas sería: " + total);
		
		// Cierro uso de escaner.
		sc.close();
	}

}
