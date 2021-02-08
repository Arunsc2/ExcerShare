package com.example.hiworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ViewPost extends AppCompatActivity {

    static boolean alreadyLiked = false;
    static int numLikes;

    TextView postTitle;
    TextView postAuthor;
    TextView workoutDesc;
    TextView displayLikes;
    ImageView likeButton;
    TextView numComments;
    TextView comments;

    String name;
    String username;
    String description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpost);
        getSupportActionBar().hide();

        postTitle = findViewById(R.id.post_name);
        name = getIntent().getStringExtra("postTitle");
        postTitle.setText(name);

        postAuthor = findViewById(R.id.post_user);
        username = getIntent().getStringExtra("postUser");
        postAuthor.setText(username);

        workoutDesc = findViewById(R.id.workout_text);
        description = getIntent().getStringExtra("postDesc");
        workoutDesc.setText(description);

        displayLikes = findViewById(R.id.post_likes);
        numLikes = Integer.valueOf(getIntent().getStringExtra("postLikes"));
        displayLikes.setText(Integer.toString(numLikes));

        numComments = findViewById(R.id.num_comments);
        numComments.setText(getIntent().getStringExtra("numComments"));

        ArrayList<String> postComments = new ArrayList<>();

        for(int i=0; i < Integer.parseInt(numComments.getText() + ""); i++) {
            postComments.add(getIntent().getStringExtra("comments" + i));
        }

        String all = "";

        for(String s : postComments) {
            all = all + s + "\n";
        }

        comments = findViewById(R.id.comments);
        comments.setText(all);
    }

    public void save(View view){
        WorkoutFeed.feedManager.saveThisPost(name, username, description);
    }

    public void postComment(View view){
        ArrayList<String> postComments = new ArrayList<>();

        for(int i=0; i < Integer.parseInt(numComments.getText() + ""); i++) {
            postComments.add(getIntent().getStringExtra("comments" + i));
        }

        String all = "";

        for(String s : postComments) {
            all = all + s + "\n";
        }
        all = all + "@sergio_he: " + ((EditText)findViewById(R.id.commentEdit)).getText();
        comments = findViewById(R.id.comments);
        comments.setText(all);
        WorkoutFeed.feedManager.addComment(name, username, description, "sergio_he", "" + ((EditText)findViewById(R.id.commentEdit)).getText());
        ((EditText)findViewById(R.id.commentEdit)).setText("");
    }

    public void increment(View view) {
        if(!alreadyLiked) {
            displayLikes = findViewById(R.id.post_likes);
            likeButton = findViewById(R.id.like_button);

            numLikes++;
            displayLikes.setText(Integer.toString(numLikes));
            alreadyLiked = true;

            WorkoutFeed.feedManager.likePost(name, username, description, true);
        }
        else {
            displayLikes = findViewById(R.id.post_likes);
            likeButton = findViewById(R.id.like_button);

            numLikes--;
            displayLikes.setText(Integer.toString(numLikes));

            alreadyLiked = false;

            WorkoutFeed.feedManager.likePost(name, username, description, false);

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
                Intent intent5 = new Intent(this, MentalHealthFeed.class);
                startActivity(intent5);
                finish();
                break;
            default:
                break;
        }
    }


}