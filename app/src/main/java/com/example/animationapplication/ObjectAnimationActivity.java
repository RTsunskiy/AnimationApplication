package com.example.animationapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class ObjectAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_animation);
        setTitle(R.string.object_animation_title);

        objectAnimation();
    }

    private void objectAnimation() {
        ImageView imageView = findViewById(R.id.object_image_view);

        Float translationY = 1500f;


        ObjectAnimator rotationAnimator = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 360f);
        rotationAnimator.setRepeatCount(20);
        rotationAnimator.setRepeatMode(ObjectAnimator.REVERSE);
        rotationAnimator.setDuration(1000).start();

        ObjectAnimator translationAnimator = ObjectAnimator.ofFloat(imageView, "translationY", 0f, translationY);
        translationAnimator.setRepeatCount(20);
        translationAnimator.setRepeatMode(ObjectAnimator.REVERSE);
        translationAnimator.setDuration(1000).start();
    }


}
