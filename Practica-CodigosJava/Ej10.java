//Dado un numero entero positivo, si el numero es par dividir entre 2
//De lo contrario multiplicar por tres y sumar 1, mostrar cada numero generado hasta que el numero sea 1
//Ejemplo: 3,10,5,16,8,4,2,1
import java.util.Scanner;
public class Ej10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = scanner.nextInt();
        while (n != 1) {
            System.out.print(n + ", ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }
        System.out.println(n); // Imprimir el último número (1)
        
        scanner.close();
    }
}
