import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Solicite nota de Matemática: ");
        double notaMatematica = teclado.nextDouble();
        System.out.print("Solicite nota de Comunicación: ");
        double notaComunicacion = teclado.nextDouble();

        if (notaMatematica >= 11 && notaComunicacion >= 11) {
            System.out.println("Postulante apto.");
        }
    }
}
