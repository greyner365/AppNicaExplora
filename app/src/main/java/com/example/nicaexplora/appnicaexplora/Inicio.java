package com.example.nicaexplora.appnicaexplora;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        //creamos un nuevo handler de android
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //agregamos un intent
                Intent intent = new Intent(Inicio.this,MenuDesing.class);
                startActivity(intent);
            }

        //indicamos el tiempo de ejecucion
        },2000);
    }
}
