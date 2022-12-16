package edu.mob.sudoku.Listeners;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import edu.mob.sudoku.R;

public class EditTextListener extends Activity{

    private EditText editText;

    public EditTextListener() {
        System.out.println("SDSD");
    }

    public void dupa() {
        System.out.println("DSSD");
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.oneb1);
        System.out.println("HSDHSH");

//        editText.addTextChangedListener(new TextWatcher() {
//
//            public void afterTextChanged(Editable s) {
//
//                // you can call or do what you want with your EditText here
//
//                // yourEditText...
//            }
//
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
//
//            public void onTextChanged(CharSequence s, int start, int before, int count) {}
//        });
    }


}


