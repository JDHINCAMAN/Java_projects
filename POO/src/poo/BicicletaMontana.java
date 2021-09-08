package poo;

public class BicicletaMontana extends Bicicleta {

    private int cambio;

    public BicicletaMontana() {
        super();
        this.cambio = 6;
    }

    /**
     *
     * @param cambio
     * @param marca
     * @param color
     * @param velocidadInicial
     */
    public BicicletaMontana(int cambio, String marca, String color, double velocidadInicial) {
        super(marca, color, velocidadInicial);
        if(cambio > 0 && cambio <= 12) {
            this.cambio = cambio;
        } else {
            this.cambio = 6;
        }
    }

    public void subirCambio() {
        if (this.cambio < 12) {
            cambio++;
        }
    }

    public void bajarCambio() {
        if (this.cambio > 1) {
            cambio--;
        }
    }

    public int getCambio() {
        return this.cambio;
    }
    
    @Override
    public void pedalear(double aceleracion) {
        double aceleracionConCambios = aceleracion * (this.cambio/6.0);
        super.pedalear(aceleracionConCambios);
    }
    
    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", y en el cambio " + cambio;
    }
}