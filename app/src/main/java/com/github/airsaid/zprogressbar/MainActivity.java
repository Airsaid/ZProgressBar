package com.github.airsaid.zprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.SeekBar;

import com.github.airsaid.zprogressbar.widget.ZProgressBar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ZProgressBar mProgressBar;
    private SeekBar mSbrRadius;
    private SeekBar mSbrDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBar = (ZProgressBar) findViewById(R.id.progressBar);
        mSbrRadius = (SeekBar) findViewById(R.id.sbr_radius);
        mSbrDuration = (SeekBar) findViewById(R.id.sbr_duration);
        mSbrRadius.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUsr) {
                mProgressBar.setRadius(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
        mSbrDuration.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mProgressBar.setDuration(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });
    }

    public void setProgress(View v){
        Random r = new Random();
        mProgressBar.setAnimProgress(r.nextInt(100));
    }

    public void setBackgroundColor(View v){
        Random random = new Random();
        int ranColor = 0xff000000 | random.nextInt(0x00ffffff);
        mProgressBar.setDefBackgroundColor(ranColor);
    }

    public void setProgressColor(View v){
        Random random = new Random();
        int ranColor = 0xff000000 | random.nextInt(0x00ffffff);
        mProgressBar.setProgressColor(ranColor);
    }
}
