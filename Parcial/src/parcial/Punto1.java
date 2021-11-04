package parcial;
import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        System.out.println("Programa que captura 3 numeros e indica el menor de ellos");
                
        Scanner ingresar = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        double num1 = ingresar.nextDouble();
        System.out.print("Ingresa otro numero: ");
        double num2 = ingresar.nextDouble();
        System.out.print("Ingresa el ultimo numero numero: ");
        double num3 = ingresar.nextDouble();
        if(num1 < num2 && num1 < num3){
        System.out.println("El numero menor es " + num1);
        }else{
            if(num2 < num1 && num2 < num3){
            System.out.println("El numero menor es " + num2);
            }else{
            System.out.println("El numero menor es " + num3);
            }
        }
        System.out.println("Gracias por utilizar el aplicativo");
                    System.out.println("████████████████████████████████████████████████████████████████\n" +
                                       "█████████░░░░░░█░░░░░░░░░░░░██████░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█\n" +
                                       "█████████░░▄▀░░█░░▄▀▄▀▄▀▄▀░░░░████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
                                       "█████████░░▄▀░░█░░▄▀░░░░▄▀▄▀░░████░░▄▀░░░░░░░░░░█░░▄▀░░░░░░░░░░█\n" +
                                       "█████████░░▄▀░░█░░▄▀░░██░░▄▀░░████░░▄▀░░█████████░░▄▀░░█████████\n" +
                                       "█████████░░▄▀░░█░░▄▀░░██░░▄▀░░████░░▄▀░░█████████░░▄▀░░█████████\n" +
                                       "█████████░░▄▀░░█░░▄▀░░██░░▄▀░░████░░▄▀░░█████████░░▄▀░░██░░░░░░█\n" +
                                       "█░░░░░░██░░▄▀░░█░░▄▀░░██░░▄▀░░████░░▄▀░░█████████░░▄▀░░██░░▄▀░░█\n" +
                                       "█░░▄▀░░██░░▄▀░░█░░▄▀░░██░░▄▀░░████░░▄▀░░█████████░░▄▀░░██░░▄▀░░█\n" +
                                       "█░░▄▀░░░░░░▄▀░░█░░▄▀░░░░▄▀▄▀░░████░░▄▀░░░░░░░░░░█░░▄▀░░░░░░▄▀░░█\n" +
                                       "█░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀░░░░████░░▄▀▄▀▄▀▄▀▄▀░░█░░▄▀▄▀▄▀▄▀▄▀░░█\n" +
                                       "█░░░░░░░░░░░░░░█░░░░░░░░░░░░██████░░░░░░░░░░░░░░█░░░░░░░░░░░░░░█\n" +
                                       "████████████████████████████████████████████████████████████████\n");
        System.out.println("Creado por Juan David Hincapie Manrique y Cristian David Gonzales Gonzales");
    }
}
