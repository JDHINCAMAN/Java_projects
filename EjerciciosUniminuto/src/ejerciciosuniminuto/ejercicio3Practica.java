package ejerciciosuniminuto;
import java.util.Scanner;

public class ejercicio3Practica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balota;
        System.out.print("Ingrese el valor de la balota: ");
        balota = input.nextInt();
        
        switch (balota) {
            case 1:
                System.out.println("Producto excelente");
                break;
            case 2:
                System.out.println("Producto bueno");
                break;
            case 3:
                System.out.println("Producto regular");
                break;
            default:
                System.out.println("Devolucion de producto");
                break;
        }
    }
}
