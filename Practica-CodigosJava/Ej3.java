//Dado dos numeros enteros positivos entercambiar sus valores sin utilizar estructuras condicionales
import java.util.Scanner;
public class Ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir Numero 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Introducir Numero 2: ");
        int num2 = scanner.nextInt();
        int z = num1 + num2;
        num2 = z - num2;
        num1 = z - num2;
        System.out.println("El nuevo valor de Numero 1: " + num1);
        System.out.println("El nuevo valor de Numero 2: " + num2);
        scanner.close();
    }
}
