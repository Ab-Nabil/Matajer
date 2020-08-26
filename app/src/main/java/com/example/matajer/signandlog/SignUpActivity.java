package com.example.matajer.signandlog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.matajer.App.HomeActivity;
import com.example.matajer.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mFirstName,mLastName,mEmail,mPhone,mPassword;
    Button mSignUp,mLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mFirstName = findViewById(R.id.firstnamesign);
        mLastName = findViewById(R.id.lastnamesign);
        mEmail = findViewById(R.id.emailsign);
        mPhone = findViewById(R.id.phonesign);
        mPassword = findViewById(R.id.passsign);
        mSignUp = findViewById(R.id.btnsign);
        mLogin = findViewById(R.id.btnloginsign);

        mSignUp.setOnClickListener(this);
        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnsign:
                Intent intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
                break;

            case R.id.btnloginsign:
                Intent intent2 = new Intent(this,LoginActivity.class);
                startActivity(intent2);
                break;
        }
    }
}