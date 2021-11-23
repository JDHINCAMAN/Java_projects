package ejerciciosuniminuto;

import java.util.Scanner;

public class pruebaParcialCompañeros {
    public static void main(String[] args) {
          
        System.out.println("░██████╗░░█████╗░██████╗░░██████╗██╗░░░██╗░██████╗████████╗███████╗███╗░░░███╗\n" +
                           "██╔════╝░██╔══██╗██╔══██╗██╔════╝╚██╗░██╔╝██╔════╝╚══██╔══╝██╔════╝████╗░████║\n" +
                           "██║░░██╗░███████║██████╔╝╚█████╗░░╚████╔╝░╚█████╗░░░░██║░░░█████╗░░██╔████╔██║\n" +
                           "██║░░╚██╗██╔══██║██╔═══╝░░╚═══██╗░░╚██╔╝░░░╚═══██╗░░░██║░░░██╔══╝░░██║╚██╔╝██║\n" +
                           "╚██████╔╝██║░░██║██║░░░░░██████╔╝░░░██║░░░██████╔╝░░░██║░░░███████╗██║░╚═╝░██║\n" +
                           "░╚═════╝░╚═╝░░╚═╝╚═╝░░░░░╚═════╝░░░░╚═╝░░░╚═════╝░░░░╚═╝░░░╚══════╝╚═╝░░░░░╚═╝");
        System.out.println("La empresa GAPSYSTEM es una empresa dedicada al desarrollo de softwarepara la industria farmaceutica /n"
                + "Esta empresa soluciona a nivel tecnologico el manejo de información de farmacias y de cadena farmaceutica");
        Scanner ingresar = new Scanner(System.in);
        String usuario,producto;
        int contraseña;
        int contador = 0;
        int cod,cantidad,precio,op =0;
     
        System.out.println("-------------------------------");
        System.out.print("Por favor digite su usuario: ");
        usuario = ingresar.nextLine();
        System.out.print(usuario+" por favor digite su contraseña: ");
        contraseña = ingresar.nextInt();
        System.out.println("-------------------------------");
         
        while (contraseña!= 686525){
            System.out.println("ACCESO DENEGADO INTENTELO OTRA VEZ.");   
            contador+= 1;
            System.out.print(usuario+" Por favor digite su contraseña: ");
            contraseña = ingresar.nextInt();
            if  (contador >= 2 ){
                System.out.println("ACCESO BLOQUEADO");
                break; 
            }      
        }
        if(contraseña == 686525) {  
            do  {
                System.out.println("DROGAS GAP");
                System.out.println("1.Ingresar Productos");
                System.out.println("2.Busqueda de productos");
                System.out.println("3.Facturación");
                System.out.println("4.Salir");
                System.out.println("Eliga la opción que necesite");
                op =ingresar.nextInt();
            }while (op!=4);    
        }          
    }
}
