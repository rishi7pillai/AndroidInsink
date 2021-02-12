package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class Splash extends AppCompatActivity {
    ImageView spashimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        spashimage = this.<ImageView>findViewById(R.id.img2);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.myanimation);
        spashimage.startAnimation(myanim);

        Thread mythread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(5000);

                    Intent i;
                    i = new Intent(Splash.this,MainActivity.class);
                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        mythread.start();
    }
}
