package ejerciciosuniminuto;

import java.util.Scanner;

public class ejericicioPracticaProgramacion {
    public static void main(String[] args) {
        System.out.println("░██████╗░░█████╗░██████╗░░██████╗██╗░░░██╗░██████╗████████╗███████╗███╗░░░███╗\n" +
                           "██╔════╝░██╔══██╗██╔══██╗██╔════╝╚██╗░██╔╝██╔════╝╚══██╔══╝██╔════╝████╗░████║\n" +
                           "██║░░██╗░███████║██████╔╝╚█████╗░░╚████╔╝░╚█████╗░░░░██║░░░█████╗░░██╔████╔██║\n" +
                           "██║░░╚██╗██╔══██║██╔═══╝░░╚═══██╗░░╚██╔╝░░░╚═══██╗░░░██║░░░██╔══╝░░██║╚██╔╝██║\n" +
                           "╚██████╔╝██║░░██║██║░░░░░██████╔╝░░░██║░░░██████╔╝░░░██║░░░███████╗██║░╚═╝░██║\n" +
                           "░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═════╝░░░░╚═╝░░░╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░░░░╚═╝");
        System.out.println("La empresa GAPSYSTEM quiere saber que juego es mas recomendado por los usuarios");
        Scanner ingresar = new Scanner(System.in);
        String usuario;
        int contraseña;
        String genero;
        int contador = 0;
        int Nvotantes[];
        int Nv; 
        int M = 0, F = 0;
        int Cod = 0, Fortnite = 0, VB = 0, Votos = 0;
                 
        System.out.println("-------------------------------");
        System.out.print("Por favor digite su usuario: ");
        usuario = ingresar.nextLine();
        System.out.print(usuario+" por favor digite su contraseña: ");
        contraseña = ingresar.nextInt();
        System.out.println("-------------------------------");
         
        while (contraseña!= 123){
            System.out.println("ACCESO DENEGADO INTENTELO OTRA VEZ.");   
            contador+= 1;
            System.out.print(usuario+" Por favor digite su contraseña: ");
            contraseña = ingresar.nextInt();
            if  (contador > 2 ){
                System.out.println("ACCESO BLOQUEADO");
                break; 
            }      
        }
        if(contraseña == 123) {
            System.out.print("Ingrese el numero de votantes: ");
            Nv= ingresar.nextInt();
            if (Nv > 100) {
                System.out.println("La capacidad maxima de votantes es 100, intente de nuevo");
                System.out.print("Ingrese el numero de votantes: ");
                Nv= ingresar.nextInt();
            } else {
                Nvotantes = new int [Nv];
                for (int i= 0; i < Nvotantes.length; i++){
                    System.out.print("Ingrese el genero del votante numero " +(i+1) + ": ");
                    genero = ingresar.next();
                    switch (genero) {
                       case "m":
                            M += 1;
                            break;
                        case "f":
                            F += 1;
                            break;
                        default:
                            System.out.print("Genero no valido, digitelo nuevamente: ");
                            genero = ingresar.next();
                            break;
                    }
                }

                for (int j= 0; j < Nvotantes.length; j++){
                    System.out.println("----------------------------------------------------");
                    System.out.println("Seleccione su juego favorito votante numero"+(j+1));
                    System.out.println("1. Call of Duty\n" +
                                       "2. Fortnite\n" +
                                       "3. Voto en Blanco");
                    System.out.println("-----------------------------------------------------");
                    Votos = ingresar.nextInt();
                    switch (Votos) {
                        case 1:
                            Cod ++;
                            break;
                        case 2:
                            Fortnite ++;
                            break;
                        case 3:
                             VB ++;
                            break;  
                        default:
                            System.out.println("Opción no valida intente de nuevo");
                            break;
                    }
                }
            }

            System.out.println("");
            System.out.println("El numero de mujeres que votaron fue: "+F);
            System.out.println("El numero de hombres que votaron fue: "+M);
            if (Cod > Fortnite && Cod > VB ){
                System.out.println("La opción que tuvo mas votos fue Call of Duty con: "+Cod+" Votos");
            }else if(Fortnite > Cod && Fortnite > VB){
                System.out.println("La opción que tuvo mas votos fue Fortnite con: "+Fortnite+" Votos");
            } else {
                System.out.println("La opción que tuvo mas votos fue voto en blanco con: "+VB+" Votos");
            }
        }
    }
}
