import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese la edad de un participante: ");
        int edad = teclado.nextInt();

        if (edad >= 15 && edad <= 18) {
            System.out.println("Puede participar.");
        }
    }
}
