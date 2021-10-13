package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        System.out.println("Elaborar un programa que me calcule el promedio de tres notas y me\n" +
                           "muestre APROBADO si su promedio es mayor que 10.5 caso contrario\n" +
                           "me muestre DESAPROBADO");
        System.out.println("-----------------------------------------------------------------------");
        
        double n1, n2, n3, promedio;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        n1 = input.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        n2 = input.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        n3 = input.nextDouble();
        promedio = (n1+n2+n3)/3;
        
        if (promedio>10.5) {
            System.out.println("APROBADO");
        } else {
            System.out.println("DESAPROBADO");
        }
    }
}
