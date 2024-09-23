//Dado los lados del rectangulo calcular el area y el perimetro
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura del rectángulo: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese la base del rectángulo: ");
        int b = scanner.nextInt();
        int A = a * b; // Área
        int P = 2 * a + 2 * b; // Perímetro
        System.out.println("Su área es: " + A);
        System.out.println("Su perímetro es: " + P);
        scanner.close();
    }
}
