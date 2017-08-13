package com.educareapps.edulibrary;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.educareapps.mylibrary.BackgroundMusicService;
import com.educareapps.mylibrary.BaseActivity;
import com.educareapps.mylibrary.CircularImageView;
import com.educareapps.mylibrary.CircularTextView;
import com.educareapps.mylibrary.CommonDialog;
import com.educareapps.mylibrary.CustomColorSet;

public class MainActivity extends BaseActivity {
    MainActivity activity;
    CircularImageView civTest;
    CircularTextView cTvTest;
    TextView tvXlS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        tvXlS = (TextView) findViewById(R.id.tvXlS);
        cTvTest = (CircularTextView) findViewById(R.id.cTvTest);
        civTest = (CircularImageView) findViewById(R.id.civTest);

        cTvTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomColorSet.showColorPicker(activity, 1, cTvTest,null);
            }
        });
        tvXlS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomColorSet.showColorPicker(activity, 0, null,tvXlS);
            }
        });

        civTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackgroundMusicService.startMusic(activity);
                CommonDialog.generalDialog(activity, "Nothing to say");

            }
        });


    }
}
