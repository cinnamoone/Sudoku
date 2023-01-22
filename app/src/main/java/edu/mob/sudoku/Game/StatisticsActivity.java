package edu.mob.sudoku.Game;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.mob.sudoku.R;

public class StatisticsActivity extends AppCompatActivity implements View.OnClickListener {
    Button back;
    ListView result;

    public List<Float> getScores(){
        Collections.sort(MainActivity.scores,new Comparator<Float>() {
            public int compare(Float o1, Float o2) {
                return (int) (o2 - o1);
            }
        });
        return MainActivity.scores;
    }


    private List<String> mapScores(List<Float> list){
        List<String> results = new ArrayList<>();
        for(int i =0; i<list.size();i++){
            String result = String.valueOf(i + 1) + ". " + list.get(i).intValue() + " punktów";
            results.add(result);
        }
        return results;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        result = findViewById(R.id.results);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mapScores(getScores()));
        result.setAdapter(adapter);

        back = findViewById(R.id.back_button);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);

    }
}