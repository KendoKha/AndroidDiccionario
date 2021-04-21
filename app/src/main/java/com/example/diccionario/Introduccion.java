package com.example.diccionario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Introduccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduccion);


        Button btnNuevaPalabra = (Button) findViewById(R.id.btnNuevaPalabra);
        TextView palabraEsp = (TextView) findViewById(R.id.txtPalabraCastellano);
        TextView palabraIng = (TextView) findViewById(R.id.txtPalabraIngles);
        RadioButton rdPalabra = (RadioButton) findViewById(R.id.rdBtnPalabra);
        RadioButton rdExpresion = (RadioButton) findViewById(R.id.rdBtnExpresion);

        btnNuevaPalabra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(palabraEsp.getText().toString() != "" && palabraIng.getText().toString() != ""){
                    if(rdPalabra.isChecked() || rdExpresion.isChecked()) {

                        Diccionario.addPalabra(new Palabra(palabraEsp.getText().toString(), palabraIng.getText().toString()));
                        palabraEsp.setText("");
                        palabraIng.setText("");
                    }else{

                    }
            }}
        });


    }
}