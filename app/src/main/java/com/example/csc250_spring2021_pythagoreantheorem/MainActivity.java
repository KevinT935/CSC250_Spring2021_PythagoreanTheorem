package com.example.csc250_spring2021_pythagoreantheorem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity
{
    private EditText Adecimal;
    private EditText Bdecimal;
    private TextView answerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Adecimal = this.findViewById(R.id.Adecimal);
        this.Bdecimal = this.findViewById(R.id.Bdecimal);
        this.answerTV = this.findViewById(R.id.answerTV);
    }
    public  void onButtonClicked(View v)
    {
        Integer Avalue = Integer.valueOf(Adecimal.getText().toString());
        Integer Bvalue = Integer.valueOf(Bdecimal.getText().toString());
        this.answerTV.setText("");
        int C;
        C = (Avalue^2) + (Bvalue^2);
    }
}