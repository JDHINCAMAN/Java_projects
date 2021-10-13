package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Programa que captura las edades de 3 personas y que muestra la suma y resta de las tres edades respectivamente.");
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        
        int edad1, edad2, edad3, sum, res;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la primera edad: ");
        edad1 = input.nextInt();
        System.out.print("Ingrese la segunda edad: ");
        edad2 = input.nextInt();
        System.out.print("Ingrese la tercera edad: ");
        edad3 = input.nextInt();
        sum = edad1+edad2+edad3;
        res = edad1-edad2-edad3;
        
        if (edad1>150 || edad2>150 || edad3>150) {
            System.out.println("La maxima edad de una persona puede ser 150, porfavor intente de nuevo");
        } else {
            System.out.println("La suma de las edades es: " + sum);
            System.out.println("La resta de las edades es: " + res);
        }
    }
}
