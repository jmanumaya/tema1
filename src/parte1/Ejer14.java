package parte1;

import java.util.Scanner;

public class Ejer14 {

    public static void main(String[] args) {
    	
		// Inicio el escaner para poder usarlo.
        Scanner sc = new Scanner(System.in);
        
        // Declaro las variables para albergar el dato que de el usuario.
        int nota1;
        int nota2;
        int nota3;
        
		// Le indicamos al usuario lo que tiene que hacer y lo que hará el programa.
        System.out.println("Buenas, voy a calcular tu nota media del curso.");
        System.out.print("Introduce la nota del primer trimestre: ");
        nota1 = sc.nextInt(); // Entrada del usuario por consola para albergar el valor en la variable.
        System.out.print("Introduce la nota del segundo trimestre: ");
        nota2 = sc.nextInt(); // Entrada del usuario por consola para albergar el valor en la variable.
        System.out.print("Introduce la nota del tercer trimestre: ");
        nota3 = sc.nextInt(); // Entrada del usuario por consola para albergar el valor en la variable.

        // Operación para calcular la nota media.
        double media = (nota1 + nota2 + nota3) / 3.0;

        // Mostramos por pantalla la nota media truncada.
        System.out.println("Nota media para el boletín de calificaciones: " + (int) media);

        // Mostramos por pantalla la nota media exacta del expediente.
        System.out.printf("Nota media para el expediente académico: %.2f\n", media);

        // Cerramos uso del escaner.
        sc.close();
    }
}