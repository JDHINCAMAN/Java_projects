package Interfaces;

/*
las interfaces no se instancian, ni las clases heredan de ellas;
una interfaz se implementa. Es decir, una clase puede 
implementar una o varias interfaces, usando la palabra clave 
implements. Y si una clase implementa una interfaz, deberá 
implementar, es decir, darle cuerpo, a todos los métodos de 
dicha interfaz.
*/

public class Parlante implements VolumenGraduable {
    //Código de atributos propios del parlante
    //Código de constructores propios del parlante
    //Código de métodos propios del parlante
    
    @Override
    public void subirVolumen() {
        //Sube el volumen del parlante
    }

    @Override
    public void bajarVolumen() {
        //Sube el volumen del parlante
    }
}     