package com.example.diccionario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
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

                        if(rdPalabra.isChecked()){
                            Diccionario.addPalabra(new Palabra(palabraEsp.getText().toString(), palabraIng.getText().toString(), Tipos.Palabra));
                            palabraEsp.setText("");
                            palabraIng.setText("");
                            Dialog dPalabra = createAlertDialog("Nueva palabra añadida");
                            dPalabra.show();

                        }else{
                            Diccionario.addPalabra(new Palabra(palabraEsp.getText().toString(), palabraIng.getText().toString(), Tipos.Expresion));
                            palabraEsp.setText("");
                            palabraIng.setText("");
                            Dialog dExpresion = createAlertDialog("Nueva expresión añadida");
                            dExpresion.show();
                        }

                    }
            }}

        });

    }

    private Dialog createAlertDialog(String s){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Introducción realizada");
        builder.setMessage(s);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int which){
                dialog.cancel();
            }
        });
        return builder.create();
    }
}