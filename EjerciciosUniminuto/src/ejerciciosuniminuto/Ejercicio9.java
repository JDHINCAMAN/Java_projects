package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Algoritmo que captura 3 precios correspondientes a 3\n" +
                            "camisas y calcula el precio total por las 3 aplicando un 20%");
        System.out.println("-----------------------------------------------------------------");
        
        double c1, c2, c3, descuento, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de la primera camisa: ");
        c1 = input.nextDouble();
        System.out.print("Ingrese el valor de la segunda camisa: ");
        c2 = input.nextDouble();
        System.out.print("Ingrese el valor de la tercera camisa: ");
        c3 = input.nextDouble();
        descuento = (c1+c2+c3)*0.2;
        total = (c1+c2+c3)-descuento;
        System.out.println("El descuento del 20% es de: " + descuento);
        System.out.println("El valor total de las camisas es: " + total);
    }
}
