package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        System.out.println("Necesitamos saber si el usuario es alto o bajo. Es bajo aquel que mide\n" +
                           "cuanto mucho 1.65 mts.");
        System.out.println("----------------------------------------------------------------------------");
        
        double estatura;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su estatura: ");
        estatura = input.nextDouble();
        
        if (estatura<=1.65) {
            System.out.println("Usted es bajo");
        } else {
            System.out.println("Usted es alto");
        }
    }
}
