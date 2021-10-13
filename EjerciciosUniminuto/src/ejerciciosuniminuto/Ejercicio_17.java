package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        System.out.println("Leer 2 números; si son iguales que los multiplique, si el primero es mayor\n" +
                           "que el segundo que los reste y si no, que los sume.");
        System.out.println("--------------------------------------------------------------------------------");
        
        double num1, num2, multi, res, sum;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = input.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = input.nextDouble();
        multi = num1*num2;
        res = num1-num2;
        sum = num1+num2;
        
        if (num1==num2) {
            System.out.println("Los numeros son iguales");
            System.out.println("La multiplicacion de los dos numeros es: " + multi);
        } else if (num1>num2) {
            System.out.println("El primer numero es mayor que el segundo");
            System.out.println("La resta de los dos numeros es: " + res);
        } else {
            System.out.println("La suma de los dos numeros es: " + sum);
        }
    }
}
