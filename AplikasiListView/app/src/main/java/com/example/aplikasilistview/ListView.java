package com.example.aplikasilistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class ListView extends AppCompatActivity {

    private  android.widget.ListView lvItem;
    private String[] namanegara = new String[]{
            "Indonesia","Malaysia","Korea",
            "Cina","Rusia","Amerika","Jepang",
            "Wakanda", "Australia", "Argentina",
            "Singapur", "Brunei", "Thailand"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana");

        lvItem = (android.widget.ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (ListView.this, android.R.layout.simple_list_item_1, namanegara);

        lvItem.setAdapter(adapter);

        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListView.this, "Memilih : " + namanegara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}