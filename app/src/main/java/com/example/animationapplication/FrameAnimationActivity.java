package com.example.animationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class FrameAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);
        setTitle(R.string.frame_animation_title);

        ImageView imageView =
                findViewById(R.id.horseImageView);
        ((AnimationDrawable) imageView.getDrawable()).start();
    }
}
