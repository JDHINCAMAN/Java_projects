
package ejerciciosuniminuto;

import java.util.Scanner;

public class prueba2 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double num;
         System.out.println("ingrese la estatura actual");
         num=Entrada.nextDouble();
         if (num<=1.65){
             System.out.println("usted es bajo");
         }else {
             System.out.println("usted esta alto");
         }
         }
}
