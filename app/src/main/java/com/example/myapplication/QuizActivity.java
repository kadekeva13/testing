package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class QuizActivity extends AppCompatActivity {

    private QuestionBank mQuestionLibrary = new QuestionBank();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    TextToSpeech TTS;

    private String[] toSpeak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);

        TTS = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    TTS.setLanguage(new Locale("id", "ID"));

                    TTS.speak("Selamat Datang", TextToSpeech.QUEUE_ADD, null);
                    updateQuestion();
                } else {
                    Toast.makeText(QuizActivity.this, "Error", Toast.LENGTH_SHORT).show();

                }
            }
        });



        updateScore(mScore);
     }

    @Override
    protected void onPause() {
        if (TTS != null && TTS.isSpeaking()) {
            TTS.stop();
        }
        super.onPause();
    }

    private void updateQuestion() {
        if (TTS != null && TTS.isSpeaking()) {
            TTS.stop();
        }

        if (mQuestionNumber < mQuestionLibrary.getLength()) {

            toSpeak = new String[] {
                    mQuestionLibrary.getQuestion(mQuestionNumber),
                    mQuestionLibrary.getChoice(mQuestionNumber, 1),
                    mQuestionLibrary.getChoice(mQuestionNumber, 2),
                    mQuestionLibrary.getChoice(mQuestionNumber, 3),
            };
            Log.d("toSpeak", toSpeak[0].toString());
            TTS.speak(toSpeak[0], TextToSpeech.QUEUE_ADD, null, null);
            TTS.speak("A:" + toSpeak[1], TextToSpeech.QUEUE_ADD, null, null);
            TTS.speak("B:" + toSpeak[2], TextToSpeech.QUEUE_ADD, null, null);
            TTS.speak("C:" + toSpeak[3], TextToSpeech.QUEUE_ADD, null, null);

            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));

            mAnswer = mQuestionLibrary.getCorrectionAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else {
            Toast.makeText(QuizActivity.this, "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(QuizActivity.this, HighestScoreActivity.class);
            intent.putExtra("score", mScore);
            startActivity(intent);
            finish();
        }

    }

    private void updateScore(int mScore) {
        mScoreView.setText("Score: " + mScore);
    }

    public void onClick(View view) {
        Button answer = (Button) view;

        if (answer.getText() == mAnswer) {
            mScore++;
            Toast.makeText(QuizActivity.this, "Benar!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(QuizActivity.this, "Salah!", Toast.LENGTH_SHORT).show();
        }

        updateScore(mScore);
        updateQuestion();
    }


    private void gameOver() {
        AlertDialog.Builder alerBuilder = new AlertDialog.Builder(QuizActivity.this);
        alerBuilder
                .setMessage("Game Over! Your Score is " + mScore + ".")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
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