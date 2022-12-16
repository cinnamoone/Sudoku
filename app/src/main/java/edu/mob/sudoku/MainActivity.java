package edu.mob.sudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button play;
    Button statistic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play.setOnClickListener(this);


        statistic.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == play.getId()){
            Intent intent = new Intent(this, level.class );
            startActivity(intent);
        }else{
            Intent intent = new Intent(this, statisticsActivity.class);
            startActivity(intent);
        }


    }
}