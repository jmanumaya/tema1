package parte2;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		/* Si ves que lo he enviado el día siguiente es porque lo terminé justo al tiempo de irnos y -----
		 * no pude hacer el commit and push y lo he hecho en cuanto he podido, al llegar a clase.
		 */
		
		// Creo el escaner para porder usarlo.
		Scanner sc = new Scanner (System.in);
		
		// Creo las variables para poder usarlas luego.
		int segundosUser; // Albergará los segundos indicados por el user.
		int minutos; // Tendrá el dato de minutos.
		int horas; // Tendrá el dato de hroas.
		int segundos; // Tendrá el dato de segundos.
		
		// Le indico al usuario por pantalla lo que hará el programa y el dato que tiene que facilitar.
		System.out.print("Hola! Indicame una cantidad de segundos y te diré cuantos segundos, minutos y horas son: ");
		// Entrada del usuario.
		segundosUser = sc.nextInt();
		
		// Cálculos correspondientes para averiguar los diferentes resultados.
		horas = segundosUser/3600;
		minutos = (segundosUser%3600)/60;
		segundos = segundosUser%60;
		
		// Le imprimo por pantalla al usuario el resultado que se le dijo que haría el programa.
		System.out.println("Total de Horas: " + horas + "\n Total de Minutos: " + minutos + "\n Total de Segundos: " +  segundos);
		
		// Cierro uso de escaner.
		sc.close();
	}

}
