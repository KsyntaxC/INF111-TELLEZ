//Hallar la división entera de 2 números, sin utilizar el operador “división”, 
//Sugerencia: Restas sucesivas
import java.util.Scanner;
public class Ej15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introducir el dividendo: ");
        int n1 = scanner.nextInt();
        System.out.print("Introducir el divisor: ");
        int n2 = scanner.nextInt();
        int c = 0;
        while (n1 >= n2) {
            n1 = n1 - n2;
            c++;
        }
        System.out.println(c);

        scanner.close();
    }
}