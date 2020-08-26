package com.example.matajer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matajer.signandlog.SignUpActivity;

public class MainActivity extends AppCompatActivity {
    private static final int SPLASH_SCREEN = 1700;
    
    Animation   animation;
    ImageView   mLogo;
    TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation = AnimationUtils.loadAnimation(this,R.anim.animation);

        mLogo = findViewById(R.id.splashlogo);
        mText = findViewById(R.id.splashtext);
        mLogo.setAnimation(animation);
        mText.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}