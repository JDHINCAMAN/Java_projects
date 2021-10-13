package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        System.out.println("Ingresar por teclado el nombre y la edad de cualquier persona e imprima,\n" +
                           "solo si la persona es mayor de edad, el nombre de la persona.");
        System.out.println("------------------------------------------------------------------------------");
        
        String nombre;
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        
        if (edad<1) {
            System.out.println("No puede tener una edad de 0 y negativa, porfavor intente de nuevo");
        } else if (edad>150){
            System.out.println("La edad maxima de una persona es 150, porfavor intente de nuevo");
        } else if (edad>=18) {
            System.out.println(nombre + " es mayor de edad");
        } else{
            System.out.println("Gracias por usar el programa");
        }
    }
}
