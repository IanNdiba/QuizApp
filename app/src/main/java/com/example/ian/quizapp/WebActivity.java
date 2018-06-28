package com.example.ian.quizapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class WebActivity extends AppCompatActivity {

    int webAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Button submitButton = (Button) findViewById(R.id.webSubmitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                questionsAnswers();
                Toast.makeText(WebActivity.this, "Correct answers:" + webAnswers + "/4",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton webForward = (ImageButton) findViewById(R.id.webForward);
        webForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webIntentForward();
            }
        });

        final ImageButton webBackward = (ImageButton) findViewById(R.id.webBackward);
        webBackward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webIntentBackward();
            }
        });

        ImageButton homeButton = (ImageButton) findViewById(R.id.mainHome);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeMenu = new Intent(WebActivity.this, MainActivity.class);
                startActivity(homeMenu);
            }
        });
    }

    private void webQuestionOne() {
        RadioButton procedural = (RadioButton) findViewById(R.id.webQuestion1RadioBox1);
        RadioButton scripting = (RadioButton) findViewById(R.id.webQuestion1RadioBox2);
        RadioButton oop = (RadioButton) findViewById(R.id.webQuestion1RadioBox3);

        boolean proceduralIsChecked = procedural.isChecked();
        boolean scriptingIsChecked = scripting.isChecked();
        boolean oopIsChecked = oop.isChecked();

        if (!proceduralIsChecked && scriptingIsChecked && !oopIsChecked) {
            webAnswers = webAnswers + 1;
        }
    }

    private void webQuestionTwo() {
        RadioButton answerHtml = (RadioButton) findViewById(R.id.webQuestion1RadioBox4);
        RadioButton answerCss = (RadioButton) findViewById(R.id.webQuestion1RadioBox5);
        RadioButton answerJavascript = (RadioButton) findViewById(R.id.webQuestion1RadioBox6);
        RadioButton answerKotlin = (RadioButton) findViewById(R.id.webQuestion1RadioBox7);

        boolean htmlIsChecked = answerHtml.isChecked();
        boolean cssIsChecked = answerCss.isChecked();
        boolean javascriptIsChecked = answerJavascript.isChecked();
        boolean kotlinIsChecked = answerKotlin.isChecked();

        if (!htmlIsChecked && !cssIsChecked && !javascriptIsChecked && kotlinIsChecked) {
            webAnswers = webAnswers + 1;
        }
    }

    private void webQuestionThree() {
        RadioButton answerCPlus = (RadioButton) findViewById(R.id.webQuestion1RadioBox8);
        RadioButton answerBootstrap = (RadioButton) findViewById(R.id.webQuestion1RadioBox9);
        RadioButton answerJQuery = (RadioButton) findViewById(R.id.webQuestion1RadioBox10);
        RadioButton answerCss = (RadioButton) findViewById(R.id.webQuestion1RadioBox11);

        boolean cPlusIsChecked = answerCPlus.isChecked();
        boolean bootstrapIsChecked = answerBootstrap.isChecked();
        boolean jQueryIsChecked = answerJQuery.isChecked();
        boolean cssIsChecked = answerCss.isChecked();

        if (cPlusIsChecked && !bootstrapIsChecked && !jQueryIsChecked && !cssIsChecked) {
            webAnswers = webAnswers + 1;
        }
    }

    private void webQuestionFour() {
        RadioButton answerCss = (RadioButton) findViewById(R.id.webQuestion1RadioBox12);
        RadioButton answerHtml = (RadioButton) findViewById(R.id.webQuestion1RadioBox13);
        RadioButton answerPhp = (RadioButton) findViewById(R.id.webQuestion1RadioBox14);
        RadioButton answerAngularJs = (RadioButton) findViewById(R.id.webQuestion1RadioBox15);

        boolean cssIsChecked = answerCss.isChecked();
        boolean htmlIsChecked = answerHtml.isChecked();
        boolean phpIsChecked = answerPhp.isChecked();
        boolean angularJsIsChecked = answerAngularJs.isChecked();

        if (!cssIsChecked && !htmlIsChecked && phpIsChecked && !angularJsIsChecked) {
            webAnswers = webAnswers + 1;
        }
    }

    private void questionsAnswers() {
        webQuestionOne();
        webQuestionTwo();
        webQuestionThree();
        webQuestionFour();
    }

    private void webIntentForward(){
        Intent webEffectForward = new Intent(WebActivity.this, MainActivity.class);
        startActivity(webEffectForward);
    }

    private void webIntentBackward(){
        Intent webEffectBackward = new Intent(WebActivity.this, PythonActivity.class);
        startActivity(webEffectBackward);
    }
}
