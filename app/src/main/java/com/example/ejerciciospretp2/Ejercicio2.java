package com.example.ejerciciospretp2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Ejercicio2 extends Activity {

    private Button btn_enviar;
    private RadioGroup respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio2);

        btn_enviar=(Button)findViewById(R.id.btn_ej2);
        respuesta=(RadioGroup)findViewById(R.id.Respuesta);
        btn_enviar.setOnClickListener(enviarListener);
    }

    private View.OnClickListener enviarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int radioButtonID=respuesta.getCheckedRadioButtonId();
            View radioButton=respuesta.findViewById(radioButtonID);
            int indice=respuesta.indexOfChild(radioButton);
            Intent i = new Intent(Ejercicio2.this,Respuesta.class);
            i.putExtra("opcion", indice);
            startActivity(i);
        }
    };

}