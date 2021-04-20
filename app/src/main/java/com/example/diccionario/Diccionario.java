package com.example.diccionario;

import java.util.ArrayList;

public class Diccionario {

    private static ArrayList<Palabra> palabras = new ArrayList<Palabra>();



    public static void addPalabra(Palabra p){
        palabras.add(p);
    }

    public static ArrayList<Palabra> getDiccionario(){
        return palabras;
    }


}
