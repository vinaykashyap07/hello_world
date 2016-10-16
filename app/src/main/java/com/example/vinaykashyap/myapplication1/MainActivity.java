package com.example.vinaykashyap.myapplication1;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listView);

        String[] values = new String[]{"Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View",
        };
        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList(values));
        View v = (View) findViewById(R.id.text_row);

        adapter = new ArrayAdapter<String>(this,R.layout.row_text,R.id.text_row,items);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "Item clicked", Toast.LENGTH_SHORT).show();

//            Intent i = new Intent();
//                i.setAction(Intent.ACTION_VIEW);
//                Uri uri = Uri.parse("http://www.google.com");
//                i.setData(uri);
//                startActivity(i);

                Intent i = new Intent();
                i.setClass(getApplicationContext(),Random.class);
                i.putExtra("items[3]",true);
                startActivity(i);




            }
        });
    }
}

