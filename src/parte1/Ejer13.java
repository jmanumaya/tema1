package parte1;
import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		
		// Inicio el escaner para poder usarlo
		Scanner sc = new Scanner (System.in);
		
		// Creo todas las variables boolean que voy a usar para recoger true o false.
		boolean rain;
		boolean task;
		boolean library;
		
		// Le indico al usuario lo que va a hacer el programa y lo que tiene que hacer e introducir.
		System.out.println("¿Podrás salir a la calle? (Responde con true o false)");
		System.out.println("¿Está lloviendo?");
		rain = sc.nextBoolean(); // Guardo el resultado que introduzca en la variable 
 		System.out.println("¿Has finalizado las tareas?");
 		task = sc.nextBoolean(); // Guardo el resultado que introduzca en la variable
		System.out.println("¿Tienes que ir a la biblioteca?");
		library = sc.nextBoolean(); // Guardo el resultado que introduzca en la variable
		// Hago la comprobación para imprimir el resultado según lo que me ha introducido el usuario
		System.out.println((!rain && task ) || library); 
		/* (diferente a true (!rain) Y true (task) = "true") O true (library) = "true"
		    Lo contrario sería = "false"*/
		

		// HE HECHO EL IF PARA COMPROBAR LA LÓGICA Y TENER UNA BASE QUE ENTIENDA
		
		 /* if (rain == true && task == true) {
				System.out.println("True");
		 }
			else if (library == true) {
				System.out.println("True");
			}
			else	{
		 		System.out.println("False");
			}
		 */
		
		// Cerramos el uso del escaner.
		sc.close();
	}

}
