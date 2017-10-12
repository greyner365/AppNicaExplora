package com.example.nicaexplora.appnicaexplora;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActualizarTransporteActivity extends AppCompatActivity {
    EditText txtnombre,txtlugar,txttel,txthora,txtprecio;
    RadioButton rdrut, rdexpreso, rdnorte, rdsur;
    RadioGroup rdtipo;
    Button btnmodificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar_transporte);
        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtlugar = (EditText) findViewById(R.id.txtlugar);
        txttel = (EditText) findViewById(R.id.txttel);
        txthora = (EditText) findViewById(R.id.txthora);
        txtprecio = (EditText) findViewById(R.id.txtprecio);

        rdrut = (RadioButton) findViewById(R.id.rdrut);
        rdexpreso = (RadioButton) findViewById(R.id.rdexpreso);
        rdnorte = (RadioButton) findViewById(R.id.rdnorte);
        rdsur = (RadioButton) findViewById(R.id.rdsur);
        rdtipo = (RadioGroup) findViewById(R.id.rdtipo);


        btnmodificar = (Button) findViewById(R.id.btnmodificar);
    }

    /*public void modificar(View view){
        DataBaseHelper helper = new DataBaseHelper(this,"nicaexplora",null,1);
        SQLiteDatabase db = helper.getWritableDatabase();
        String sql = "UPDATE TRANSPORTE SET NOMBRE=" + txtnombre.getText().toString() +
                ",LUGAR = "+txtlugar.getText().toString() + ",TELEFONO =" + txttel.getText().toString()+
                "HORA = "+txthora+",PRECIO = "+txtprecio+"WHERE ID = " +


    }*/

}
