package com.example.ss00576773.terumomodel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {

    private ImageView mImageAnim;
    private Button mStart;
    private Animation animation;
    private FloatingActionButton floatBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        mImageAnim = (ImageView) findViewById(R.id.gear_anim);
        mStart = (Button) findViewById(R.id.start);
        animation = AnimationUtils.loadAnimation(this,R.anim.rotation);
        floatBtn = (FloatingActionButton) findViewById(R.id.fab);

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImageAnim.startAnimation(animation);
            }
        });

        floatBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnimationActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
