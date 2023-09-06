package com.generico.main.interfaces;

import com.generico.main.generia.Generico;

public class MainTest {
    public static void main(String[] args) {

        IOperaciones operaciones = new OperacionesImp();
        System.out.println(operaciones.suma(12,23));
        System.out.println(operaciones.producto(2,4));
        System.out.println( operaciones.resta(23,7));


        Generico<String> generico = new Generico<>(String.class,4);
        generico.add("hoa");
        generico.add("dos");
        generico.add("tres");
        generico.add("cuatro");

        System.out.println(generico.getIndex(1));
        System.out.println(generico.getIndex(3));


    }
}
