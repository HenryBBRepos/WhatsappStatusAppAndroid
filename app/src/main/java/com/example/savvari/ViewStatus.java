package com.example.savvari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ViewStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_status);
        getSupportActionBar().hide();
    }
}
