package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_20 {
    public static void main(String[] args) {
        System.out.println("Programa que me muestra el mayor de dos números ingresados por teclado");
        System.out.println("--------------------------------------------------------------------------");
        
        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = input.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = input.nextDouble();
        
        if (num1>num2) {
            System.out.println("El numero " + num1 + " es mayor al numero " + num2);
        } else {
            System.out.println("El numero " + num2 + " es mayor al numero " + num1);
        }
    }
}
