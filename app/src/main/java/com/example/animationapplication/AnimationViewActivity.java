package com.example.animationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;

public class AnimationViewActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_view);
        setTitle(R.string.animation_view_title);

        setImageAnimation();
    }

    private void setImageAnimation() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.3f, 1f, 0.3f, 1f);
        scaleAnimation.setRepeatCount(20);
        scaleAnimation.setRepeatMode(Animation.REVERSE);
        scaleAnimation.setDuration(1000);

        AlphaAnimation alphaAnimation = new AlphaAnimation(0.2f, 1f);
        alphaAnimation.setRepeatCount(20);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        alphaAnimation.setDuration(1000);

        RotateAnimation rotateAnimation = new RotateAnimation(0, 360, 500f, 500f);
        rotateAnimation.setRepeatCount(20);
        rotateAnimation.setRepeatMode(Animation.REVERSE);
        rotateAnimation.setDuration(1000);


        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(rotateAnimation);

        View view = findViewById(R.id.tween_animation_view);
        view.startAnimation(animationSet);
    }
}
