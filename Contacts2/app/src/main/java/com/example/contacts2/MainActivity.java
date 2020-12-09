package com.example.contacts2;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    private List<Contact> contacts;

    private DataBaseHendler dbHendler;
    RecyclerView recyclerView;
    Context context;
    FloatingActionButton fab;

    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context =this;
        dbHendler=new DataBaseHendler(context);
        contacts =new ArrayList<>();

        contacts = dbHendler.getAllPersons();




        fab=findViewById(R.id.fabb);
        recyclerView=findViewById(R.id.recycView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        DividerItemDecoration dividerItemDecoration= new DividerItemDecoration(this, linearLayoutManager.getOrientation());

        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
         mAdapter =new MyAdapter(contacts);



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, add_activity.class );

                startActivity(intent);
            }
        });



    }
}