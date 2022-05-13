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
     *  A method to add one foul count to liverpool's foul variable
     */
    public void liverpoolFoulAdd(View view){
        liverpoolFoul = liverpoolFoul + 1;
        displayForLiverpoolFoul(liverpoolFoul);
    }

    /**
     *  A method to deduct one foul count to liverpool's foul variable
     */
    public void liverpoolFoulMinus(View view){
        if (liverpoolFoul > 0) {
            liverpoolFoul = liverpoolFoul - 1;
        }
        displayForLiverpoolFoul(liverpoolFoul);
    }

    /**
     * Displays the given score for Liverpool.
     */
    public void displayForLiverpool(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Liverpool.
     */
    public void displayForLiverpoolFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.liverpool_foul);
        scoreView.setText(String.valueOf(score));
    }





    /**
     *  A method to add one goal count to chelsea's goal
     */
    public void chelseaAdd(View view){
        chelseaScore = chelseaScore + 1;
        displayForChelsea(chelseaScore);
    }

    /**
     *  A method to deduct one goal count to chelsea's goal
     */
    public void chelseaMinus(View view){
        if (chelseaScore > 0) {
            chelseaScore = chelseaScore - 1;
        }
        displayForChelsea(chelseaScore);
    }

    /**
     *  A method to add one foul count to chelsea's foul variable
     */
    public void chelseaFoulAdd(View view){
        chelseaFoul = chelseaFoul + 1;
        displayForChelseaFoul(chelseaFoul);
    }

    /**
     *  A method to deduct one foul count to liverpool's foul variable
     */
    public void chelseaFoulMinus(View view){
        if (chelseaFoul > 0) {
            chelseaFoul = chelseaFoul - 1;
        }
        displayForChelseaFoul(chelseaFoul);
    }


    /**
     * Displays the given score for Chelsea.
     */
    public void displayForChelsea(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_goal);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for chelsea.
     */
    public void displayForChelseaFoul(int score) {
        TextView scoreView = (TextView) findViewById(R.id.chelsea_foul);
        scoreView.setText(String.valueOf(score));
    }



    /**
     *  A button that resets the scores of both teams
     */
    public void reset(View view) {
        liverpoolScore = 0;
        liverpoolFoul = 0;
        chelseaFoul = 0;
        chelseaScore = 0;
        displayForLiverpool(liverpoolScore);
        displayForLiverpoolFoul(liverpoolFoul);
        displayForChelseaFoul(chelseaFoul);
        displayForChelsea(chelseaScore);
    }
}