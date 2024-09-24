import java.util.Scanner;
public class Ej4Mejorado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PT = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce el costo del plato " + i + ": ");
            double p = scanner.nextDouble();
            double dp;
            if (p < 300) {
                if (p < 200) {
                    if (p < 100) {
                        dp = 1; 
                    } else {
                        dp = 0.93;  
                    }
                } else {
                    dp = 0.85; 
                }
            } else {
                dp = 0.80;  
            }
            double c = p * dp;
            PT += c;  
        }
        System.out.printf("El precio total a pagar es de %.2f Bs\n", PT);
        scanner.close();
    }
}