package poo;

import java.util.ArrayList;

public class EjemploArryList {
        public static void main(String[] args) {
        //ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(427);
        numeros.add(-75);
        System.out.println(numeros.size()); 
        System.out.println(numeros.get(1)); 
        numeros.remove(2);
        System.out.println(numeros.size());   
        numeros.clear();
        System.out.println(numeros.size()); 
    }
}
