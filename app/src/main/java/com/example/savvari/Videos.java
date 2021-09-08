package com.example.savvari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos);
        getSupportActionBar().hide();
    }



    public void ToStatus(View view)
    {
        Intent intent = new Intent(Videos.this, ViewStatus.class);
        startActivity(intent);

    }
}
