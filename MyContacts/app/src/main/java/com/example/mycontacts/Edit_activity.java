package com.example.mycontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Edit_activity extends AppCompatActivity {

    EditText in_name,in_lastName,in_number,in_mail;
    ImageView sav;
    String id , name, lastName,number,mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        in_name=findViewById(R.id.input_Name2);
        in_lastName=findViewById(R.id.input_LastName2);
        in_number=findViewById(R.id.input_Number2);
        in_mail=findViewById(R.id.input_Mail2);

        sav=findViewById(R.id.Saved_Contact2);



        sav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        getAndSetIntentData();
    }

    void  getAndSetIntentData(){
        if (getIntent().hasExtra("id")&& getIntent().hasExtra("name") && getIntent().hasExtra("lastName")&& getIntent().hasExtra("number")&& getIntent().hasExtra("mail")){

           //Getting
            id = getIntent().getStringExtra("id");
            name = getIntent().getStringExtra("name");
            lastName = getIntent().getStringExtra("lastName");
            number = getIntent().getStringExtra("number");
            mail = getIntent().getStringExtra("mail");

            //Setting
            in_name.setText(name);
            in_lastName.setText(lastName);
            in_number.setText(number);
            in_mail.setText(mail);
        }
        else {
            Toast.makeText(this,"No Data",Toast.LENGTH_SHORT).show();
        }
    }
}