package com.example.neil.beescorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;
    int teamABreak = 0;
    int teamBBreak = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *  Team A break and score increase and display
     */
    public void pointTeamA(View v) {
        teamAScore += 1;
        displayTeamA(teamAScore);
    }

    public void breakTeamA(View v) {
        teamABreak += 1;
        displayABreak(teamABreak);
    }

    public void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayABreak(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_break);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  Team B break and score increase and display
     */
    public void pointTeamB(View v) {
        teamBScore += 1;
        displayTeamB(teamBScore);
    }

    public void breakTeamB(View v) {
        teamBBreak += 1;
        displayBBreak(teamBBreak);
    }

    public void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBBreak(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_break);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *  Reset scores and breaks
     */
    public void resetGame(View v) {
        teamAScore = 0;
        teamABreak = 0;
        teamBScore = 0;
        teamBBreak = 0;

        displayTeamA(teamAScore);
        displayABreak(teamABreak);
        displayTeamB(teamBScore);
        displayBBreak(teamBBreak);
    }
}
