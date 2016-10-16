package com.example.vinaykashyap.myapplication1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by vinaykashyap on 05-10-2016.
 */
public class Random extends AppCompatActivity{




    Intent intent = getIntent();
    String random = intent.getStringExtra("items[3]");
    ListView listview = (ListView) findViewById(R.id.random);
    String[] values = new String[]{"Android List View",
            "entation",
            "SimIn Android",
            "Creew Android",
            "Andrxample",
            "List Code",
            "Liy Adapter",
            "Andle List View",
    };

    ArrayList<String> array = new ArrayList<>();



    ArrayAdapter<String> adapter = new ArrayAdapter<String>();

    listview v =

}
