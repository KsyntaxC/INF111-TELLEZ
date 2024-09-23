//Hallar el factorial de todos os numeros comprendidios en el rango (a...b)
//Donde a debe ser menor que b
import java.util.Scanner;
public class Ej8 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de a: ");
        int a = scanner.nextInt();
        System.out.print("Introduce el valor de b: ");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println("Error: a debe ser menor que b.");
            return;
        }
        for (int i = a; i <= b; i++) {
            int fac = 1;
            for (int j = 1; j <= i; j++) {
                fac *= j;
            }
            System.out.println("El factorial de " + i + " es: " + fac);
        }
        scanner.close();
    }
}