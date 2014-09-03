package com.colabwc.chiunde.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends Activity {

    //Buttons
    private Button mTrueButon;
    private Button mFalseButon;
    private Button mNextButon;
    private Button mCheatButon;
    private TextView mQuestionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);

        mTrueButon = (Button)findViewById(R.id.true_button);
        mTrueButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                System.out.println(Toast.makeText(QuizActivity.this, R.string.correct_toast, Toast.LENGTH_SHORT));
            }
        });

        mFalseButon = (Button)findViewById(R.id.false_button);
        mFalseButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });

        mNextButon = (Button)findViewById(R.id.next_button);
        mNextButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

            }
        });

        mCheatButon = (Button)findViewById(R.id.cheat_button);
        mCheatButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
               //Start CheatActivity
                Intent i = new Intent(QuizActivity.this, CheatActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quiz, menu);
        return true;

    }

}
