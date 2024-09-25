package parte1;
import java.util.Scanner;

public class Ejer14 {

    public static void main(String[] args) {
    	
    	
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        // Solicitar las notas de los tres trimestres
        System.out.print("Introduce la nota del primer trimestre: ");
        int nota1 = sc.nextInt();

        System.out.print("Introduce la nota del segundo trimestre: ");
        int nota2 = sc.nextInt();

        System.out.print("Introduce la nota del tercer trimestre: ");
        int nota3 = sc.nextInt();

        // Calcular la media
        double media = (nota1 + nota2 + nota3) / 3.0;

        // Mostrar la media truncada para el boletín de calificaciones (parte entera)
        System.out.println("Nota media para el boletín de calificaciones: " + (int) media);

        // Mostrar la media con decimales para el expediente académico
        System.out.printf("Nota media para el expediente académico: %.2f\n", media);

        sc.close();
    }
}