package ejerciciosuniminuto;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class pruebaDiccionario {
    public static void main(String[] args) {
        // De esta forma creo mi diccionario en java
        Hashtable<String, Integer> personasyEdades = new Hashtable<>();

        // De esta forma asocio a una persona con su edad en el diccionario
        personasyEdades.put("Juan", 25);
        personasyEdades.put("Roberto", 12);
        personasyEdades.put("Laura", 29);
        System.out.println(personasyEdades);
        System.out.println("--------------------------------");

        // De esta forma obtenemos la edad de Juan
        System.out.println(personasyEdades.get("Juan"));
        System.out.println("--------------------------------");

        // De esta forma podemos recorrer la lista de personas junto a sus edades
        for (Entry<String, Integer> entry : personasyEdades.entrySet()) {
             System.out.println(entry.getKey() + " tiene " + entry.getValue() + " años");
        }
       
        System.out.println("---------------------------------------");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        if (hashMap.containsKey("A")) {
            System.out.printf("Contiene la clave A. Su valor es: %d\n", hashMap.get("A"));
        }

        if (hashMap.containsValue(0)) {
            System.out.println("Contiene el valor 0");
        }

        int aparicionesDeA = hashMap.get("A");
        hashMap.remove("A");

        // Ahora ponemos varios elementos para imprimirlos
        hashMap.put("cantidad", 5);
        hashMap.put("codigo", 123);
        hashMap.put("precio", 15000);
        for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.printf("Clave: %s. Valor: %d\n", entry.getKey(), entry.getValue());
        }
    }
}
