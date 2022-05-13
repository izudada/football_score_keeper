package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int liverpoolScore;
    int liverpoolFoul;

    int chelseaFoul;
    int chelseaScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *  A method to add one goal count to liverpool's goal
     */
    public void liverpoolAdd(View view){
        liverpoolScore = liverpoolScore + 1;
        displayForLiverpool(liverpoolScore);
    }

    /**
     *  A method to deduct one goal count to liverpool's goal
     */
    public void liverpoolMinus(View view){
        if (liverpoolScore > 0) {
            liverpoolScore = liverpoolScore - 1;
        }
        displayForLiverpool(liverpoolScore);
    }

    /**
     * Displays the given score for Liverpool.
     */
    public void displayForLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  A button that resets the scores of both teams
     */
    public void reset(View view) {
        liverpoolScore = 0;
        displayForLiverpool(liverpoolScore);
    }
}