package com.example.android.soccerscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    int ycardTeamA = 0;
    int ycardTeamB = 0;

    int rcardTeamA = 0;
    int rcardTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState!=null){
            rcardTeamA=savedInstanceState.getInt("rcardA");
            ycardTeamA=savedInstanceState.getInt("ycardA");
            scoreTeamA=savedInstanceState.getInt("scoreA");
        }

        YellowForTeamA(ycardTeamA);
        YellowForTeamB(ycardTeamB);

        RedForTeamA(rcardTeamA);
        RedForTeamB(rcardTeamB);

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }


    public void setYcardTeamA(View view) {
        ycardTeamA = ycardTeamA + 1;
        YellowForTeamA(ycardTeamA);
    }

    public void setRcardTeamA(View view) {
        rcardTeamA = rcardTeamA + 1;
        RedForTeamA(rcardTeamA);
    }

    public void setScoreTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display the red card count for Team A
     */
    public void RedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_rcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the yellow card count for Team A
     */
    public void YellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_ycard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void SetYcardTeamB(View view) {
        ycardTeamB = ycardTeamB + 1;
        YellowForTeamB(ycardTeamB);
    }


    public void SetRcardTeamB(View view) {
        rcardTeamB = rcardTeamB + 1;
        RedForTeamB(rcardTeamB);
    }

    public void setScoreTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Set and Display the red card count for Team A
     */
    public void RedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_rcard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Set and Display the yellow card count for teamB
     */
    public void YellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_ycard);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * This method resets score
     */
    public void resetScore(View View) {
        scoreTeamA = 0;
        scoreTeamB = 0;

        ycardTeamA = 0;
        ycardTeamB = 0;

        rcardTeamA = 0;
        rcardTeamB = 0;

        displayForTeamB(scoreTeamB);
        YellowForTeamB(ycardTeamB);
        RedForTeamB(rcardTeamB);

        displayForTeamA(scoreTeamA);
        YellowForTeamA(ycardTeamA);
        RedForTeamA(rcardTeamA);
    }

    Bundle savedInstanceState = new Bundle();

    @Override
    public void onSaveInstanceState(Bundle currentState) {
        super.onSaveInstanceState(currentState);
        currentState.putInt("rcardA",rcardTeamA);
        currentState.putInt("ycardA",ycardTeamA);
        currentState.putInt("scoreA",scoreTeamA);
        }

}
