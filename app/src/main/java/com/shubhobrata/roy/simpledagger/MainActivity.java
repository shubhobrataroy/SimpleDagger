package com.shubhobrata.roy.simpledagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.shubhobrata.roy.simpledagger.controller.Controller;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Controller controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App.appComponent.inject(this);

        TextView textView = findViewById(R.id.tv_hello);
        textView.setText(controller.fetchTestData());
    }
}
