package Interfaces;

/*
En Java, una interfaz es un tipo similar a una clase 
(no confundir con interfaces gráficas de usuario), que sólo 
puede contener:

• Constantes (ya que los atributos que les agreguemos serán 
public static final de manera implícita y por defecto).

• Declaraciones de métodos públicos (es decir, sin cuerpo), 
que por defecto y de manera implícita serán abstract final.

• Métodos estáticos.

• Métodos default.

En la mayoría de los casos, las interfaces cuentan con las dos 
primeras opciones, es decir, constantes y declaraciones de 
métodos. Además, de manera similar a como pasa con las clases
abstractas, una interfaz no puede ser instanciada, sino que
puede ser implementada por una clase o bien ser heredada por 
otra interfaz.
*/

public interface VolumenGraduable {
    public void subirVolumen();
    public void bajarVolumen();
}      
