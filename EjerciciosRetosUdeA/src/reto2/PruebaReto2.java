package reto2;

public class PruebaReto2 {
    public static void main(String[] args) {
        Jugador j = new Jugador("Explorador", 'm', 0, 5, 100);
        Enemigo e = new Enemigo("Bitter", 'f', 0, 0, 80);
        
        j.golpear(e);
        j.golpear(e);
        j.moverDerecha(10);
        j.moverAbajo(5);
        
        e.golpear(j);
        e.golpear(j);
        j.recogerBotiquin();
        
        j.usarBotiquin();
        j.usarBotiquin();
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        
        e.golpear(j);
        e.golpear(j);
        
        j.golpear(e);
        j.golpear(e);
        
        j.golpear(e);
        j.golpear(e);
        j.golpear(e);
        
        System.out.println("Datos Jugador:");
        System.out.print("Nombre: ");
        System.out.println(j.getNombre());
        System.out.print("Sexo: ");
        System.out.println(j.getSexo());
        System.out.print("PosicionX: ");
        System.out.println(j.getPosicionX());
        System.out.print("PosicionY: ");
        System.out.println(j.getPosicionY());
        System.out.print("Daño: ");
        System.out.println(j.getDamage());
        System.out.print("Vida: ");
        System.out.println(j.getVida());
        System.out.print("Numero botiquines: ");
        System.out.println(j.getNumeroBotiquines());
        
        System.out.println("");
        
        System.out.println("Datos Enemigo:");
        System.out.print("Nombre: ");
        System.out.println(e.getNombre());
        System.out.print("Sexo: ");
        System.out.println(e.getSexo());
        System.out.print("PosicionX: ");
        System.out.println(e.getPosicionX());
        System.out.print("PosicionY: ");
        System.out.println(e.getPosicionY());
        System.out.print("Daño: ");
        System.out.println(e.getDamage());
        System.out.print("Vida: ");
        System.out.println(e.getVida());
        System.out.print("Evoluciones aplicadas: ");
        System.out.println(e.getEvolucionesAplicadas());
        System.out.print("Resistencia: ");
        System.out.println(e.getResistencia());
    }
}
