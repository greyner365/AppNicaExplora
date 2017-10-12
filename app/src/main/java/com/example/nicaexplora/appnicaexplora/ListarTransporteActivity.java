package com.example.nicaexplora.appnicaexplora;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListarTransporteActivity extends AppCompatActivity {
    ListView idlist;
    ArrayList<String> listado;

    DataBaseHelper con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_transporte);
        idlist = (ListView) findViewById(R.id.idlist);
        cargarListado();
    }

    private void cargarListado(){
        listado = listaTransporte();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listado);
        idlist.setAdapter(adapter);

    }

    private ArrayList<String> listaTransporte(){
        ArrayList<String> datos = new ArrayList<String>();
        DataBaseHelper helper = new DataBaseHelper(this,"nicaexplora",null,1);
        SQLiteDatabase db = helper.getReadableDatabase();
        String sql = "SELECT NOMBRE,LUGAR,TELEFONO,TIPO,HORA,PRECIO,TERMINAL FROM TRANSPORTE";
        Cursor c = db.rawQuery(sql,null);
        if (c.moveToFirst()){
            do {
                String linea = "Transporte "+ c.getString(0);
                datos.add(linea);

            }while (c.moveToNext());
        }
        db.close();
        return datos;
    }
}
