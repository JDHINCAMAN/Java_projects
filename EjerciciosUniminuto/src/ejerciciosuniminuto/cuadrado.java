
package ejerciciosuniminuto;
import java.util.Scanner;

public class cuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, res;
        System.out.print("Ingrese el numero: ");
        num = input.nextInt();
        res = num * num;
        System.out.println("El resultado de ese numero al cuadrado es: "+res);
    }
}
