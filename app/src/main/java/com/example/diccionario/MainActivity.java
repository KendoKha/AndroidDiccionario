package com.example.diccionario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button btnIntro = (Button) findViewById(R.id.btn1);
        Button btnConsulta = (Button) findViewById(R.id.btnConsultas);

        btnIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==btnIntro){
                    Intent intentIntro = new Intent(MainActivity.this, Introduccion.class);

                    MainActivity.this.startActivity(intentIntro);

                }
            }
        });

        btnConsulta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(v==btnConsulta){
                    Intent intentConsulta = new Intent(MainActivity.this, Consulta.class);

                    MainActivity.this.startActivity(intentConsulta);
                }
            }
        });



    }








}