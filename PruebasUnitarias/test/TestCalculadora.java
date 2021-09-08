import static org.junit.Assert.assertEquals;
import org.junit.Test;
import pruebasunitarias.Calculadora;

public class TestCalculadora {
    /* Pruebas unitarias para el cuadrado
    - El primer parámetro, con el valor que esperamos que
    devuelva el método de la clase Calculadora  que estamos 
    llamando, de acuerdo con un valor de entrada.
    - El segundo, donde hacemos el llamado al método de la 
    clase Calculadora  que queremos probar, pasándole un valor
    de entrada.
    - El tercero, que consiste en un margen de error aceptable
    a la hora de evaluar si lo devuelto por el método evaluado
    es igual al valor esperado.
    */
    @Test
    public void testCuadradoPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals(25.0, calc.cuadrado(5.0), 0.000000001);
    }

    @Test
    public void testCuadradoCero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.cuadrado(0.0), 0.000000001);
    }

    @Test
    public void testCuadradoUno() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.cuadrado(1.0), 0.000000001);
    }

    @Test
    public void testCuadradoNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(16.0, calc.cuadrado(-4.0), 0.000000001);
    }

    //Pruebas unitarias para el cubo
    @Test
    public void testCuboPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals(125.0, calc.cubo(5.0), 0.000000001);
    }

    @Test
    public void testCuboCero() {
        Calculadora calc = new Calculadora();
        assertEquals(0.0, calc.cubo(0.0), 0.000000001);
    }

    @Test
    public void testCuboUno() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.cubo(1.0), 0.000000001);
    }

    @Test
    public void testCuboMenosUno() {
        Calculadora calc = new Calculadora();
        assertEquals(-1.0, calc.cubo(-1.0), 0.000000001);
    }

    @Test
    public void testCuboNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(-64.0, calc.cubo(-4.0), 0.000000001);
    }
}