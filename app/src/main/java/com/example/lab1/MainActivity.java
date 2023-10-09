package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton bt, bt2, bt3, bt4, bt5, bt6;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (ImageButton) findViewById(R.id.imageButton);
        bt2 = (ImageButton) findViewById(R.id.imageButton2);
        bt3 = (ImageButton) findViewById(R.id.imageButton3);
        bt4 = (ImageButton) findViewById(R.id.imageButton4);
        bt5 = (ImageButton) findViewById(R.id.imageButton5);
        bt6 = (ImageButton) findViewById(R.id.imageButton6);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.sample);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });

        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.sample2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });

        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.sample3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });

        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.sample4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });

        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.sample5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });

        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.sample6);
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });

    }

}