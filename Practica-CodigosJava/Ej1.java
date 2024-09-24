//Dado los lados del rectangulo calcular el area y el perimetro
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura del rectangulo: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese la base del rectangulo: ");
        int b = scanner.nextInt();
        int A = a * b;
        int P = 2 * a + 2 * b;
        System.out.println("Su area es: " + A);
        System.out.println("Su perimetro es: " + P);
        scanner.close();
    }
}
