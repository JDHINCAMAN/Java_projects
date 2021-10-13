package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        System.out.println("Ingresar por teclado el nombre y la edad de cualquier persona e imprima tanto el nombre como la edad");
        System.out.println("-------------------------------------------------------------------------------------------------------");
        
        String nombre;
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("---------------------------------------");
    }
}
