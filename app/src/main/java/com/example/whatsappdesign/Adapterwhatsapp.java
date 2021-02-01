package com.example.whatsappdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


public class Adapterwhatsapp extends BaseAdapter {

    Context aContex;
    String [] Nameprofile;
    String [] Textmessages;
    String [] time;
    int[] profilepic;
    int[] Tickmark;


    public Adapterwhatsapp(Context aContex, String[] aProfileNames, int[] aProfilepics, String[] atextmessage, String[] atimetext, int[] tickimg) {
        this.aContex=aContex;
        this.Nameprofile=aProfileNames;
        this.profilepic=aProfilepics;
        this.Textmessages=atextmessage;
        this.time=atimetext;
        this.Tickmark=tickimg;
    }


    @Override
    public int getCount() {
        return Nameprofile.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
         if(convertView==null){

             LayoutInflater inflater= LayoutInflater.from(aContex);
             view=inflater.inflate(R.layout.whatsapplist,null);
         } else {

             view=convertView;
         }

        CircleImageView pictureprofile = view.findViewById(R.id.profilepicwhatsapp);
        ImageView tick = view.findViewById(R.id.tickimage);
        TextView NameProfile = view.findViewById(R.id.namewhats);
        TextView textmsg = view.findViewById(R.id.textmsgwhats);
        TextView Time =view.findViewById(R.id.texttime);

        textmsg.setText(Textmessages[position]);
        NameProfile.setText(Nameprofile[position]);
        Time.setText(time[position]);
        pictureprofile.setImageResource(profilepic[position]);
        tick.setImageResource(Tickmark[position]);


        return view;
    }
}
