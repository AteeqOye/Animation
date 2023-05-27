package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button translateBtn,alphaBtn,rotateBtn,scaleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        textView = findViewById (R.id.text1);
        translateBtn=findViewById (R.id.translateBtn);
        alphaBtn=findViewById (R.id.alphaBtn);
        rotateBtn=findViewById (R.id.rotateBtn);
        scaleBtn=findViewById (R.id.scaleBtn);

        translateBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Animation translate = AnimationUtils.loadAnimation(getApplicationContext (),R.anim.translate);
                textView.startAnimation (translate);
            }
        });

        alphaBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Animation alpha = AnimationUtils.loadAnimation (getApplicationContext (),R.anim.alpha);
                textView.startAnimation (alpha);
            }
        });
        rotateBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Animation rotate = AnimationUtils.loadAnimation (getApplicationContext (),R.anim.rotate);
                textView.startAnimation (rotate);
            }
        });
        scaleBtn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Animation scale = AnimationUtils.loadAnimation (getApplicationContext (),R.anim.scale);
                textView.startAnimation (scale);
            }
        });

    }

}