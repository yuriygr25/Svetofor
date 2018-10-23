package com.example.yura.svetofor;

import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    public MainActivity() {
    }

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        mInfoTextView = (TextView) findViewById(R.id.textView);
        Button greenButton = (Button) findViewById(R.id.buttonGreen);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText(R.string.Green);
                mConstraintLayout.setBackgroundColor(ContextCompat
                        .getColor(MainActivity.this, R.color.greenColor));
            }
        });

    }



    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.Red);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.redColor));

    }

    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.Yellow);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor));
    }

//    public void onGreenButtonClick(View view) {
//        mInfoTextView.setText(R.string.Green);
//        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenColor));
//    }

}
