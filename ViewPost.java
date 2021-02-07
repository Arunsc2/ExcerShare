package com.example.exershare;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class ViewPost extends AppCompatActivity {

    int numLikes = 17;
    TextView displayLikes;
    ImageView likeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        getSupportActionBar().hide();
    }

    public void increment(View view) {
        displayLikes = findViewById(R.id.post_likes);
        likeButton = findViewById(R.id.like_button);

        numLikes++;
        displayLikes.setText(Integer.toString(numLikes));
    }




}
