package com.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;

public class MainActivity extends AppCompatActivity  {

    RecyclerView recyclerView;
    FloatingActionButton fab;

    MyDtaBaseHendler mydb;
    ArrayList<String> con_id, con_name,  con_lastName, con_number, con_mail;

    ContactAdapter contactAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);
        fab=findViewById(R.id.fab);

       fab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent =new Intent(MainActivity.this, Add_activity.class);
               startActivity(intent);
           }
       });


       mydb=new MyDtaBaseHendler(MainActivity.this);

        con_id =new ArrayList<>();
        con_name =new ArrayList<>();
        con_lastName =new ArrayList<>();
        con_number =new ArrayList<>();
        con_mail =new ArrayList<>();

        storeDataInArrays();


        contactAdapter =new ContactAdapter(con_id,con_name,con_lastName,con_number,con_mail,this,MainActivity.this);
        recyclerView.setAdapter(contactAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }

    void  storeDataInArrays(){

        Cursor cursor =mydb.readAllData();

        if (cursor.getCount()==0){
            Toast.makeText(this,"No Data",Toast.LENGTH_SHORT).show();
            }
        else {
            while (cursor.moveToNext()){
                con_id.add(cursor.getString(0));
                con_name.add(cursor.getString(1));
                con_lastName.add(cursor.getString(2));
                con_number.add(cursor.getString(3));
                con_mail.add(cursor.getString(4));
            }

        }
    }


}