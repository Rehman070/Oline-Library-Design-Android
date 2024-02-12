package com.example.online_library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sign_In extends AppCompatActivity {
    Button back_to_sign_uo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().hide();

        ImageView imageView = (ImageView) findViewById(R.id.back_to_sign_up);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToSignUp();
            }
        });
    }

    private void GoToSignUp() {
        Intent i = new Intent(Sign_In.this,LandingPage.class);
        startActivity(i);
    }
}