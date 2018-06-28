package com.example.ian.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class AndroidActivity extends AppCompatActivity {

    int correctAnswer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        Button submit = (Button) findViewById(R.id.androidSubmitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionsAnswers();
                Toast.makeText(AndroidActivity.this, "Correct Answers: " + correctAnswer + "/4",
                        Toast.LENGTH_LONG).show();

            }
        });

        ImageButton forward = (ImageButton) findViewById(R.id.androidForward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scrollIntentForward();
            }
        });

        ImageButton backward = (ImageButton) findViewById(R.id.androidBackward);
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
                Intent homeMenu = new Intent(AndroidActivity.this, MainActivity.class);
                startActivity(homeMenu);
            }
        });

    }


    private void androidQuestionOne() {
        CheckBox explicit = (CheckBox) findViewById(R.id.androidQuestion1Box1);
        CheckBox activity = (CheckBox) findViewById(R.id.androidQuestion1Box2);
        CheckBox implicit = (CheckBox) findViewById(R.id.androidQuestion1Box3);
        CheckBox view = (CheckBox) findViewById(R.id.androidQuestion1Box4);

        boolean explicitChecked = explicit.isChecked();
        boolean activityChecked = activity.isChecked();
        boolean implicitChecked = implicit.isChecked();
        boolean viewChecked = view.isChecked();

        if (explicitChecked && !activityChecked && implicitChecked && !viewChecked) {
            correctAnswer = correctAnswer + 1;
        }
    }

    private void androidQuestionTwo() {
        RadioButton javaRadioButton = (RadioButton) findViewById(R.id.androidQuestion1RadioBox1);
        RadioButton cRadioButton = (RadioButton) findViewById(R.id.androidQuestion1RadioBox2);
        RadioButton kotlinRadioButton = (RadioButton) findViewById(R.id.androidQuestion1RadioBox3);
        RadioButton phpRadioButton = (RadioButton) findViewById(R.id.androidQuestion1RadioBox4);

        boolean javaRadioButtonChecked = javaRadioButton.isChecked();
        boolean cRadioButtonChecked = cRadioButton.isChecked();
        boolean kotlinRadioButtonChecked = kotlinRadioButton.isChecked();
        boolean phpRadioButtonChecked = javaRadioButton.isChecked();

        if (!javaRadioButtonChecked && !cRadioButtonChecked && !kotlinRadioButtonChecked && phpRadioButtonChecked) {
            correctAnswer = correctAnswer + 1;
        }
    }

    private void androidQuestionThree() {
        RadioButton stringRadioButton = (RadioButton) findViewById(R.id.androidQuestion1RadioBox5);
        RadioButton viewRadioButton = (RadioButton) findViewById(R.id.androidQuestion1RadioBox6);
        RadioButton clickRadioButton = (RadioButton) findViewById(R.id.androidQuestion1RadioBox7);
        RadioButton startActivityRadioButton = (RadioButton) findViewById(R.id.androidQuestion1RadioBox8);

        boolean stringRadioButtonChecked = stringRadioButton.isChecked();
        boolean viewRadioButtonChecked = viewRadioButton.isChecked();
        boolean clickRadioButtonChecked = clickRadioButton.isChecked();
        boolean startActivityRadioButtonChecked = startActivityRadioButton.isChecked();

        if (!stringRadioButtonChecked && viewRadioButtonChecked && !clickRadioButtonChecked && !startActivityRadioButtonChecked) {
            correctAnswer = correctAnswer + 1;
        }
    }

    private void androidQuestionFour() {
        CheckBox answerOne = (CheckBox) findViewById(R.id.androidQuestion1Box5);
        CheckBox answerTwo = (CheckBox) findViewById(R.id.androidQuestion1Box6);
        CheckBox answerThree = (CheckBox) findViewById(R.id.androidQuestion1Box7);
        CheckBox answerFour = (CheckBox) findViewById(R.id.androidQuestion1Box8);

        boolean answerOneChecked = answerOne.isChecked();
        boolean answerTwoChecked = answerTwo.isChecked();
        boolean answerThreeChecked = answerThree.isChecked();
        boolean answerFourChecked = answerFour.isChecked();

        if (answerOneChecked && answerTwoChecked && answerThreeChecked && !answerFourChecked) {
            correctAnswer = correctAnswer + 1;
        }
    }

    private void questionsAnswers() {
        androidQuestionOne();
        androidQuestionTwo();
        androidQuestionThree();
        androidQuestionFour();
    }

    private void scrollIntentForward() {
        Intent scrollEffectForward = new Intent(AndroidActivity.this, JavaActivity.class);
        startActivity(scrollEffectForward);
    }

    private void scrollIntentBackward() {
        Intent scrollEffectBackward = new Intent(AndroidActivity.this, MainActivity.class);
        startActivity(scrollEffectBackward);
    }
}
