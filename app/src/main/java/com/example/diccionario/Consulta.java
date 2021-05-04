package com.example.diccionario;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Consulta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);


        ArrayAdapter<Palabra> adaptador = new ArrayAdapter<Palabra>
                (this, android.R.layout.simple_list_item_1, Diccionario.getDiccionario());

        ListView lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(adaptador);

    }
}