package com.example.jokeviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke = getIntent().getExtras().getString(JOKE_EXTRA);

        ((TextView) findViewById(R.id.jokeTextView)).setText(joke);
    }
}
