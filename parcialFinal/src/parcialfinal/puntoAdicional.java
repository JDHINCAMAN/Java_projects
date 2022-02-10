package parcialfinal;

import java.util.Scanner;

public class puntoAdicional {
    public static void main(String[] args) {
        int pisos;
        Scanner recibir=new Scanner(System.in);
        System.out.println("Ingrese el numero de piso: ");
        pisos=recibir.nextInt();
        System.out.println("");
        
        for(int i=1; i<=pisos; i++) {
            for(int j=1; j<=i;j++) {
                System.out.print((i-j)+1);
            } 
            System.out.println(" ");
        }
    }
}
