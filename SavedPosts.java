package com.example.hiworld;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SavedPosts extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savedposts);
        getSupportActionBar().hide();
        View feed = findViewById(R.id.feed);

        Feeds feedManager = new Feeds();
        ArrayList<Post> savedPosts = feedManager.getSavedPosts();

        for(Post p : savedPosts){
            TableLayout post = new TableLayout(this);
            TableLayout.LayoutParams postParams = new TableLayout.LayoutParams(1050,360);
            postParams.setMargins(0,30,15,0);
            post.setLayoutParams(postParams);
            post.setBackgroundResource(R.drawable.my_shape_file);

            TextView title = new TextView(this);
            title.setText(p.getName());
            title.setTextColor(getResources().getColor(R.color.black));
            title.setTextSize(40);
            title.setTypeface(null, Typeface.BOLD);
            title.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            post.addView(title);

            TextView author = new TextView(this);
            author.setText("@" + p.getUser());
            author.setTextColor(getResources().getColor(R.color.dark_gray));
            author.setTextSize(20);
            author.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            post.addView(author);

            Toolbar likeAndComment = new Toolbar(this);
            likeAndComment.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,100));
            likeAndComment.setContentInsetsRelative(5,200);
            post.addView(likeAndComment);

            LinearLayout iconLayout = new LinearLayout(this);
            iconLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));
            iconLayout.setOrientation(LinearLayout.HORIZONTAL);
            likeAndComment.addView(iconLayout);

            ImageView heart = new ImageView(this);
            heart.setLayoutParams(new LinearLayout.LayoutParams(80, ViewGroup.LayoutParams.MATCH_PARENT));
            heart.setImageDrawable(getResources().getDrawable(R.drawable.like_icon_gold));
            heart.setPadding(0,0,20,0);
            iconLayout.addView(heart);

            TextView likes = new TextView(this);
            likes.setText(p.getLikes()+"");
            likes.setTextColor(getResources().getColor(R.color.light_gold));
            likes.setTextSize(25);
            likes.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
            iconLayout.addView(likes);

            ImageView comment = new ImageView(this);
            comment.setLayoutParams(new LinearLayout.LayoutParams(100, ViewGroup.LayoutParams.MATCH_PARENT));
            comment.setImageDrawable(getResources().getDrawable(R.drawable.comment_icon_gold));
            comment.setPadding(20,0,20,0);
            iconLayout.addView(comment);

            TextView comments = new TextView(this);
            comments.setText(p.getComments().size()+"");
            comments.setTextColor(getResources().getColor(R.color.light_gold));
            comments.setTextSize(25);
            comments.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.MATCH_PARENT));
            iconLayout.addView(comments);


            ((LinearLayout)feed).addView(post);
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
            case R.id.mentalHealthFeed:
                Intent intent4 = new Intent(this, MentalHealthFeed.class);
                startActivity(intent4);
                finish();
                break;
            default:
                break;
        }
    }
}
