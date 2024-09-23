//En un restaurante se consumieron 3 platos del menu (cada plato tiene su descuento)
//Si el precio del plato es mayo a 300 Bs, se hace un descuento del 20%
//Si es mayor a 200 y menor a 300, se hace un descuento del 15%
//Si es mayor a 100 y menor a 200, se hacer un descuento del 7%
//Si es menor a 100 no hay descuento
//Imprima el monto total del cobro
import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el costo del plato 1: ");
        int p1 = scanner.nextInt();
        System.out.print("Ingrese el costo del plato 2: ");
        int p2 = scanner.nextInt();
        System.out.print("Ingrese el costo del plato 3: ");
        int p3 = scanner.nextInt();
        double dp1, dp2, dp3;
        if (p1 > 300) {
            dp1 = p1 * 0.80;
        } else if (p1 > 200) {
            dp1 = p1 * 0.85;
        } else if (p1 > 100) {
            dp1 = p1 * 0.93;
        } else {
            dp1 = p1;
        }
        if (p2 > 300) {
            dp2 = p2 * 0.80;
        } else if (p2 > 200) {
            dp2 = p2 * 0.85;
        } else if (p2 > 100) {
            dp2 = p2 * 0.93;
        } else {
            dp2 = p2;
        }
        if (p3 > 300) {
            dp3 = p3 * 0.80;
        } else if (p3 > 200) {
            dp3 = p3 * 0.85;
        } else if (p3 > 100) {
            dp3 = p3 * 0.93;
        } else {
            dp3 = p3;
        }
        double MT = dp1 + dp2 + dp3;
        System.out.println("El monto final a cobrar es de " + MT + " Bs");
        scanner.close();
    }
}