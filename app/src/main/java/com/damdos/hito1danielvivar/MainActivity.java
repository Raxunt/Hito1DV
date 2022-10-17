package com.damdos.hito1danielvivar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button botonAceptar;
    private TextView textobienvenida;
    private ImageView imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen= (ImageView) findViewById(R.id.imagenInicio);
        imagen.setImageResource(R.drawable.logo);

        textobienvenida= (TextView) findViewById(R.id.textView);


        botonAceptar = (Button) findViewById(R.id.buttonPrincipal);


        botonAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent botonAceptar = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(botonAceptar);



            }
        });}
    }
