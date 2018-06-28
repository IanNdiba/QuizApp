package com.example.ian.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView heading = (TextView) findViewById(R.id.heading);
        heading.setSelected(true);

        TextView androidButton = (TextView) findViewById(R.id.androidButton);
        androidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent androidIntent = new Intent(MainActivity.this, AndroidActivity.class);
                startActivity(androidIntent);
            }
        });

        TextView javaButton = (TextView) findViewById(R.id.javaButton);
        javaButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent javaIntent = new Intent(MainActivity.this, JavaActivity.class);
                startActivity(javaIntent);
            }
        });

        TextView pythonButton = (TextView) findViewById(R.id.pythonButton);
        pythonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pythonIntent = new Intent(MainActivity.this, PythonActivity.class);
                startActivity(pythonIntent);
            }
        });

        TextView webButton = (TextView) findViewById(R.id.webButton);
        webButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent webIntent = new Intent(MainActivity.this, WebActivity.class);
                startActivity(webIntent);
            }
        });
    }
}
