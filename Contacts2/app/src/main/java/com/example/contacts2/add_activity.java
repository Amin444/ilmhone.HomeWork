package com.example.contacts2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class add_activity extends AppCompatActivity {

     EditText WrName;
     EditText WrLastName;
     EditText WrNumber;
     EditText WrGmail;
     ImageView save;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        WrName=findViewById(R.id.WrName);
        WrLastName=findViewById(R.id.WrLastName);
        WrNumber=findViewById(R.id.WrNumb);
        WrGmail=findViewById(R.id.WrGmail);
        save =findViewById(R.id.Saved_Contact);



        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }



        });

    }







}

