//Hallar el mayor y el menor de 5 numeros ingresados desde teclado
//No utilizar estructuras repetitivas
import java.util.Scanner;
public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero 1: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese numero 2: ");
        int b = scanner.nextInt();
        System.out.print("Ingrese numero 3: ");
        int c = scanner.nextInt();
        System.out.print("Ingrese numero 4: ");
        int d = scanner.nextInt();
        System.out.print("Ingrese numero 5: ");
        int e = scanner.nextInt();
        int M, m;
        if (a > b) {
            M = a;
            m = b;
        } else {
            M = b;
            m = a;
        }
        if (c > M) {
            M = c;
        } else if (c < m) {
            m = c;
        }
        if (d > M) {
            M = d;
        } else if (d < m) {
            m = d;
        }
        if (e > M) {
            M = e;
        } else if (e < m) {
            m = e;
        }
        System.out.println("El mayor es: " + M);
        System.out.println("El menor es: " + m);
        scanner.close();
    }
}