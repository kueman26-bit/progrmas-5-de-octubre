import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = teclado.nextInt();

        // Usamos Math.abs para considerar también números de tres cifras negativos
        if (Math.abs(numero) >= 100 && Math.abs(numero) <= 999) {
            System.out.println("El número tiene tres cifras.");
        }
    }
}
