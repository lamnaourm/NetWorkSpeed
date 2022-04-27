package com.example.networkspeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2,e3,e4;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1 = findViewById(R.id.btncalc);
        b2 = findViewById(R.id.btneffacers);
        e1 = findViewById(R.id.eDebit);
        e2 = findViewById(R.id.iddown);
        e3 = findViewById(R.id.idupload);
        e4 = findViewById(R.id.idreseaux);
        im = findViewById(R.id.idaigu);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}