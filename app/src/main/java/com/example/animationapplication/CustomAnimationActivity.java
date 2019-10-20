package com.example.animationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.os.Bundle;

public class CustomAnimationActivity extends AppCompatActivity {

    private ObjectAnimator mAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_animation);
        setTitle(R.string.custom_view_title);

        SpeedometerProgressView financeProgressView = findViewById(R.id.speedometer_progress_view);
        mAnimator = (ObjectAnimator) AnimatorInflater.loadAnimator(this, R.animator.custom_view_animator);
        mAnimator.setTarget(financeProgressView);
    }
    @Override
    protected void onStart() {
        super.onStart();
        mAnimator.start();
    }
    @Override
    protected void onStop() {
        super.onStop();
        mAnimator.end();
    }
    }

