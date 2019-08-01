package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView1;
TextView textView2;
TextView textView3;
ImageView imageView;
MediaPlayer m1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1=findViewById(R.id.textView4);
        textView2=findViewById(R.id.textView5);
        textView3=findViewById(R.id.textView6);
        imageView=findViewById(R.id.imageView2);
        m1=MediaPlayer.create(this,R.raw.invalid_keypress);
CountDownTimer ctimer=null;
        ctimer=new CountDownTimer(10000,1000)
        {
            public void onTick(long millisecondsUntildone){
                textView2.setText("time"+String.valueOf(millisecondsUntildone));}
                public void onFinish(){
                textView3.setText("done");
                m1.start();

            }
        }.start();
    }

}
