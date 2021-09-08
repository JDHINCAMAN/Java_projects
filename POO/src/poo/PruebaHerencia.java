package poo;

public class PruebaHerencia {
    public static void main(String[] args) {
        BicicletaMontana miTrochera;
        miTrochera = new BicicletaMontana();
        System.out.println("Mi bicicleta es de marca " + miTrochera.getMarca()
                + ", de color " + miTrochera.getColor()
                + ", con una velocidad de " + miTrochera.getVelocidad()
                + " y está en el cambio " + miTrochera.getCambio());
        miTrochera.setMarca("Specialized");
        miTrochera.setColor("Rojo");
        miTrochera.subirCambio();
        miTrochera.subirCambio();
        miTrochera.subirCambio();
        miTrochera.pedalear(5);
        miTrochera.pedalear(5);
        System.out.println("Mi bicicleta es de marca " + miTrochera.getMarca()
                + ", de color " + miTrochera.getColor()
                + ", con una velocidad de " + miTrochera.getVelocidad()
                + " y está en el cambio " + miTrochera.getCambio());
    }
}
