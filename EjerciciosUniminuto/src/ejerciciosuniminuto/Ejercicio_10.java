package ejerciciosuniminuto;
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        System.out.println("Mostrar su nombre, sexo, edad y estado civil, que son ingresados por teclado");
        System.out.println("------------------------------------------------------------------------------");
        
        String nombre, sexo, estadoCivil;
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su sexo, 1 para Masculino y 0 para Femenino: ");
        sexo = input.nextLine();
        switch (sexo) {
            case "1":
                sexo = "Masculino";
                break;
            case "0":
                sexo = "Femenino";
                break;
            default:
                sexo = "Opcion invalida, porfavor intente de nuevo";
                break;
        }
        System.out.print("Estado civil\n" + 
                            "1. Casad@\n" +
                            "2. Solter@\n" +
                            "3. Divorciad@\n" +
                            "4. Viud@\n" +
                            "5. Union libre\n" +
                            "6. Anulado\n" + 
                            "Ingrese el numero de su estado civil: \n");
        estadoCivil = input.nextLine();
        switch (estadoCivil) {
            case "1":
                estadoCivil = "Casad@";
                break;
            case "2":
                estadoCivil = "Solter@";
                break;
            case "3":
                estadoCivil = "Divorciad@";
                break;
            case "4":
                estadoCivil = "Viud@";
                break;
            case "5":
                estadoCivil = "Union libre";
                break;
            case "6":
                estadoCivil = "Anulado";
                break;
            default:
                estadoCivil = "Opcion invalida, porfavor intente de nuevo";
                break;
        }
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        if (edad>150) {
            System.out.println("La maxima edad de una persona puede ser 150, porfavor intente de nuevo");
        }
        
        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sexo: " + sexo);
        System.out.println("Edad: " + edad);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("---------------------------------------");
    }
}
