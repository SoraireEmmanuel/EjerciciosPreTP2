package com.example.ejerciciospretp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ejemplo1(View v){

        Intent ejercicio1 = new Intent(this, Ejercicio1.class);

        startActivity(ejercicio1);

    }
    public void ejemplo2(View v){
        Intent ejercicio2 = new Intent(this, Ejercicio2.class);
        startActivity(ejercicio2);
   }

}
