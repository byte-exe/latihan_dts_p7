package com.example.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextNama=(EditText)findViewById(R.id.TxtNama);
        Hasil = (TextView)findViewById(R.id.Label2);
    }
    public void TampilNama(View v){
        Hasil.setText("Nama Anda : " + TextNama.getText());
    }
}