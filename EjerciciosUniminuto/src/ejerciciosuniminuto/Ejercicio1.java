package ejerciciosuniminuto;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Programa que pida la fecha de nacimiento y calcula la edad de una persona.");
        System.out.println("---------------------------------------------------------------------------------");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su Año de nacimiento: ");
        int fechaN = input.nextInt();
        System.out.print("Ingrese el año actual: ");
        int fechaA = input.nextInt();
        int edad = fechaA - fechaN;
        System.out.println("Su edad es: " + edad + " años");
        
        System.out.println("");
        
        // Otra forma de resolver el ejercicio
        System.out.println("Otra forma de resolver el ejercicio");
        System.out.println("La fecha se escribe directamente en el codigo");
        DateTimeFormatter forma = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // Aqui se ingresa la fecha
        LocalDate fechaNac = LocalDate.parse("24/09/2003", forma);
        LocalDate actual = LocalDate.now();
        Period periodo = Period.between(fechaNac, actual);
        System.out.printf("Su edad es: %s años, %s meses y %s dias" + "\n",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}