package com.example.networkspeed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText e1,e2,e3,e4;
    ImageView im;
    int actualAng = 0;

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
                Integer debit = Integer.valueOf(e1.getText().toString());
                calculer(debit);
                e2.setText(String.valueOf(debit*0.75));
                e3.setText(String.valueOf(debit*0.15));
                e4.setText(String.valueOf(debit*0.10));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.getText().clear();
                e2.getText().clear();
                e3.getText().clear();
                e4.getText().clear();

                rotation(actualAng,0);
            }
        });

    }


    public void rotation(int ang1, int ang2){
        RotateAnimation rotation = new RotateAnimation(ang1, ang2,RotateAnimation.RELATIVE_TO_SELF,0.7f,RotateAnimation.RELATIVE_TO_SELF,0.5f);
        rotation.setFillAfter(true);
        rotation.setDuration(2000);
        im.startAnimation(rotation);
    }

    public void calculer(int debit){
        if(debit<0){
            Toast.makeText(this, "Erreur! le debit doit etre entre 0 et 100Mb/s", Toast.LENGTH_SHORT).show();
            rotation(actualAng,0);
            actualAng = 0;
            return;
        }
        if(debit>100){
            Toast.makeText(this, "Erreur! le debit doit etre entre 0 et 100Mb/s", Toast.LENGTH_SHORT).show();
            rotation(actualAng,180);
            actualAng = 180;
            return;
        }

        int angle = 180 * debit/100;
        rotation(actualAng,angle);
        actualAng = angle;
    }
}