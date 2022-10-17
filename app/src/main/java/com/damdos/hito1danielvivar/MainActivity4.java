package com.damdos.hito1danielvivar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private Button botonInicio;
    private TextView textodespedida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textodespedida= (TextView) findViewById(R.id.textView3);
        botonInicio = (Button) findViewById(R.id.button5);

        botonInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent botonInicio = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(botonInicio);




            }
        });}
}
