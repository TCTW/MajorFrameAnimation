package com.rex.animation.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rex.animation.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                startAnimActivity(0);
                break;
            case R.id.button2:
                startAnimActivity(1);
                break;
            case R.id.button3:
                startAnimActivity(2);
                break;
        }
    }

    private void startAnimActivity(int res) {
        Intent intent = new Intent(this, AnimationActivity.class);
        intent.putExtra("RES", res);
        startActivity(intent);
    }
}
