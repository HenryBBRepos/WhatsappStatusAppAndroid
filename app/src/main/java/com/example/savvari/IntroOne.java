package com.example.savvari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntroOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);
        getSupportActionBar().hide();
    }



    public void ToMainContent(View view)
    {
        Intent intent = new Intent(IntroOne.this, Recent.class);
        startActivity(intent);

    }
}
