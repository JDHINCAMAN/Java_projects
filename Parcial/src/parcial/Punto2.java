package parcial;

import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("Programa que muestra un menu de opciones");
        System.out.println("-------------------------------------------\n");
        
        Scanner ingresar = new Scanner(System.in);
        double promedio, suma = 0, notaMayor = 0, notaMenor;
        int opcion;
        double[] notas = new double[11];
        double[] datos = new double[9];
        
        do{
            System.out.println("----------------------------");
            System.out.println("Menu");
            System.out.println("1. Calculo de notas");
            System.out.println("2. Calculo de estadistica");
            System.out.println("3. Salir");
            System.out.println("------------------------------\n");
            System.out.print("Porfavor elija la opcion que necesite: ");
            opcion = ingresar.nextInt();
            
            switch (opcion) {
                case 1:
                    for (int i = 1; i < 11; i++) {
			System.out.print("Ingrese la nota " + (i) + ": ");
			notas[i] = ingresar.nextDouble();
                    }
                    
                    for (int i = 1; i < notas.length; i++) {
			suma += notas[i];
			if (notaMayor < notas[i]) {
				notaMayor = notas[i];
			}
                    }
                    
                    notaMenor = notaMayor;
                    for (int i = 1; i < notas.length; i++) {
			if (notaMenor > notas[i]) {
				notaMenor = notas[i];
			}
                    }
                    
                    promedio = suma/10;
                    System.out.println("----------------------------------------------");
                    System.out.println("El promedio de las 10 notas es: " + promedio);
                    System.out.println("La nota mayor es: " + notaMayor);
                    System.out.println("La nota menor es: " + notaMenor);
                    System.out.println("-----------------------------------------------\n");
                    break;
                    
                case 2:
                    for (int i = 1; i < 9; i++) {
                        System.out.print("Ingrese el dato " + (i) + ": ");
                        datos[i] = ingresar.nextDouble();
                        System.out.println("El dato ingresado fue: " + datos[i]);
                    }
                    
                    for (int i = 1; i < datos.length; i++) {
                        suma += datos[i];
                    }
                    
                    promedio = suma/8;
                    System.out.println("----------------------------------------------------");
                    System.out.println("La suma de los datos ingresados es: " + suma);
                    System.out.println("La media de los datos ingresados es: " + promedio);
                    System.out.println("----------------------------------------------------\n");
                    break;
                    
                case 3:
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
                    break;
                
                default:
                    System.out.println("--------------------------------------");
                    System.out.println("Opcion no valida, intente de nuevo");
                    System.out.println("---------------------------------------\n");
                    break;
            }
        }while(opcion>=1 && opcion<3);
    }
}
