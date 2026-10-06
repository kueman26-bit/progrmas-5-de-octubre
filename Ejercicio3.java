import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el monto de una compra: ");
        double monto = teclado.nextDouble();

        if (monto >= 300) {
            System.out.println("Aplica descuento del 10%.");
        }
    }
}
