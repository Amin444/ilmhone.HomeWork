package com.example.mycontacts;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyDtaBaseHendler extends SQLiteOpenHelper {

    private Context context;

private static final  int DATABASE_VERSIONS=1;
private static final  String DATABASE_NAME="ContactDb";
private static final  String TABLE_NAME="Contacts";

private static final String KEY_ID="Id";
private static final String NAME="Name";
private static final String LASTNAME="LastName";
private static final String NUMBER="Number";
private static final String GMAIL="Gmail";

    public MyDtaBaseHendler( Context context) {
        super(context,DATABASE_NAME,null, DATABASE_VERSIONS);
            this.context=context;
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =(" CREATE TABLE " + TABLE_NAME + " (" +  KEY_ID  + " INTEGER PRIMARY KEY AUTOINCREMENT, " + NAME + " TEXT, " + LASTNAME + " TEXT, " + NUMBER + " INTEGER, " + GMAIL + " TEXT);" );

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME);

        onCreate(db);
    }

     void  addContact(String name , String lastname, int number, String mail ){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues =new ContentValues();
        contentValues.put(NAME, name);
        contentValues.put(LASTNAME,lastname);
        contentValues.put(NUMBER,number);
        contentValues.put(GMAIL,mail);

        long result=  db.insert(TABLE_NAME,null,contentValues);

        if (result == -1){
            Toast.makeText(context,"failed",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(context, "Added  Successfully!", Toast.LENGTH_LONG).show();
        }
        db.close();
    }

    Cursor readAllData(){
        String query= " SELECT * FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = null;

        if (db !=null){
          cursor=  db.rawQuery(query,null);
        }
        return cursor;
    }

}
