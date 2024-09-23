//Verificar si a es divisible por b o b es divisible por a
//5 25 → 25 es divisible por 5
//52 2 → 52 es divisible por 2
//5 13 → ninguno
import java.util.Scanner;
public class Ej13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero 1: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese numero 2: ");
        int B = scanner.nextInt();
        if (A % B == 0) {
            System.out.println(A + " es divisible por " + B);
        } else if (B % A == 0) {
            System.out.println(B + " es divisible por " + A);
        } else {
            System.out.println("Ninguno es divisible por el otro");
        }
        scanner.close();
    }
}
