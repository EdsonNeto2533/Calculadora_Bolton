package com.example.calculadoraanlisedebolton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AnaliseBltonAn extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analise_blton_an);
        ed1 = (EditText) findViewById(R.id.editTextX);
        ed2 = (EditText) findViewById(R.id.editTextY);
        ed3 = (EditText) findViewById(R.id.editTextResult);


    }
    public void calcular(View view){
        Double v1,v2,v3;
        v1 = Double.parseDouble(ed1.getText().toString());
        v2 = Double.parseDouble(ed2.getText().toString());
        v3 = (v1 / v2) * 100;
        ed3.setText(v3.toString());
    }

}