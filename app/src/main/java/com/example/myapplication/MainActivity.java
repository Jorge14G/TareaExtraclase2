package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaDataSource;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView labelOut;
    EditText textoIn1, textoIn2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        labelOut = (TextView) findViewById(R.id.lblout);
        textoIn1 = (EditText) findViewById(R.id.txt1);
        textoIn2 = (EditText) findViewById(R.id.txt2);
    }
    public void onClick(View view){
        String dat = String.valueOf(textoIn1.getText());
        String dat2 = String.valueOf(textoIn2.getText());
        labelOut.setText(dat+" "+dat2);
        }
}