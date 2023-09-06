package com.generico.main.generia;

import java.lang.reflect.Array;

public class Generico <T> {
    private final T [] elementos;
    private int i;

    private int capacidad;

    @SuppressWarnings("unchecked")
    public Generico(Class<T> tClass, int capacidadInicial){
        this.elementos = (T[]) Array.newInstance(tClass,capacidadInicial);
        this.capacidad = capacidadInicial;
        this.i = 0;
    }

    public void add (T t){
        elementos[i] = t;
        i++;
    }

    public T[] get(){
        return elementos;
    }

    public T getIndex(int i){
        return elementos[i];
    }
}
