package com.example.ian.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class PythonActivity extends AppCompatActivity {

    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        Button submitButton = (Button) findViewById(R.id.pythonSubmitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionsAnswers();
                Toast.makeText(PythonActivity.this, "Correct answers: " + correctAnswers + "/4",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton pythonForward = (ImageButton) findViewById(R.id.pythonForward);
        pythonForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pythonIntentForward();
            }
        });

        ImageButton pythonBackward = (ImageButton) findViewById(R.id.pythonBackward);
        pythonBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pythonIntentBackward();
            }
        });

        ImageButton homeButton = (ImageButton) findViewById(R.id.mainHome);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeMenu = new Intent(PythonActivity.this, MainActivity.class);
                startActivity(homeMenu);
            }
        });
    }

    private void pythonQuestionOne() {
        RadioButton yesAnswer = (RadioButton) findViewById(R.id.pythonQuestion1RadioBox1);
        RadioButton noAnswer = (RadioButton) findViewById(R.id.pythonQuestion1RadioBox2);

        boolean yesIsChecked = yesAnswer.isChecked();
        boolean noIsChecked = noAnswer.isChecked();

        if (yesIsChecked && !noIsChecked) {
            correctAnswers = correctAnswers + 1;
        }
    }

    private void pythonQuestionTwo() {
        RadioButton yesAnswer = (RadioButton) findViewById(R.id.pythonQuestion1RadioBox1);
        RadioButton noAnswer = (RadioButton) findViewById(R.id.pythonQuestion1RadioBox2);

        boolean yesIsChecked = yesAnswer.isChecked();
        boolean noIsChecked = noAnswer.isChecked();

        if (yesIsChecked && !noIsChecked) {
            correctAnswers = correctAnswers + 1;
        }
    }

    private void pythonQuestionThree() {
        CheckBox numbers = (CheckBox) findViewById(R.id.pythonQuestion1CheckBox1);
        CheckBox string = (CheckBox) findViewById(R.id.pythonQuestion1CheckBox2);
        CheckBox list = (CheckBox) findViewById(R.id.pythonQuestion1CheckBox3);
        CheckBox tuple = (CheckBox) findViewById(R.id.pythonQuestion1CheckBox4);
        CheckBox styling = (CheckBox) findViewById(R.id.pythonQuestion1CheckBox5);

        boolean numbersIsChecked = numbers.isChecked();
        boolean stringIsChecked = string.isChecked();
        boolean listIsChecked = list.isChecked();
        boolean tupleIsChecked = tuple.isChecked();
        boolean stylingIsChecked = styling.isChecked();

        if (numbersIsChecked && stringIsChecked && listIsChecked && tupleIsChecked && !stylingIsChecked) {
            correctAnswers = correctAnswers + 1;
        }
    }

    private void pythonQuestionFour() {
        RadioButton answerOne = (RadioButton) findViewById(R.id.pythonQuestion1RadioBox3);
        RadioButton answerTwo = (RadioButton) findViewById(R.id.pythonQuestion1RadioBox4);
        RadioButton answerThree = (RadioButton) findViewById(R.id.pythonQuestion1RadioBox5);
        RadioButton answerFour = (RadioButton) findViewById(R.id.pythonQuestion1RadioBox6);

        boolean answerOneIsChecked = answerOne.isChecked();
        boolean answerTwoIsChecked = answerTwo.isChecked();
        boolean answerThreeIsChecked = answerThree.isChecked();
        boolean answerFourIsChecked = answerFour.isChecked();

        if (!answerOneIsChecked && !answerTwoIsChecked && answerThreeIsChecked && !answerFourIsChecked) {
            correctAnswers = correctAnswers + 1;
        }
    }

    private void questionsAnswers() {
        pythonQuestionOne();
        pythonQuestionTwo();
        pythonQuestionThree();
        pythonQuestionFour();
    }

    private void pythonIntentForward(){
        Intent pythonEffectForward = new Intent(PythonActivity.this, WebActivity.class);
        startActivity(pythonEffectForward);
    }

    private void pythonIntentBackward(){
        Intent pythonEffectBackward = new Intent(PythonActivity.this, JavaActivity.class);
        startActivity(pythonEffectBackward);
    }
}
