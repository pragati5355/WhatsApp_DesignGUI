package com.example.whatsappdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView WhatsupList;

    String[] aProfileNames= {"Dad","Harshada Kedari","Sayali Kadam","Mansi Katke","Family of Modelling","Rutuja Sapkal","Shraddha Bhilare",
                              "Vandana Vahini","Mansi Mom","Prajakta Koparkar","Sahil Bhilare","Rutuja Satav","Reunion","Shambhavi Kadam",
                              "Shreya Chavan","Android Apps Development","Darshana Chorat","Deep Bhilare","Zeal Girls Hostel"};

    int[] aProfilepics = {R.drawable.dad,R.drawable.harsharda,R.drawable.sayali,R.drawable.mansee,R.drawable.modelling,R.drawable.rutuja,R.drawable.shraddha,
                          R.drawable.vandana,R.drawable.mansemom,R.drawable.prajakta,R.drawable.sahil,R.drawable.rutujas,R.drawable.reunion,R.drawable.shambhavi,
                           R.drawable.shreya,R.drawable.ascii,R.drawable.darshana,R.drawable.deep,R.drawable.hostel};

    String[] atextmessage ={"Hello","Hie Harshada","Zal ka g tuz","helloo Manse","Hie Guys","have you done it","kadhi challiyes mg!!",
                             "is it good","hie kaku","Hie Prajee","Hey hiee","nhi g","+919091220055: Nako re","hie",
                              "How r u","Sayali Kadam: yes sir"," "," "," "," "};

    String[] atimetext ={"8:00am","8:05am","3:15am","4:00am","7:14am","Yesterday","Yesterday",
                         "Yesterday","Yesterday","Yesterday","23/01/2021","22/01/2021","20/01/2021","19/01/2021",
                          "08/01/2021","07/01/2021","31/12/2020","25/12/2020","20/12/2020"};

    int[] Tickimg = {R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done_all_24,R.drawable.ic_baseline_done_all_24,R.drawable.ic_baseline_done_all_24,R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done_24,
                     R.drawable.ic_baseline_done_all_24,R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done_all_24,R.drawable.ic_baseline_done_all_24,R.drawable.ic_baseline_done_24,
                     R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done_all_24,R.drawable.ic_baseline_done_all_24,R.drawable.ic_baseline_done_24,R.drawable.ic_baseline_done_all_24};

    Adapterwhatsapp adapterwhatsapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WhatsupList= findViewById(R.id.Whatsapplist);
        adapterwhatsapp = new Adapterwhatsapp(this,aProfileNames,aProfilepics,atextmessage,atimetext,Tickimg);
        WhatsupList.setAdapter(adapterwhatsapp);



    }
}