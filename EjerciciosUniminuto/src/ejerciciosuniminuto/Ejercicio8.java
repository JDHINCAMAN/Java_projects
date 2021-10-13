package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Programa que capture el nombre de un artículo y su precio\n" +
                            "y calcule el 50% de descuento y muestre su valor a pagar.");
        System.out.println("-----------------------------------------------------------------");
        
        double precio, descuento, total;
        String articulo;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        articulo = input.nextLine();
        System.out.print("Ingrese el valor de " + articulo + ": ");
        precio = input.nextDouble();
        descuento = precio*0.5;
        total = precio - descuento;
        System.out.println("Descuento del 50%: " + descuento);
        System.out.println("Valor a pagar: " + total);
    }
}
