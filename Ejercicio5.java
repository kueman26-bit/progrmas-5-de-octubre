import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = teclado.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número es múltiplo de 3 y 5 al mismo tiempo.");
        }
    }
}
