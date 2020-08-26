package com.example.matajer.signandlog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.matajer.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mEmail,mPassword;
    Button mSignUp,mLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEmail = findViewById(R.id.emaillogin);
        mPassword = findViewById(R.id.passlogin);
        mSignUp = findViewById(R.id.btnsignlogin);
        mLogin = findViewById(R.id.btnlogin);

        mSignUp.setOnClickListener(this);
        mLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnlogin:

                break;

            case R.id.btnsignlogin:
                Intent intent = new Intent(this,SignUpActivity.class);
                startActivity(intent);
                break;
        }
    }
}