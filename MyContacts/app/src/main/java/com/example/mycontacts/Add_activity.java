package com.example.mycontacts;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Add_activity extends AppCompatActivity {


    EditText in_name, in_LastName, in_number , in_mail;
    ImageView save;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        in_name =findViewById(R.id.input_Name);
        in_LastName =findViewById(R.id.input_LastName);
        in_number =findViewById(R.id.input_Number);
        in_mail =findViewById(R.id.input_Mail);
        save =findViewById(R.id.Saved_Contact);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDtaBaseHendler mydb=new MyDtaBaseHendler(Add_activity.this);

                mydb.addContact(in_name.getText().toString().trim(),
                                in_LastName.getText().toString().trim(),
                              Integer.valueOf(in_number.getText().toString().trim()),
                                in_mail.getText().toString().trim());
            }
        });
    }
}
