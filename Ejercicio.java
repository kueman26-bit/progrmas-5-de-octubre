import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        // Verificamos si el número se encuentra entre 20 y 50 inclusive
        if (numero >= 20 && numero <= 50) {
            System.out.println("Está dentro del rango.");
        }
    }
}
