package ejerciciosuniminuto;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class pruebaVector {
    public static void main (String[] args) {
        int vector[] = new int[10];
        Scanner ingresar = new Scanner(System.in);
        int suma = 0, resta = 0, multiplicacion = 1, base, exponente, sum1, sum2;
        double division = 0;
        
        // este for sirve para ingresar los numeros al vector
        for (int j = 0; j < vector.length; j++) {
            System.out.println("Ingrese el numero en la posicion " + j+": ");
            vector[j] = ingresar.nextInt();
        }
     
        // este for sirve para leer los datos del vector
        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i]);
            JOptionPane.showMessageDialog(null,vector[i]);
        }
        
        // este for sirve para hacer operaciones
        for (int k = 0; k < vector.length; k++) {
            //suma = suma + vector[k];
            suma += vector[k];
            resta -= vector[k];
            multiplicacion *= vector[k];
            division /= vector[k];
            
        }
        
        System.out.println("suma: " + suma);
        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);
        System.out.println("division: " + division);
        
        // Math.pow(base, exponente)
        // para hacer potenciacion
        System.out.println("Porfavor digite la base: ");
        base = ingresar.nextInt();
        System.out.println("Porfavor digite el exponente: ");
        exponente = ingresar.nextInt();
        System.out.println(Math.pow(vector[base], vector[exponente]));
        System.out.println("Digite el numero a sumar: ");
        sum1 = ingresar.nextInt();
        System.out.println("digite otro numero para sumar: ");
        sum2 = ingresar.nextInt();
        System.out.println(vector[sum1]+vector[sum2]); 
        
        System.out.println(Math.PI);
    }
}
