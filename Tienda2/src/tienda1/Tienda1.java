
package tienda1;

//Importo el paquete de mis clases
import misClases.*;

//import java.io.*;
import java.util.ArrayList;
//import java.util.Scanner;


public class Tienda1 {

    public String Nombre;
    public String ciudad;
    public static ArrayList<Producto> inventario = new ArrayList<>();
    
    private int ID;
    
    public static void main(String[] args){
        
        Trabajador juan = new Trabajador("Juan","123");
        Trabajador pedro = new Trabajador("Pedro","321");
        Trabajador lina = new Trabajador("Lina","000");
        
        Trabajador[] listaTrabajadores = {juan, pedro, lina};
        
        Ingreso inPersona = new Ingreso(listaTrabajadores);
        inPersona.setVisible(true);
        
        
        
    }
    
    public void Contratar(Trabajador nTrabajador){
       
    }
 
    public void PagarArriendo(double canon){
    
    }
    
    public Producto[] Inventario(){
        
        Producto[] miInventario = new Producto[1];// Arreglo de objetos de tipo Producto
        
        return miInventario;
    }
    
    public static void validarInventario(ArrayList inventario){
    
        System.out.println("Inventario validado");
        Tienda1.inventario=inventario;
        
    }
    

    
    
}


