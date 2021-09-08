package reto3;

public class PruebaReto3 {
    public static void main(String[] args) {
        Estudiante j = new Estudiante("1000939089", "Juan David Hincapie Manrique", "nverdolaga2003@gmail.com", "Español");
        j.dirigir();
        System.out.print("Url Estudiante: ");
        System.out.println(j.getUrl());
        System.out.print("Id Estudiante: ");
        System.out.println(j.getId());
        System.out.print("Nombre Estudiante: ");
        System.out.println(j.getNombre());
        System.out.print("Correo Estudiante: ");
        System.out.println(j.getEmail());
        System.out.print("Idioma Estudiante: ");
        System.out.println(j.getIdioma());
        
        System.out.println("");
        
        Estudiante h = new Estudiante("0018-5978", "Hannah Adams", "hadams45@gmail.com", "English");
        h.dirigir();
        System.out.print("Url Estudiante: ");
        System.out.println(h.getUrl());
        System.out.print("Id Estudiante: ");
        System.out.println(h.getId());
        System.out.print("Nombre Estudiante: ");
        System.out.println(h.getNombre());
        System.out.print("Correo Estudiante: ");
        System.out.println(h.getEmail());
        System.out.print("Idioma Estudiante: ");
        System.out.println(h.getIdioma());
    }
}
