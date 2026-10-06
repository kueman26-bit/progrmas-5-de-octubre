import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Puede obtener licencia de conducir.");
        }
    }
}
