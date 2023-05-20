package IteratorPattern;

import java.util.Iterator;

public class ListaEnlazada implements Iterable<Integer> {
    private Nodo inicio;

    public void agregar(int val) {
        if (inicio == null) {
            inicio = new Nodo(val);
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = new Nodo(val);
        }
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new Iterador(inicio);
    }

    private static class Iterador implements Iterator<Integer> {
        private Nodo actual;
        public Iterador(Nodo nodo) {
            actual = nodo;
        }

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                return null;
            }
            int valor = actual.valor;
            actual = actual.siguiente;
            return valor;
        }
    }
}

