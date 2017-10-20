package com.example.nicaexplora.appnicaexplora;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuDesing extends AppCompatActivity {
    //FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_desing);

    }

    public void transporte(View v){
        Intent intent = new Intent(this,TransporteActivity.class);
        startActivity(intent);
    }
}
