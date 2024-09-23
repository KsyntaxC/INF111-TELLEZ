//Determinar si un año es bisiesto. Para que un año sea bisiesto debe ser
//Divisible por 4 y no debe ser divisible por 100, excepto que tambien sea divisible por 400
//Esta version es mejor por ser mas entendible y mas corta
import java.util.Scanner;
public class Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el año: ");
        int a = scanner.nextInt();
        if (a % 400 == 0) {
            System.out.println("Es bisiesto");
        } else if (a % 100 == 0) {
            System.out.println("No es bisiesto");
        } else if (a % 4 == 0) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }
        scanner.close();
    }
}
