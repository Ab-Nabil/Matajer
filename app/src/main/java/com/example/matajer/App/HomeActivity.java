package com.example.matajer.App;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matajer.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    DrawerLayout mDrawerLayout;
    ImageView mImageView;
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mDrawerLayout = findViewById(R.id.drawerlayout);
        mImageView = findViewById(R.id.homemenu);
        mTextView = findViewById(R.id.hometext);

        mImageView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.homemenu:
                mDrawerLayout.openDrawer(Gravity.LEFT);
                break;
        }
    }
}