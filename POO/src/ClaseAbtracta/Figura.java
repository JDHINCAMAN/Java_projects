package ClaseAbtracta;

/*
Una clase abstracta es una clase que cuenta con uno o varios 
métodos abstractos. Un método abstracto es aquel en el cual se 
declara el nombre, su tipo de retorno, y sus parámetros, pero
se especifica como abstracto y como tal no tiene cuerpo 
(no cuenta como implementación). La idea es que son las 
subclases (clases hijas) de las clases abstractas las 
encargadas de dar cuerpo (implementar) el o los métodos 
abstractos. Además, una clase abstracta no se puede instanciar. 
Las que sí se podrían instanciar son sus clases hijas. 
En todo lo demás, una clase abstracta funciona como una clase
padre cualquiera.
*/

public abstract class Figura {
    public abstract double getArea();
    public abstract double getPerimetro();
}     
