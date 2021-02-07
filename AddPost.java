package com.example.hiworld;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hiworld.R;
import com.example.hiworld.WorkoutFeed;

import java.util.ArrayList;

public class AddPost extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpost);
        getSupportActionBar().hide();
//        EditText exercises = findViewById(R.id.exercises);
//        exercises.setInputType(InputType.TYPE_NULL);



    }
    public void postWorkout(View view){
        Post toAdd = new Post((((TextView)(findViewById(R.id.name))).getText()) + "", "sergio_he", (((TextView)(findViewById(R.id.exercises))).getText()) + "", new ArrayList<Comment>(), 0);
        WorkoutFeed.feedManager.addPostToFeed(toAdd);
        Intent intent1 = new Intent(this, WorkoutFeed.class);
        startActivity(intent1);
        finish();
    }
    public void postMentalHealth(View view){
        Post toAdd = new Post((((TextView)(findViewById(R.id.name))).getText()) + "", "sergio_he", (((TextView)(findViewById(R.id.exercises))).getText()) + "", new ArrayList<Comment>(), 0);
        WorkoutFeed.feedManager.addMentalHealthPostToFeed(toAdd);
        Intent intent1 = new Intent(this, MentalHealthFeed.class);
        startActivity(intent1);
        finish();
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
            case R.id.profile:
                Intent intent3 = new Intent(this, Profile.class);
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
