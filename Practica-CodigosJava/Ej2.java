//Dado el radio de un circulo calcular el perimetro
import java.util.Scanner;
public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        int r = scanner.nextInt();
        double P = 2 * 3.1416 * r; // Perímetro
        System.out.println("El perímetro del círculo es: " + P);
        scanner.close();
    }
}

