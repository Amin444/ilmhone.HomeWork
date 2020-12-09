package Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import Model.Persons;
import com.example.contacts2.Util;


public class DataBaseHendler extends SQLiteOpenHelper {

    public  DataBaseHendler(Context context) {
        super(context,Util.DATABASE_NAME,null, Util.DATABASE_VERSIONS);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" CREATE TABLE " + Util.TABLE_NAME + "(" + Util.KEY_ID + "INTEGER PRIMARY KEY, " + Util.NAME + " TEXT," + Util.LASTNAME + " TEXT, " + Util.NUMBER + " TEXT, " + Util.GMAIL + " TEXT " + ")" );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Util.TABLE_NAME);

        onCreate(db);
    }



    //INSERT-Contacts

    public void AddPersons(Persons persons){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues =new ContentValues();

        contentValues.put(Util.NAME,persons.getName());
        contentValues.put(Util.LASTNAME,persons.getLastName());
        contentValues.put(Util.NUMBER,persons.getNumber());
        contentValues.put(Util.GMAIL,persons.getGmail());

        db.insert(Util.TABLE_NAME,null,contentValues);

        db.close();
    }

    //READ Contacts

    public Persons gerPersons( int id){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor =db.query(Util.TABLE_NAME,new String[] {Util.KEY_ID,Util.NAME,Util.LASTNAME,Util.NUMBER,Util.GMAIL},Util.KEY_ID + "+?",new String[]{String.valueOf(id)},null,null,null);

        if (cursor != null){
            cursor.moveToFirst();
        }

        Persons persons =new Persons(Integer.parseInt(cursor.getString(0)),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4));

        return persons;
    }

    public List<Persons> getAllPersons(){
        SQLiteDatabase db = this.getReadableDatabase();

        List<Persons> PerList=new ArrayList<>();

        String  seletctAllPersons ="SELECT * FROM " + Util.TABLE_NAME;

        Cursor cursor =db.rawQuery(seletctAllPersons,null);

        if (cursor.moveToFirst()){
            do {
                Persons persons= new Persons();
                persons.setId(Integer.parseInt(cursor.getString(0)));
                    persons.setName(cursor.getString(1));
                persons.setLastName(cursor.getString(2));
                persons.setNumber(cursor.getString(3));
                persons.setGmail(cursor.getString(4));

                PerList.add(persons);
            }while (cursor.moveToFirst());
        }
        return PerList;
    }

}
