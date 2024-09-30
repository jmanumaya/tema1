package parte2;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo mas adelante.
		Scanner sc = new Scanner (System.in);
		
		// Creo las diferetes variables que usaré.
		int num1; // Alberga el número que de el usuario.
		int num2; // Alberga el número que de el usuario.
		int residuo; // Alberga el resto entre el numero del usuario y 7.
		int resultado; // Alberga el resultado que hay que darle al usuario.
		
		// Le digo por pantalla al usuario lo que tiene que hacer y lo que hará el programa.
		System.out.println("Dame dos números y te diré lo que hay que sumarle al primero para que sea multiplo del segundo.");
		// Le pido el primer número.
		System.out.println("Primer número: ");
		// Recojo el dato del usuario.
		num1 = sc.nextInt();
		// Le pido el segundo número.
		System.out.println("Segundo número: ");
		// Recojo el dato del usuario.
		num2 = sc.nextInt();
		
		// Hago los calculos necesarios.
		residuo = num1 % num2;
		resultado = (residuo == 0) ? 0 : (num2 - residuo);
		
		// Le imprimo por pantalla el resultado que le dije que calcularía al usuario.
		System.out.println("Al número " + num1 + " hay que sumarle " + resultado + " para que sea multiplo de " + num2);
		
		// Cierro uso de escaner.
		sc.close();

	}

}
