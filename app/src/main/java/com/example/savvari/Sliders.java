package com.example.savvari;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Sliders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sliders);
        getSupportActionBar().hide();

//        addSlide(AppIntroFragment.newInstance(R.drawable.started_image, "Pick your interest","Select the options for which you will need questions to be asked", Color.parseColor("#f98012")));
//        addSlide(AppIntroFragment.newInstance(R.drawable.started_image, "Create a Match-Up", "Meet gamers, wilders and money makers", Color.parseColor("#f98012")));
//        addSlide(AppIntroFragment.newInstance(R.drawable.started_image, "Win Matches and Earn Cash", "Get the opportunity to make money as you have fun", Color.parseColor("#f98012")));
//
//        showSkipButton(true);
//        setButtonsEnabled(true);
//        setSeparatorColor(Color.parseColor("#f98012"));
    }

//    private void setButtonsEnabled(boolean b) {
//    }
//
//    @Override
//    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
//        super.onSlideChanged(oldFragment, newFragment);
//
//        // Do something when the slide changes.
//        TextView description = (TextView) findViewById(R.id.description);
//        TextView title = (TextView) findViewById(R.id.title);
//        TextView skip = (TextView) findViewById(R.id.skip);
///*
//        description.setTextSize(22);
//*/
///*
//        title.setTextSize(25);
//*/
//        title.setPadding(30,0,30,0);
//    }
}
