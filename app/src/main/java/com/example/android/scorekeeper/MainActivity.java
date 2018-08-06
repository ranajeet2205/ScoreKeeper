package com.example.android.scorekeeper;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayScoreA(0);
        addSixPointsTeamA();
        addThreePointsTeamA();
        addTwoPointsTeamA();
        addOnePointTeamA();

        displayScoreB(0);
        addSixPointsTeamB();
        addThreePointsTeamB();
        addTwoPointsTeamB();
        addOnePointTeamB();

        reset();

    }

    /**
     * Display score for Team A
     *
     * @param score
     */

    public void displayScoreA(int score) {
        TextView teamA = (TextView) findViewById(R.id.scoreA);
        teamA.setText(String.valueOf(score));

        if (scoreTeamA > scoreTeamB) {
            teamA.setTextColor(Color.GREEN);
        } else if (scoreTeamA < scoreTeamB) {
            teamA.setTextColor(Color.RED);
        }

    }
    /*
      Add Six Points for TeamA
     */

    public void addSixPointsTeamA() {
        Button touchdownTeamA = (Button) findViewById(R.id.btn_touch_down_team_A);
        touchdownTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 6;
                displayScoreA(scoreTeamA);
            }
        });
    }

    /*
      Add Three Points for TeamA
     */

    public void addThreePointsTeamA() {
        Button fieldGoalTeamA = (Button) findViewById(R.id.btn_field_goal_team_A);
        fieldGoalTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 3;
                displayScoreA(scoreTeamA);
            }
        });
    }

    /*
      Add Two Points for TeamA
     */

    public void addTwoPointsTeamA() {
        Button safetyTeamA = (Button) findViewById(R.id.btn_safety_team_A);
        safetyTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 2;
                displayScoreA(scoreTeamA);
            }
        });
    }

    /*
      Add one Points for TeamA
     */

    public void addOnePointTeamA() {
        Button extraPointTeamA = (Button) findViewById(R.id.btn_extra_point_team_A);
        extraPointTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA + 1;
                displayScoreA(scoreTeamA);
            }
        });
    }

    /**
     * Display score for Team B
     *
     * @param score
     */

    public void displayScoreB(int score) {
        TextView teamB = (TextView) findViewById(R.id.scoreB);
        teamB.setText(String.valueOf(score));

        if (scoreTeamA < scoreTeamB) {
            teamB.setTextColor(Color.GREEN);
        } else if (scoreTeamA > scoreTeamB) {
            teamB.setTextColor(Color.RED);
        }
    }

    /**
     * Add six Points for TeamB
     */


    public void addSixPointsTeamB() {
        Button touchdownTeamB = (Button) findViewById(R.id.btn_touch_down_team_B);
        touchdownTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB + 6;
                displayScoreB(scoreTeamB);
            }
        });
    }

    /**
     * Add Three Points for TeamB
     */

    public void addThreePointsTeamB() {
        Button fieldGoalTeamB = (Button) findViewById(R.id.btn_field_goal_team_B);
        fieldGoalTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB + 3;
                displayScoreB(scoreTeamB);
            }
        });
    }

    /**
     * Add Two Points for TeamB
     */

    public void addTwoPointsTeamB() {
        Button safetyTeamB = (Button) findViewById(R.id.btn_safety_team_B);
        safetyTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB + 2;
                displayScoreB(scoreTeamB);
            }
        });
    }

    /**
     * Add One Points for TeamB
     */

    public void addOnePointTeamB() {
        Button extraPointTeamB = (Button) findViewById(R.id.btn_extra_point_team_B);
        extraPointTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB + 1;
                displayScoreB(scoreTeamB);
            }
        });
    }

    /**
     * Reset the Score
     */


    public void reset() {

        Button reset = (Button) findViewById(R.id.btn_reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = 0;
                scoreTeamB = 0;
                displayScoreA(scoreTeamA);
                displayScoreB(scoreTeamB);
            }
        });

    }


}
