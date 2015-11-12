package com.wisdomstore.cs480.wisdomstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editEmail;
    EditText editPassword;
    Button buttonLogin;
    long check;
    String email;
    String password;
    TextView registerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonLogin = (Button)findViewById(R.id.login_button);
        editEmail = (EditText)findViewById(R.id.editEmailAddress);
        editPassword = (EditText)findViewById(R.id.editPassword);
        registerTextView = (TextView)findViewById(R.id.register);

        buttonLogin.setOnClickListener(this);
        registerTextView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent homeIntent = new Intent(MainActivity.this, Home.class);
                startActivity(homeIntent);
            }
        });
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_button :
//                if(validateLoginInput()) {
//                    validateLogin(email, password);
//                }
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
                break;
        }
    }
}