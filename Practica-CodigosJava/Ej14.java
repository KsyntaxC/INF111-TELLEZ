//Dados 3 números: a, b y c, mostrar los múltiplos de a en el rango de b y c. 
//Ejmemplo: a=3,b=5,c=11 → 6,9
import java.util.Scanner;
public class Ej14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce a: ");
        int a = scanner.nextInt();
        System.out.print("Introduce b: ");
        int b = scanner.nextInt();
        System.out.print("Introduce c: ");
        int c = scanner.nextInt();
        int v = (b / a) + 1;
        int ma = a * v;
        while (ma <= c) {
            if (ma > b) {
                System.out.print(ma + ", ");
            }
            v++;
            ma = a * v;
        }
        scanner.close();
    }
}