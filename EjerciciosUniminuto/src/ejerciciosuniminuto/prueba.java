package ejerciciosuniminuto;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args){
        float Estatura;
        Scanner Ingresar= new Scanner(System.in);
        System.out.println("Programa que base a tu edad te dice si eres \n"
        +"una persona alta o baja");
        System.out.println("Digite su estatura");
        Estatura=Ingresar.nextFloat();
        if (Estatura<=1.65){
            System.out.println("Basandonos en su estatura, usted es una persona baja");
        }else{
            System.out.println("Basandonos en su es usted es una persona alta");
        }
        System.out.println("Gracias por su atencion.");       
     }
}
