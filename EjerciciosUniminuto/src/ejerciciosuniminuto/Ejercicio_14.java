package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        System.out.println("Necesitamos saber si una persona es “joven” o “vieja” basándonos en su\n" +
                            "edad. Joven es aquella menor de 45 años.");
        System.out.println("------------------------------------------------------------------------------");
        
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        
        if (edad<1) {
            System.out.println("NO puede tener una edad de 0 no negativa, porfavor intente de nuevo");
        } else if (edad>150) {
            System.out.println("La edad maxima de una persona es 150, porfavor intente de nuevo");
        } else if (edad<45) {
            System.out.println("Usted es una persona joven");
        } else {
            System.out.println("Usted es una persona vieja");
        }
    }
}
