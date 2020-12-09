package com.example.mycontacts;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class More_activity extends AppCompatActivity {



    TextView name,lastName, number,mail;
    ImageView imageView;
    @Override
    public void onCreate( Bundle savedInstanceState,  PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_more);

        name=findViewById(R.id.nameText);
        lastName=findViewById(R.id.lastNameText);
        number =findViewById(R.id.numbertxt);
        mail =findViewById(R.id.mailtxt);
        imageView=findViewById(R.id.profileImage);

        Intent intent  =getIntent();
        if (intent!=null){
            name.setText(intent.getStringExtra("mName"));
        }
    }
}
