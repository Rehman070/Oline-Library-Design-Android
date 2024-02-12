package com.example.online_library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sign_Up extends AppCompatActivity {
    Button back_to_landing_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().hide();

        ImageView imgFavorite = (ImageView) findViewById(R.id.back_to_landinpage);
        imgFavorite.setClickable(true);
        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToLandingPage();
            }
        });



    }

    private void GoToLandingPage() {
        Intent i = new Intent(Sign_Up.this,LandingPage.class);
        startActivity(i);
    }
}