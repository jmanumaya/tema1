package parte2;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		
		// Creo el escaner para usarlo con el usuario.
		Scanner sc = new Scanner (System.in);
		// Creo las dos variables que usaré en el programa.
		// Esta primera contendrá el dato que dé el usuario.
		double metros;
		// Esta contendrá la conversión y resultado del programa.
		int centimetros;
		
		// Indicamos al usuario lo que tiene que hacer.
		System.out.println("Buenas, intrudoce la longitud del lanzamiento en metros: ");
		// Entrada del usuario para introducir el dato que se pide.
		metros = sc.nextDouble();
		
		// Conversión a centímetros y truncamiento.
		centimetros = (int) metros * 100;
		
		// Le decimos al usuario el resultado del programa.
		System.out.println("La longitud de tu lanzamiento ha sido de: " + centimetros + " cm.");
		
		// Cerramos uso del escaner.
		sc.close();
		
	}

}
