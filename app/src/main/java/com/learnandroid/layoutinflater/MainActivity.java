package com.learnandroid.layoutinflater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout mainLayout;
    View view1, view2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = (LinearLayout)findViewById(R.id.main);
        view1 = getLayoutInflater().inflate(R.layout.sub1, mainLayout, false);
        view2 = getLayoutInflater().inflate(R.layout.sub2, mainLayout, false);

        mainLayout.addView(view2);
        mainLayout.addView(view1);
    }
}
