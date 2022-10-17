package com.damdos.hito1danielvivar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private Button siguente;
    private Button atras;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtNombre = (EditText) findViewById(R.id.editTextTextPersonName);

        atras = (Button) findViewById(R.id.button3);
        atras.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent atras = new Intent(MainActivity2.this, MainActivity.class);
                                            startActivity(atras);

                                        }
                                    }

        );

        siguente = (Button) findViewById(R.id.button2);


        siguente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent siguente = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(siguente);

                Bundle b = new Bundle();
                b.putString("NOMBRE", txtNombre.getText().toString());
                siguente.putExtras(b);
                startActivity(siguente);
            }
        }

        );}

    }
