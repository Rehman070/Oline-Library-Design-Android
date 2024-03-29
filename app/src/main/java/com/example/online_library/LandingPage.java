package com.example.online_library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LandingPage extends AppCompatActivity {
    Button sign_up_button,sign_in_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        getSupportActionBar().hide();

        sign_up_button = findViewById(R.id.sign_up_btn);
        sign_in_button= findViewById(R.id.sign_in_btn);

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToSignUp();
            }
        });

        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToSignIn();
            }
        });


    }

    private void GoToSignIn() {
        Intent i = new Intent(LandingPage.this,Sign_In.class);
        startActivity(i);
    }

    private void GoToSignUp() {
        Intent i = new Intent(LandingPage.this,Sign_Up.class);
        startActivity(i);
    }

}