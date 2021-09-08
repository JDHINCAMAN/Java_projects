package reto2;

public class Enemigo extends Personaje{
    //Inserte acá los atributos
    int evolucionesAplicadas = 0;
    int resistencia = 1;
    
    //Inserte acá el método constructor
    /**
     * @param nombre
     * @param sexo
     * @param posicionX
     * @param posicionY
     * @param damage
     */
    public Enemigo(String nombre, char sexo, double posicionX, double posicionY, double damage) {
        super(nombre, sexo, posicionX, posicionY, damage);
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void evolucionar() {
        if (vida < 0) {
            setVida(0);
        }
        
        if (vida <= 30 && vida > 0 && evolucionesAplicadas == 0) {
            damage += 20;
            evolucionesAplicadas ++;
        }
        
        if (vida <= 10 && vida > 0 && evolucionesAplicadas == 1) {
            resistencia ++;
            evolucionesAplicadas ++;
        }
    }
    
    @Override
    public void recibirImpacto(double d) {
        vida -= d / resistencia;
    }
    
    //Inserte acá los SETTERS Y GETTERS
    public int getEvolucionesAplicadas() {
        return evolucionesAplicadas;
    }
    
    public void setEvolucionesAplicadas(int evolucionesAplicadas) {
        this.evolucionesAplicadas = evolucionesAplicadas;
    }
    
    public int getResistencia() {
        return resistencia;
    }
    
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}