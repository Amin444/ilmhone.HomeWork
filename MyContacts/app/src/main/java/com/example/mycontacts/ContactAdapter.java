package com.example.mycontacts;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


import java.util.ArrayList;

import androidx.recyclerview.widget.RecyclerView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyViewHolder> {

    private   Context context;
    private ArrayList con_id , con_name, con_lastName, con_number, con_mail;


        int position;
    ContactAdapter(ArrayList con_id, ArrayList con_name, ArrayList con_lastName, ArrayList con_number, ArrayList con_mail, Context context, MainActivity more){

        this.context =context;
        this.con_id=con_id;
        this.con_name=con_name;
        this.con_lastName=con_lastName;
        this.con_number=con_number;
        this.con_mail=con_mail;



    }


    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view =inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder( final MyViewHolder holder, final int position) {
        this.position=position;
        holder.con_name_txt.setText(String.valueOf(con_name.get(position)));
        holder.con_lastName_txt.setText(String.valueOf(con_lastName.get(position)));


    }

    @Override
    public int getItemCount() {
        return con_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {

        TextView con_name_txt,con_lastName_txt,con_number_int,con_mail_txt;

        RelativeLayout maimLayout;

        public MyViewHolder( View itemView) {
            super(itemView);
                con_name_txt =itemView.findViewById(R.id.nameText);
                con_lastName_txt =itemView.findViewById(R.id.lastNameText);
                con_number_int =itemView.findViewById(R.id.numbertxt);
                con_mail_txt =itemView.findViewById(R.id.mailtxt);
                maimLayout=itemView.findViewById(R.id.mainLayout);


        }


    }



}
