package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Programa para ingresar por teclado un número de 4 cifras y que imprima los dos dígitos del medio");
        System.out.println("---------------------------------------------------------------------------------------------------");
        
        int num , u, d, c, um;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero de cuatro cifras: ");
        num = input.nextInt();
        u = num%10;
        d = num/10%10;
        c = num/100%10;
        um = num/1000%10;
        
        if (num > 9999) {
            System.out.println("Debe ingresar un numero de 4 cifras, intente de nuevo");
        } else {
            System.out.println("Los dos digitos del medio son: " + c + d);
        }
    }
}
