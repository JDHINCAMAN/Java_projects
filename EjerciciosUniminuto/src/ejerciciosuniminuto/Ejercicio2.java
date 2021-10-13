package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula el área de un cuadrado");
        System.out.println("------------------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el valor de un lado del cuadrado: ");
        double a = input.nextDouble();
        double area = a*a;
        System.out.println("El area del cuadrado es: " + area);
    }
}