package com.example.hiworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hiworld.R;
import com.example.hiworld.WorkoutFeed;

public class Profile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();



    }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.workoutFeed:
                Intent intent1 = new Intent(this, WorkoutFeed.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.mentalHealthFeed:
                Intent intent2 = new Intent(this, MentalHealthFeed.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.addpost:
                Intent intent3 = new Intent(this, AddPost.class);
                startActivity(intent3);
                finish();
                break;
            case R.id.savedposts:
                Intent intent4 = new Intent(this, SavedPosts.class);
                startActivity(intent4);
                finish();
                break;
            default:
                break;
        }
    }
}
