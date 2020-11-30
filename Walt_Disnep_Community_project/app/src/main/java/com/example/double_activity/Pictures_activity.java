package com.example.double_activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Pictures_activity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    ImageView iw;
    int counter =0;
    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pictures);
        iw=findViewById(R.id.walt);
        textView=findViewById(R.id.maintext);
       imageView=findViewById(R.id.mouse);
       imageView=findViewById(R.id.sss);
       imageView=findViewById(R.id.qqq);
        textView=findViewById(R.id.numb);
       iw.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               counter++;
               textView.setText(String.valueOf(counter));
           }
       });
    }
}
