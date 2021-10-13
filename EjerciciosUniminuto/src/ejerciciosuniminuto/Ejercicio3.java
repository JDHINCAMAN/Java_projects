package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula el área de un triangulo rectángulo");
        System.out.println("-----------------------------------------------------------");
        
        double base, altura, resultado;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la base del triangulo: ");
        base = input.nextDouble();
        System.out.print("Ingrese la altura del triangulo: ");
        altura = input.nextDouble();
        
        resultado = ((base*altura)/2);
        System.out.println("El area del triangulo es: " + resultado + " cm2");
    }
}
