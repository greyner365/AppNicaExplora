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

public class TransporteActivity extends AppCompatActivity {
    EditText txtnombre,txtlugar,txttel,txthora,txtprecio;
    RadioButton rdrut, rdexpreso, rdnorte, rdsur;
    RadioGroup rdtipo;
    Button btnguardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transporte);
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


        btnguardar = (Button) findViewById(R.id.btnguardar);
    }


    public void guardar(View view){
        DataBaseHelper helper = new DataBaseHelper(this,"nicaexplora",null,1);
        SQLiteDatabase db = helper.getWritableDatabase();
        try {
            ContentValues c = new ContentValues();
            c.put("nombre",txtnombre.getText().toString());
            c.put("lugar",txtlugar.getText().toString());
            c.put("telefono",txttel.getText().toString());
            if(rdexpreso.isChecked()){
                c.put("tipo",rdexpreso.getText().toString());
            }
            else if(rdrut.isChecked()){
                c.put("tipo",rdrut.getText().toString());
            }
            c.put("hora",txthora.getText().toString());
            c.put("precio",txtprecio.getText().toString());
            if(rdnorte.isChecked()){
                c.put("terminal",rdnorte.getText().toString());
            }
            else if(rdsur.isChecked()){
                c.put("terminal",rdsur.getText().toString());
            }

            db.insert("TRANSPORTE",null,c);
            db.close();
            Toast.makeText(this,"Registro de transporte guardado",Toast.LENGTH_SHORT).show();

        }catch (Exception e){
            Toast.makeText(this,"Error: "+ e.getMessage(),Toast.LENGTH_SHORT).show();
        }

    }
}
