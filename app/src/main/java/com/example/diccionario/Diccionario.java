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

    public static ArrayList consulta(){
        ArrayList consulta = new ArrayList();

        for(int i =0; i<palabras.size();i++){
            consulta.add("Palabra castellano: "+palabras.get(i).dimePalabraEsp()+"     Palabra inglés"+palabras.get(i).dimePalabraIng());
        }

        return consulta;
    }


}
