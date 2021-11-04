
package ejerciciosuniminuto;
import java.util.Scanner;

public class ejericicio2Practica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double producto, descuento, total;
        System.out.print("Ingrese el valor del producto: ");
        producto = input.nextDouble();
        descuento = producto*0.2;
        total = producto - descuento;
        if (producto>150000) {
            System.out.println("El producto ingresado es mayor a 150.000");
            System.out.println("Tiene un descuento del 20%");
            System.out.println("EL valor total es: "+total);
        } else {
            System.out.println("El valor total del producto es: "+ producto);
        }
    }
}
