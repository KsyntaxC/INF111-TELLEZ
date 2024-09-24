//Los números feos son aquellos cuyos factores primos son 2,3,5. Escribir un programa que determine si un número es feo o no. 
//Ejemplo: 6 es un numero feo
import java.util.Scanner;
public class Ej12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int n = scanner.nextInt();
        int original = n; 
        if (n == 1) {
            System.out.println("Es un numero feo");
        } else {
            while (n % 2 == 0) {
                n /= 2;
            }
            while (n % 3 == 0) {
                n /= 3;
            }
            while (n % 5 == 0) {
                n /= 5;
            }
            if (n == 1) {
                System.out.println(original + " es un numero feo");
            } else {
                System.out.println(original + " no es un numero feo");
            }
        }
        scanner.close();
    }
}
