package com.example.demo5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(v -> animation1());
        findViewById(R.id.button2).setOnClickListener(v->animation2());
        findViewById(R.id.button3).setOnClickListener(v->animation3());
        findViewById(R.id.button4).setOnClickListener(v->animation4());
    }
    private void animation4() {
        Animation anim3 = AnimationUtils.loadAnimation(this, R.anim.anim3);
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.startAnimation(anim3);
    }
    private void animation3() {
        Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.anim2);
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.startAnimation(anim2);
    }

    private void animation2() {
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setVisibility(View.VISIBLE);
    }
    private static final String TAG = "DEMO5_TAG";
    private void animation1() {
        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.anim1);
        ImageView imageView = findViewById(R.id.imageView);
        Log.v(TAG, "before start animation");
        imageView.startAnimation(anim1);
        Log.v(TAG, "after start animation");
        imageView.setVisibility(View.INVISIBLE);
        Log.v(TAG, "after set visibility");
    }
}