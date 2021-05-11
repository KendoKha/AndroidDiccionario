package com.example.diccionario;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;

public class Consulta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);


        ArrayAdapter<Palabra> adaptador = new ArrayAdapter<Palabra>
                (this, android.R.layout.simple_list_item_1, Diccionario.consulta());

        ListView lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(adaptador);


        //TODO EL TEMA DEL ORDEN

        Button btnOrdenar = (Button) findViewById(R.id.btnOrdenar);
        RadioButton rdBtnAlfabetico = (RadioButton) findViewById(R.id.rdBtnAlfabetico);
        RadioButton rdBtnOrdenPalabras = (RadioButton) findViewById(R.id.rdBtnOrdenPalabra);
        RadioButton rdBtnOrdenExpresion = (RadioButton) findViewById(R.id.rdBtnOrdenExpresion);

        btnOrdenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}