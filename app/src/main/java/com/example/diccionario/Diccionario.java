package com.example.diccionario;

import java.util.ArrayList;

public class Diccionario {

    private ArrayList<Palabra> palabras = new ArrayList<Palabra>();



    public void addPalabra(Palabra p){
        palabras.add(p);
    }

    public ArrayList<Palabra> getDiccionario(){
        return this.palabras;
    }


}
