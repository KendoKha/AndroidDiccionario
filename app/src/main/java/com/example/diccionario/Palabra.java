package com.example.diccionario;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Date;

public class Palabra {

    private String palabraEspagnol;
    private String palabraIngles;
    private Tipos tipo;
    private int aciertos;
    private LocalDateTime fechaIntroduccion;
    private Date ultimoTestRealizado;

    public static Comparator<Palabra> palabraComparator = new Comparator<Palabra>() {
        @Override
        public int compare(Palabra o1, Palabra o2) {
            return 0;
        }
    };



    public Palabra(String palabraEspagnol, String palabraIngles, Tipos tipo){

        this.tipo = tipo;
        this.palabraEspagnol = palabraEspagnol;
        this.palabraIngles = palabraIngles;
        this.aciertos = 0;
        this.fechaIntroduccion = LocalDateTime.now();
    }

    public String dimePalabraEsp(){
        return this.palabraEspagnol;
    }

    public String dimePalabraIng(){
        return this.palabraIngles;
    }

    public int getAciertos(){
        return this.aciertos;
    }

    @Override
    public String toString() {
        return "palabraEspagnol='" + palabraEspagnol + '\'' +
                ", palabraIngles='" + palabraIngles + '\'';
    }



}
