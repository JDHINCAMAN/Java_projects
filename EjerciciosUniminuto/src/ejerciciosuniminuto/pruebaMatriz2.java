package ejerciciosuniminuto;

public class pruebaMatriz2 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        
        for (int i=0; i < matriz.length; i++) {
          for (int j=0; j < matriz.length; j++) {
              matriz[i][j] = (i*matriz.length)+(j+1);
              System.out.print(matriz[i][j]+"  ");
          }
          System.out.println("");
        }
        System.out.println("otra opcion");
        int Matriz2[][]={{1,2,3},{4,5,6},{7,8,9}};
        for (int k = 0; k<Matriz2.length;k++) {
            for (int l=0; l < Matriz2.length; l++) {
             System.out.print(Matriz2[k][l] + " ");   
            }
            System.out.println("");
        }
        
        System.out.println(Math.PI);
    }
}
