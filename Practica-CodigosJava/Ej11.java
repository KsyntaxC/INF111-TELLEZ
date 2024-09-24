//Dados dos numeros positivos mostrar todos los numeros primos en ese rango de numeros
//Ejemplo: A=2 B=10 2,3,4,7
import java.util.Scanner;
public class Ej11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Intro A: ");
        int A = scanner.nextInt();
        System.out.print("Intro B: ");
        int B = scanner.nextInt();
        for (int i = A; i <= B; i++) {
            int c2 = 0; 
            for (int c1 = 1; c1 <= i; c1++) {
                if (i % c1 == 0) {
                    c2++; 
                }
            }
            if (c2 == 2) {
                System.out.print(i + ", "); 
            }
        }
        scanner.close();
    }
}