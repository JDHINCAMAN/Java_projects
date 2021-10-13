package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_13 {
    public static void main(String[] args) {
        System.out.println("Leer dos números y los imprima en forma ascendente");
        System.out.println("------------------------------------------------------");
        
        double num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese 2 numeros: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        if (num1<num2) {
            System.out.println("-------------");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println("-------------");
        }else {
            System.out.println("-------------");
            System.out.println(num2);
            System.out.println(num1);
            System.out.println("-------------");
        }
    }
}
