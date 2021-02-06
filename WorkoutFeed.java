package com.example.hiworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WorkoutFeed extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutfeed);
        getSupportActionBar().hide();


    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.mentalHealthFeed:
                Intent intent1 = new Intent(this, MentalHealthFeed.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.profile:
                Intent intent2 = new Intent(this, Profile.class);
                startActivity(intent2);
                finish();
                break;
            default:
                break;
        }
    }
}