//Determinar si un numero es primo
import java.util.Scanner;
public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número: ");
        int n = scanner.nextInt();
        int c = 0;
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                c++;
            }
            i++;
        }
        if (c == 2) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }
        scanner.close();
    }
}
