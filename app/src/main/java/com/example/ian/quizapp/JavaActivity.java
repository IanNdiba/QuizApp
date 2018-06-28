package com.example.ian.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class JavaActivity extends AppCompatActivity {

    int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        Button submitButton = (Button) findViewById(R.id.javaSubmitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionsAnswers();
                Toast.makeText(JavaActivity.this, "Correct answers: " + correctAnswers + "/4",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton forward = (ImageButton) findViewById(R.id.javaForward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollIntentForward();
            }
        });

        ImageButton backward = (ImageButton) findViewById(R.id.javaBackward);
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollIntentBackward();
            }
        });

        ImageButton homeButton = (ImageButton) findViewById(R.id.mainHome);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeMenu = new Intent(JavaActivity.this, MainActivity.class);
                startActivity(homeMenu);
            }
        });
    }

    private void javaQuestionOne() {
        RadioButton answer1 = (RadioButton) findViewById(R.id.javaQuestion1RadioBox1);
        RadioButton answer2 = (RadioButton) findViewById(R.id.javaQuestion1RadioBox2);
        RadioButton answer3 = (RadioButton) findViewById(R.id.javaQuestion1RadioBox3);
        RadioButton answer4 = (RadioButton) findViewById(R.id.javaQuestion1RadioBox4);

        boolean answerOneIsChecked = answer1.isChecked();
        boolean answerTwoIsChecked = answer2.isChecked();
        boolean answerThreeIsChecked = answer3.isChecked();
        boolean answerFourIsChecked = answer4.isChecked();

        if (!answerOneIsChecked && !answerTwoIsChecked && answerThreeIsChecked && !answerFourIsChecked) {
            correctAnswers = correctAnswers + 1;
        }
    }

    private void javaQuestionTwo() {
        RadioButton dataStruc = (RadioButton) findViewById(R.id.javaQuestion1RadioBox5);
        RadioButton polymorphism = (RadioButton) findViewById(R.id.javaQuestion1RadioBox6);
        RadioButton encapsulation = (RadioButton) findViewById(R.id.javaQuestion1RadioBox7);
        RadioButton abstraction = (RadioButton) findViewById(R.id.javaQuestion1RadioBox8);

        boolean dataStructureIsChecked = dataStruc.isChecked();
        boolean polymorphismIsChecked = polymorphism.isChecked();
        boolean encapsulationIsChecked = encapsulation.isChecked();
        boolean abstractionIsChecked = abstraction.isChecked();

        if (dataStructureIsChecked && !polymorphismIsChecked && !encapsulationIsChecked && !abstractionIsChecked) {
            correctAnswers = correctAnswers + 1;
        }
    }

    private void javaQuestionThree() {
        CheckBox privat = (CheckBox) findViewById(R.id.javaQuestion1CheckBox1);
        CheckBox visible = (CheckBox) findViewById(R.id.javaQuestion1CheckBox2);
        CheckBox publik = (CheckBox) findViewById(R.id.javaQuestion1CheckBox3);
        CheckBox protectd = (CheckBox) findViewById(R.id.javaQuestion1CheckBox4);

        boolean privatIsChecked = privat.isChecked();
        boolean visibleIsChecked = visible.isChecked();
        boolean publikIsChecked = publik.isChecked();
        boolean protectdIsChecked = protectd.isChecked();


        if (privatIsChecked && !visibleIsChecked && publikIsChecked && protectdIsChecked) {
            correctAnswers = correctAnswers + 1;
        }
    }

    private void javaQuestionFour() {
        RadioButton answer1 = (RadioButton) findViewById(R.id.javaQuestion1RadioBox5);
        RadioButton answer2 = (RadioButton) findViewById(R.id.javaQuestion1RadioBox6);

        boolean answer1IsChecked = answer1.isChecked();
        boolean answer2IsChecked = answer2.isChecked();

        if (answer1IsChecked && !answer2IsChecked) {
            correctAnswers = correctAnswers + 1;
        }
    }

    private void questionsAnswers() {
        javaQuestionOne();
        javaQuestionTwo();
        javaQuestionFour();
        javaQuestionThree();
    }

    private void scrollIntentForward() {
        Intent scrollEffectForward = new Intent(JavaActivity.this, PythonActivity.class);
        startActivity(scrollEffectForward);
    }

    private void scrollIntentBackward() {
        Intent scrollEffectBackward = new Intent(JavaActivity.this, AndroidActivity.class);
        startActivity(scrollEffectBackward);
    }
}
