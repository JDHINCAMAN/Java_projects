package ejerciciosuniminuto;

public class PruebaMatriz {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        
        //f = filas, c = columnas
        for (int f=0; f < matriz.length; f++) {
          for (int c=0; c < matriz.length; c++) {
              matriz[f][c] = (f*matriz.length)+(c+1);
              System.out.print(matriz[f][c]+" ");
              
              //(f*matriz.length)+(c+1);
              //(0*3)+(0+1) = 1
              //(0*3)+(1+1) = 2
              //(0*3)+(2+1) = 3
              // Se cumple la condicion del for c
              //(1*3)+(0+1) = 4
              //(1*3)+(1+1) = 5
              //(1*3)+(2+1) = 6
              // Se cumple la condicion del for c
              //(2*3)+(0+1) = 7
              //(2*3)+(1+1) = 8
              //(2*3)+(2+1) = 9
              // Se cumple la condicion del for c
          }
          System.out.println("");
        }
    }
}

