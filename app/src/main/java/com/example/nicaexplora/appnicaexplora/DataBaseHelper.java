package com.example.nicaexplora.appnicaexplora;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Greyner on 10/10/2017.
 */

public class DataBaseHelper extends SQLiteOpenHelper{


    String crearTablaTransporte ="CREATE TABLE TRANSPORTE(ID INTEGER PRIMARY KEY AUTOINCREMENT, NOMBRE TEXT, LUGAR TEXT," +
            "TELEFONO TEXT,TIPO TEXT,HORA TEXT,PRECIO TEXT,TERMINAL TEXT)";

    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(crearTablaTransporte);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE TRANSPORTE");
        onCreate(db);
    }


}
