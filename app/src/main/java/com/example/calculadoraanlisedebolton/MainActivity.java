package com.example.calculadoraanlisedebolton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void analiseboltonan(View v){
        Intent in = new Intent(MainActivity.this, AnaliseBltonAn.class);
        startActivity(in);
    }

    public void analiseboltonto(View v){
        Intent in = new Intent(MainActivity.this, AnaliseBltonTo.class);
        startActivity(in);
    }

    public void SituClinica2bt(View v){
        Intent in = new Intent(MainActivity.this, SituClinica2.class);
        startActivity(in);
    }

    public void SituClinica1bt(View v){
        Intent in = new Intent(MainActivity.this, SituClinica1.class);
        startActivity(in);
    }

    public void boltonInt(View v){
        Intent in = new Intent(MainActivity.this, boltonInter.class);
        startActivity(in);
    }


}