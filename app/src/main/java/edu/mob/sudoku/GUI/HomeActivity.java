package edu.mob.sudoku.GUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import edu.mob.sudoku.R;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button goToInstruction;
    Button newGame;
    Button statistic;
    Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        goToInstruction = findViewById(R.id.instruction_button);
        newGame = findViewById(R.id.newgame_button);
        statistic = findViewById(R.id.statistics_button);
        exit = findViewById(R.id.exit_button);

        goToInstruction.setOnClickListener(this);
        newGame.setOnClickListener(this);
        statistic.setOnClickListener(this);
        exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == goToInstruction.getId()){
            Intent intent = new Intent(this, InstructionActivity.class );
            startActivity(intent);
        }else if(view.getId() == newGame.getId()){
            Intent intent = new Intent(this, LevelActivity.class );
            startActivity(intent);
        }else if(view.getId() == statistic.getId()) {
            Intent intent = new Intent(this, StatisticsActivity.class);
            startActivity(intent);
        }else if(view.getId() == exit.getId()){
            finish();
        }
    }



    


}