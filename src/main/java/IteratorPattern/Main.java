package IteratorPattern;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar(1);
        lista.agregar(2);
        lista.agregar(3);

        Iterator<Integer> iterador = lista.iterator();
        while (iterador.hasNext()) {
            int valor = iterador.next();
            System.out.println(valor);
        }
    }
}
