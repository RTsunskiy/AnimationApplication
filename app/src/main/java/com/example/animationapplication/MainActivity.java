package com.example.animationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button frameAnimation;
    private Button animationView;
    private Button valueAnimations;
    private Button objectAnimation;
    private Button customAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();

        buttonListeners();
    }

    private void buttonListeners() {
        frameAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.class);
                startActivity(intent);
            }
        });

        animationView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnimationViewActivity.class);
                startActivity(intent);
            }
        });

        valueAnimations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ValueAnimationActivity.class);
                startActivity(intent);
            }
        });

        objectAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ObjectAnimationActivity.class);
                startActivity(intent);
            }
        });

        customAnimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomAnimationActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initButtons() {
        frameAnimation = findViewById(R.id.frame_animations_btn);
        animationView = findViewById(R.id.animations_animations_btn);
        valueAnimations = findViewById(R.id.value_animations_btn);
        objectAnimation = findViewById(R.id.object_animations_btn);
        customAnimation = findViewById(R.id.custom_animations_btn);

    }
}
