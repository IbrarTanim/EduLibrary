package com.educareapps.edulibrary;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.educareapps.mylibrary.Animanation;
import com.educareapps.mylibrary.BaseActivity;
import com.educareapps.mylibrary.CircularImageView;
import com.educareapps.mylibrary.CustomToast;
import com.educareapps.mylibrary.InternetAvailabilityCheck;

public class MainActivity extends BaseActivity {
    MainActivity activity;
    CircularImageView civTest;
    TextView tvXlS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;
        tvXlS = (TextView) findViewById(R.id.tvXlS);
        civTest = (CircularImageView) findViewById(R.id.civTest);
        civTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomToast.shortMessage(activity, "Not connected");

            }
        });
        Animanation.zoomOut(civTest);
        //XLSReader.order(activity,tvXlS);

        if (InternetAvailabilityCheck.getConnectivityStatus(activity) == 0) {
            CustomToast.shortMessage(activity, "Net not connected");
        } else if (InternetAvailabilityCheck.getConnectivityStatus(activity) == 1) {
            CustomToast.shortMessage(activity, "wifi connected");
        } else if (InternetAvailabilityCheck.getConnectivityStatus(activity) == 1) {
            CustomToast.shortMessage(activity, "mobile connected");
        }

        //CustomToast.shortMessage(activity, "Custom Toast Implemented");
        //CommonDialog.generalDialog(activity, "ABCDEF");

    }
}
