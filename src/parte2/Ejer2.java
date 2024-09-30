package parte2;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo mas adelante.
		Scanner sc = new Scanner (System.in);
		
		// Creo las diferetes variables que usaré.
		int number; // Alberga el número que de el usuario.
		int residuo; // Alberga el resto entre el numero del usuario y 7.
		int resultado; // Alberga el resultado que hay que darle al usuario.
		
		// Le digo por pantalla al usuario lo que tiene que hacer y lo que hará el programa.
		System.out.print("Dame un número y te diré lo que hay que sumarle para que sea multiplo de 7: ");
		// Recojo el dato del usuario.
		number = sc.nextInt();
		
		// Hago los calculos necesarios.
		residuo = number % 7;
		resultado = (residuo == 0) ? 0 : 7 - residuo;
		
		// Le imprimo por pantalla el resultado que le dije que calcularía al usuario.
		System.out.println("Al número " + number + " hay que sumarle " + resultado + " para que sea multiplo de 7");
		
		// Cierro uso de escaner.
		sc.close();

	}

}
