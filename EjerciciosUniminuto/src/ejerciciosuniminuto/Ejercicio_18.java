package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        System.out.println("Realizar un programa que lea dos números distintos y muestre el\n" +
                           "a. Mayor de ellos");
        System.out.println("---------------------------------------------------------------------");
        
        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = input.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = input.nextDouble();
        
        if (num1==num2){
            System.out.println("Los numeros deben ser diferentes, porfavor intentelo de nuevo");
        } else if (num1>num2) {
            System.out.println("El numero mayor es el: " + num1);
        } else {
            System.out.println("el numero mayor es el: " + num2);
        }
    }
}
