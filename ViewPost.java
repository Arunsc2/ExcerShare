package com.example.exershare;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ViewPost extends AppCompatActivity {

    static boolean alreadyLiked = false;
    static int numLikes;

    TextView postTitle;
    TextView postAuthor;
    TextView workoutDesc;
    TextView displayLikes;
    ImageView likeButton;
    TextView numComments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpost);
        getSupportActionBar().hide();

        postTitle = findViewById(R.id.post_name);
        postTitle.setText(getIntent().getStringExtra("postTitle"));

        postAuthor = findViewById(R.id.post_user);
        postAuthor.setText(getIntent().getStringExtra("postUser"));

        workoutDesc = findViewById(R.id.workout_text);
        workoutDesc.setText(getIntent().getStringExtra("postDesc"));

        displayLikes = findViewById(R.id.post_likes);
        displayLikes.setText(getIntent().getStringExtra("postLikes"));

        numComments = findViewById(R.id.num_comments);
        numComments.setText(getIntent().getStringExtra("numComments"));
    }

    public void increment(View view) {
        if(!alreadyLiked) {
            displayLikes = findViewById(R.id.post_likes);
            likeButton = findViewById(R.id.like_button);

            numLikes++;
            displayLikes.setText(Integer.toString(numLikes));
            alreadyLiked = true;
        }
        else {
            displayLikes = findViewById(R.id.post_likes);
            likeButton = findViewById(R.id.like_button);

            numLikes--;
            displayLikes.setText(Integer.toString(numLikes));

            alreadyLiked = false;


        }
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.workoutFeed:
                Intent intent1 = new Intent(this, WorkoutFeed.class);
                startActivity(intent1);
                finish();
                break;
            case R.id.profile:
                Intent intent2 = new Intent(this, Profile.class);
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
            case R.id.mentalHealthFeed:
                Intent intent5 = new Intent(this, SavedPosts.class);
                startActivity(intent5);
                finish();
                break;
            default:
                break;
        }
    }


}
