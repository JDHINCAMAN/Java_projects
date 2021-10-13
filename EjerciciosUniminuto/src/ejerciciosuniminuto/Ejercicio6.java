package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Programa para ingresar por teclado un número de 4 cifras e imprima la sumatoria de los dos primeros y los dos últimos.");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        
        int num, sum1, sum2, u, d, c, um;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero de 4 cifras: ");
        num = input.nextInt();
        u = num%10;
        d = num/10%10;
        c = num/100%10;
        um = num/1000%10;
        sum1 = um + c;
        sum2 = d + u;
        
        if (num > 9999) {
            System.out.println("Debe ingresar un numero de 4 cifras, intente de nuevo");
        } else {
            System.out.println("La suma de los dos primeros numeros es: " + sum1);
            System.out.println("La suma de los dos ultimos numeros es: " + sum2);
        }
    }
}
