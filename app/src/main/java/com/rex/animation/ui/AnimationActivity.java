package com.rex.animation.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rex.animation.R;

public class AnimationActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_play, btn_mode;

    ImageView imageView;

    private int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anim);
        res = getIntent().getIntExtra("RES", 0);
        btn_play = findViewById(R.id.btn_play);
        btn_play.setOnClickListener(this);
        btn_mode = findViewById(R.id.btn_mode);
        btn_mode.setOnClickListener(this);
        imageView = findViewById(R.id.imageView);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_play:
                break;
            case R.id.btn_mode:
                break;
        }
    }
}
