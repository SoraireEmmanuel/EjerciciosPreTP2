package com.example.ejerciciospretp2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.awt.font.TextAttribute;
import java.text.CollationElementIterator;

public class Respuesta extends Activity{

    private TextView txt_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.respuesta);

    int opcion;
    txt_mensaje=(TextView)findViewById(R.id.respuestaLayout);

    Bundle bundle = getIntent().getExtras();
    opcion=bundle.getInt("opcion");
    actualizarMensaje(opcion);
    }
    private void actualizarMensaje(int opcion){

        switch (opcion){
            case 0:

            txt_mensaje.setText(R.string.contrarespueta1);
                break;
            case 1:
               txt_mensaje.setText(R.string.contrarespuesta2);
                break;
            case 2:
              txt_mensaje.setText(R.string.contrarespuesta3);
                break;
            case 3:
                txt_mensaje.setText(R.string.contrarespuesta4);
                break;
        }
    }



}
