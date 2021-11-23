package ejerciciosuniminuto;

import java.util.Scanner;

public class matrizIdentidad {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite el tamaño de la matriz: ");
        num = input.nextInt();
        int matriz[][] = new int [num][num];
        
        for (int i = 0; i<matriz.length;i++) {
            for (int j = 0; j<matriz.length;j++) {
                if (i==j) {
                    matriz[i][j] = 1;
                }
                else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
