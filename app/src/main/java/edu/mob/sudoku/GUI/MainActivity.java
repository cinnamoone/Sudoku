package edu.mob.sudoku.GUI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import edu.mob.sudoku.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button home;
    EditText editText;
    private final int SIZE = 9;

    private EditText editTexts[][] = new EditText[SIZE][SIZE];
    private int[][] board = new int[SIZE][SIZE];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.homeButton);
        home.setOnClickListener(this);

        initBoard("280304150700005000094018000000081703040750006873006010000060405600540800400800691");

        initEditTexts();

        setEditTextValues();
        setUnchangeableEditTexts();
        setTextChangeListeners();

    }

    private void initBoard(String numbers){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                int n = j + (SIZE*i);
                this.board[i][j] = Integer.parseInt(String.valueOf(numbers.charAt(n)));
            }
        }

    }

    private void initEditTexts() {
        editTexts[0][0] = findViewById(R.id.oneb1);
        editTexts[0][1] = findViewById(R.id.oneb2);
        editTexts[0][2] = findViewById(R.id.oneb3);
        editTexts[0][3] = findViewById(R.id.twob1);
        editTexts[0][4] = findViewById(R.id.twob2);
        editTexts[0][5] = findViewById(R.id.twob3);
        editTexts[0][6] = findViewById(R.id.threeb1);
        editTexts[0][7] = findViewById(R.id.threeb2);
        editTexts[0][8] = findViewById(R.id.threeb3);

        editTexts[1][0] = findViewById(R.id.oneb4);
        editTexts[1][1] = findViewById(R.id.oneb5);
        editTexts[1][2] = findViewById(R.id.oneb6);
        editTexts[1][3] = findViewById(R.id.twob4);
        editTexts[1][4] = findViewById(R.id.twob5);
        editTexts[1][5] = findViewById(R.id.twob6);
        editTexts[1][6] = findViewById(R.id.threeb4);
        editTexts[1][7] = findViewById(R.id.threeb5);
        editTexts[1][8] = findViewById(R.id.threeb6);

        editTexts[2][0] = findViewById(R.id.oneb7);
        editTexts[2][1] = findViewById(R.id.oneb8);
        editTexts[2][2] = findViewById(R.id.oneb9);
        editTexts[2][3] = findViewById(R.id.twob7);
        editTexts[2][4] = findViewById(R.id.twob8);
        editTexts[2][5] = findViewById(R.id.twob9);
        editTexts[2][6] = findViewById(R.id.threeb7);
        editTexts[2][7] = findViewById(R.id.threeb8);
        editTexts[2][8] = findViewById(R.id.threeb9);

        editTexts[3][0] = findViewById(R.id.fourb1);
        editTexts[3][1] = findViewById(R.id.fourb2);
        editTexts[3][2] = findViewById(R.id.fourb3);
        editTexts[3][3] = findViewById(R.id.fiveb1);
        editTexts[3][4] = findViewById(R.id.fiveb2);
        editTexts[3][5] = findViewById(R.id.fiveb5);
        editTexts[3][6] = findViewById(R.id.sixb1);
        editTexts[3][7] = findViewById(R.id.sixb2);
        editTexts[3][8] = findViewById(R.id.sixb3);

        editTexts[4][0] = findViewById(R.id.fourb4);
        editTexts[4][1] = findViewById(R.id.fourb5);
        editTexts[4][2] = findViewById(R.id.fourb6);
        editTexts[4][3] = findViewById(R.id.fiveb4);
        editTexts[4][4] = findViewById(R.id.fiveb5);
        editTexts[4][5] = findViewById(R.id.fiveb6);
        editTexts[4][6] = findViewById(R.id.sixb4);
        editTexts[4][7] = findViewById(R.id.sixb5);
        editTexts[4][8] = findViewById(R.id.sixb6);

        editTexts[5][0] = findViewById(R.id.fourb7);
        editTexts[5][1] = findViewById(R.id.fourb8);
        editTexts[5][2] = findViewById(R.id.fourb9);
        editTexts[5][3] = findViewById(R.id.fiveb7);
        editTexts[5][4] = findViewById(R.id.fiveb8);
        editTexts[5][5] = findViewById(R.id.fiveb9);
        editTexts[5][6] = findViewById(R.id.sixb7);
        editTexts[5][7] = findViewById(R.id.sixb8);
        editTexts[5][8] = findViewById(R.id.sixb9);

        editTexts[6][0] = findViewById(R.id.sevenb1);
        editTexts[6][1] = findViewById(R.id.sevenb2);
        editTexts[6][2] = findViewById(R.id.sevenb3);
        editTexts[6][3] = findViewById(R.id.eightb1);
        editTexts[6][4] = findViewById(R.id.eightb2);
        editTexts[6][5] = findViewById(R.id.eightb3);
        editTexts[6][6] = findViewById(R.id.nineb1);
        editTexts[6][7] = findViewById(R.id.nineb2);
        editTexts[6][8] = findViewById(R.id.nineb3);

        editTexts[7][0] = findViewById(R.id.sevenb4);
        editTexts[7][1] = findViewById(R.id.sevenb5);
        editTexts[7][2] = findViewById(R.id.sevenb6);
        editTexts[7][3] = findViewById(R.id.eightb4);
        editTexts[7][4] = findViewById(R.id.eightb5);
        editTexts[7][5] = findViewById(R.id.eightb6);
        editTexts[7][6] = findViewById(R.id.nineb4);
        editTexts[7][7] = findViewById(R.id.nineb5);
        editTexts[7][8] = findViewById(R.id.nineb6);

        editTexts[8][0] = findViewById(R.id.sevenb7);
        editTexts[8][1] = findViewById(R.id.sevenb8);
        editTexts[8][2] = findViewById(R.id.sevenb9);
        editTexts[8][3] = findViewById(R.id.eightb7);
        editTexts[8][4] = findViewById(R.id.eightb8);
        editTexts[8][5] = findViewById(R.id.eightb9);
        editTexts[8][6] = findViewById(R.id.nineb7);
        editTexts[8][7] = findViewById(R.id.nineb8);
        editTexts[8][8] = findViewById(R.id.nineb9);
    }

    private void setEditTextValues(){
        for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(board[i][j] == 0){
                    editTexts[i][j].setText("");
                }else{
                    editTexts[i][j].setText(Integer.toString(board[i][j]));
                }

            }
        }
    }

    private void setUnchangeableEditTexts(){
        for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if(board[i][j] != 0) {
                    editTexts[i][j].setOnTouchListener(getOnTouchIngorer());
                    editTexts[i][j].setTextColor(Color.MAGENTA);
                    editTexts[i][j].setTypeface(null, Typeface.BOLD);
                }
            }
        }
    }

    private View.OnTouchListener getOnTouchIngorer() {
        return new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                return true; // the listener has consumed the event
            }
        };
    }


    private void setTextChangeListeners(){
        for(int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++){
                editTexts[i][j].addTextChangedListener(getEditTextOnChangeBehaviour());
            }
        }
    }


    private TextWatcher getEditTextOnChangeBehaviour(){
        return new TextWatcher() {

            public void afterTextChanged(Editable s) {}

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
        };
    }


    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, HomeActivity.class );
        startActivity(intent);

    }
}
