package com.example.savvari;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Saved extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved);
        getSupportActionBar().hide();



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.saved);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.saved:
                        startActivity(new Intent(getApplicationContext()
                                , Saved.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.recent:
                        startActivity(new Intent(getApplicationContext()
                                , Recent.class));
                        overridePendingTransition(0,0);
                        return true;



                    case R.id.settings:
                        startActivity(new Intent(getApplicationContext()
                                , Setting.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }
}
