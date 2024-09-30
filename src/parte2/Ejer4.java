package parte2;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		
		// Creo el escaner para poder usarlo mas adelante.
		Scanner sc = new Scanner (System.in);
		
		// Creo las diferentes variables para albergar el valor mas adelante.
		int a;
		int b;
		int c;
		int x;
		int y;
		
		// Le pido al usuario los diferentes datos y le explico lo que hará el programa.
		System.out.println("Voy a realizar la siguiente operación. y=ax2+bx+c (el x2 es el dos elevado)");
		System.out.println("Para ello necesito los siguientes valores...");
		System.out.print("Dime el valor que tendrá 'a': ");
		// El usuario introduce el valor de "a"
		a = sc.nextInt();
		System.out.print("Dime el valor que tendrá 'b': ");
		// El usuario introduce el valor de "b"
		b = sc.nextInt();
		System.out.print("Dime el valor que tendrá 'c': ");
		// El usuario introduce el valor de "c"
		c = sc.nextInt();
		System.out.print("Dime el valor que tendrá la 'x': ");
		// El usuario introduce el valor de "x"
		x = sc.nextInt();

		// Realizo la operación usando los datos que me ha facilitado el usuario.
		y = (a * x * x) + (b * x) + c;
		
		// Le imprimo por pantalla el resultado de dicha operación al usuario.
		System.out.println("El resultado y por tanto el valor de y es: " + y);

		// Cierro uso de escaner.
		sc.close();
	}

}
