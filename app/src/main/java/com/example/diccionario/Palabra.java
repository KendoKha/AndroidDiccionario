package com.example.diccionario;

import java.time.LocalDateTime;
import java.util.Date;

public class Palabra {

    private String palabraEspagnol;
    private String palabraIngles;
    private Tipos tipo;
    private int aciertos;
    private LocalDateTime fechaIntroduccion;
    private Date ultimoTestRealizado;



    public Palabra(String palabraEspagnol, String palabraIngles, Tipos tipo){

        this.tipo = tipo;
        this.palabraEspagnol = palabraEspagnol;
        this.palabraIngles = palabraIngles;
        this.aciertos = 0;
        this.fechaIntroduccion = LocalDateTime.now();
    }
}
