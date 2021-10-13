package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Programa que calcula el promedio de 3 Notas");
        System.out.println("---------------------------------------------------------------------------------");
        
        double n1, n2, n3, p;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        n1 = input.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        n2 = input.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        n3 = input.nextDouble();
        
        p = (n1+n2+n3)/3;
        System.out.println("El promedio de las tres notas es: " + p);
    }
}
