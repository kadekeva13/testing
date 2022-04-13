package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Locale;

public class HighestScoreActivity extends AppCompatActivity {

    private QuestionBank mQuestionLibrary = new QuestionBank();
    TextView txtScore;
    Button btnOk;

    int score;
    float scoreFLoat, floatScore, floatLength;

    TextToSpeech TTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highest_score);

        txtScore = (TextView) findViewById(R.id.textScore);
        btnOk = (Button) findViewById(R.id.ok);

        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);
        floatScore = (float) score;
        floatLength = (float) mQuestionLibrary.getLength();

        Log.d("score", String.valueOf(floatScore));
        Log.d("length", String.valueOf(floatLength));

        scoreFLoat = (float) (floatScore / floatLength);
        String conclusion = mQuestionLibrary.getConclusion(scoreFLoat);
        Log.d("Highest conclusion", conclusion);

        String[] result = mQuestionLibrary.getResult(conclusion);
        Log.d("Highest result", Arrays.deepToString(result));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            txtScore.setText("" + String.join("\n ", result));
        }

        TTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    TTS.setLanguage(new Locale("id", "ID"));

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        TTS.speak(String.join("\n ", result), TextToSpeech.QUEUE_ADD, null);
                    }
                } else {
                    Toast.makeText(HighestScoreActivity.this, "Error", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    public void onClick(View view) {
        AlertDialog.Builder alerBuilder = new AlertDialog.Builder(HighestScoreActivity.this);
        alerBuilder
                .setMessage("Test Again")
                .setCancelable(false)
                .setPositiveButton("New Test", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), QuizActivity.class));
                        finish();
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

        AlertDialog alertDialog = alerBuilder.create();
        alertDialog.show();
    }
}