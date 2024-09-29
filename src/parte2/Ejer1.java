package parte2;
import java.util.Scanner;

/*PARA QUE SE ENTIENDA::::::     Básicamente esta lógica consiste en hacer que cuando el usuario meta un número, nosotros trunquemos dicho número haciendo el redondeo -----
 * 				 entonces en el momento que el usuario mete un 2.3 por ejemplo, nosotros sumamos 0.5 y como no llegaría a 3 o mas entonces al hacer el trunqueo es 2 ------
 * 				 si el usuario metiese un número que sea 2.5 o superior, al hacer la suma de 0.5 daría 3 o superior y al hacer el trunqueo pues haría dicho redondeo ------
 * 
 * 				 Ejemplo:	Si el usuario mete un 2.3, le sumamos 0.5 y truncamos. El resultado sería 2 y así se haría el redondeo hacia abajo.
 * 						Si el usuario mete un 2.7 le sumamos 0.5 y truncamos. El resultado sería 3 y así se haría el redondeo hacia arriba.	
 * 
 * 				 ESPERO QUE SE HAYA ENTENDIDO PORQUE ESTA HA SIDO DE LAS UNICAS FORMAS QUE HE SABIDO HACERLO (NO SE SI HAY OTRA).   */

public class Ejer1 {

	public static void main(String[] args) {
		// Creo el escaner para poder usarlo en el programa.
		Scanner sc = new Scanner (System.in);
		
		// Creo las variables que usaré en el programa.
		double numero; // Variable de tipo double para recojer el entero del usuario.
		int redondeado; // Variable de tipo int para albergar el número redondeado (entero).
		
		// Le indico por consola lo que hace el programa y lo que el usuario debe hacer.
		System.out.print("Ingresa un número decimal y lo redondearé: ");
		// Recojo el dato del usuario
		numero = sc.nextDouble();
		
		// Hago el cálculo para obtener el número redondeado
		redondeado = (int) (numero + 0.5);
		
		// Muestro el número redondeado del usuario por pantalla.
		System.out.println("El número redondeado es: " + redondeado);

		// Cierro uso de escaner.
		sc.close();
	}

}
