package com.damdos.hito1danielvivar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    private ImageButton siguente;
    private ImageButton atras;
    private ImageView imagendos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imagendos= (ImageView) findViewById(R.id.imageView2);
        imagendos.setImageResource(R.drawable.ic_launcher_background);

        atras = (ImageButton) findViewById(R.id.imageButton4);
        atras.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent atras = new Intent(MainActivity3.this, MainActivity2.class);
                                         startActivity(atras);

                                         startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people/")));
                                     }
                                 }

        );

        siguente = (ImageButton) findViewById(R.id.imageButton3);


        siguente.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent siguente = new Intent(MainActivity3.this, MainActivity4.class);
                                            startActivity(siguente);

                                        }
                                    }

        );}

}