import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una temperatura: ");
        double temperatura = teclado.nextDouble();

        if (temperatura > 35) {
            System.out.println("Temperatura extrema.");
        }
    }
}
