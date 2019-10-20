package com.example.animationapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class ValueAnimationActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value_animation);
        setTitle(R.string.value_animation_title);

        imageView = findViewById(R.id.value_image_view);

        ValueAnimator animatorXml = (ValueAnimator) AnimatorInflater.
                loadAnimator(this, R.animator.value_animator);
        animatorXml.addUpdateListener(
                animator -> imageView.setAlpha((Float) animator.getAnimatedValue())
        );
        animatorXml.start();
    }
}
