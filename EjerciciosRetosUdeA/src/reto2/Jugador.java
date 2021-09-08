package reto2;

public class Jugador extends Personaje {
    //Inserte acá los atributos
    int numeroBotiquines = 0;
    
    //Inserte acá el método constructor
    /**
     * @param nombre
     * @param sexo
     * @param posicionX
     * @param posicionY
     * @param damage
     */
    public Jugador(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
        
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void usarBotiquin () {
        if (numeroBotiquines != 0) {
            numeroBotiquines --;
            vida += 5;
        }
        
        if (vida > 100) {
            vida = 100;
        }
    }
    
    public void recogerBotiquin() {
        numeroBotiquines ++;
    }
    
    public void moverDerecha(double d) {
        posicionX += d;
    }
    
    public void moverIzquierda(double d) {
        posicionX -= d;
    }
    
    public void moverArriba(double d) {
        posicionY += d;
    }
    
    public void moverAbajo(double d) {
        posicionY -= d;
    }

    public void golpear(Enemigo p) {
        super.golpear(p);
        p.evolucionar();
    }
     
    //Inserte acá los SETTERS Y GETTERS    
    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }
    
    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
}