package com.example.savvari;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class NoStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_status);
        getSupportActionBar().hide();
    }
}
