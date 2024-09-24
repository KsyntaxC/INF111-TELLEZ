//Dados dos numeros enteros positivos, determinar si uno es multiplo del otro
import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese numero 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Ingrese numero 2: ");
        int n2 = scanner.nextInt();
        if (n1 % n2 == 0) {
            System.out.println(n1 + " es multiplo de " + n2);
        } else {
            System.out.println(n1 + " no es multiplo de " + n2);
        }
        if (n2 % n1 == 0) {
            System.out.println(n2 + " es multiplo de " + n1);
        } else {
            System.out.println(n2 + " no es multiplo de " + n1);
        }
        scanner.close();
    }
}