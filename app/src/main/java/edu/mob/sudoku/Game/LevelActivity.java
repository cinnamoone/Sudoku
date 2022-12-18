package edu.mob.sudoku.Game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import edu.mob.sudoku.R;

public class LevelActivity extends AppCompatActivity implements View.OnClickListener {

    Button easyButton;
    Button mediumButton;
    Button hardButton;

    static String choice;

    String easy = "280304150700005000094018000000081703040750006873006010000060405600540800400800691";
    String hard = "040100083005000009000290100000306200900807300300500076050083600030651007001000538";
    String medium = "905318000800020000060000080070980140100650007003100050704801520608037000200000060";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        easyButton = findViewById(R.id.easy_button);
        mediumButton = findViewById(R.id.medium_button);
        hardButton = findViewById(R.id.hard_button);

        easyButton.setOnClickListener(this);
        mediumButton.setOnClickListener(this);
        hardButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == easyButton.getId()){
            Intent intent = new Intent(this, MainActivity.class );
            choice = easy;
            startActivity(intent);
        }else if(view.getId() == mediumButton.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            choice = medium;
            startActivity(intent);
        }else if(view.getId() == hardButton.getId()){
            Intent intent = new Intent(this, MainActivity.class);
            choice = hard;
            startActivity(intent);
        }

    }
}