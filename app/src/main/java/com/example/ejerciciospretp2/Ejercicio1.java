package com.example.ejerciciospretp2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Ejercicio1 extends Activity {
    private Button btn_gracias;
    private Button btn_estornudar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio1);

        btn_gracias = (Button) findViewById(R.id.btn_Gracias);
        btn_estornudar = (Button) findViewById((R.id.btn_Estornudar));

        btn_gracias.setOnClickListener(graciasListener);
        btn_estornudar.setOnClickListener(estornudarListener);
    }

    private View.OnClickListener graciasListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(Ejercicio1.this, "De Nada!",
                    Toast.LENGTH_LONG).show();
        }
    };

    private View.OnClickListener estornudarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(Ejercicio1.this, "Gracias",
            Toast.LENGTH_LONG).show();
        }
    };




}






