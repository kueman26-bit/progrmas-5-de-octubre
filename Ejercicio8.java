import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el suelo de un trabajador: ");
        double sueldo = teclado.nextDouble();

        if (sueldo > 3500) {
            System.out.println("Pertenece al grupo de ingresos altos.");
        }
    }
}
