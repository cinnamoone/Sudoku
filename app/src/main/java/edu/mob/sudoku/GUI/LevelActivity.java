package edu.mob.sudoku.GUI;

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
            startActivity(intent);
        }else if(view.getId() == mediumButton.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }else if(view.getId() == hardButton.getId()){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

    }
}