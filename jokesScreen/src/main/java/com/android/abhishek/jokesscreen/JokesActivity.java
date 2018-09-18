package com.android.abhishek.jokesscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    public static final String JOKES_PASS_INTENT = "my_jokes";
    private String myJokes;

    private TextView jokesText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        Intent intent = getIntent();
        if(intent == null){

        }

        myJokes = intent.getStringExtra(JOKES_PASS_INTENT);
        if(myJokes == null || myJokes.isEmpty()){

        }

        jokesText = findViewById(R.id.jokesTv);
        jokesText.setText(myJokes);

    }
}
