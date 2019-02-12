package com.example.user.graphicalprimitives;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void line(View v)
    {
        setContentView(new Line(this));
    }
    public void circle(View v)
    {
        setContentView(new Circle(this));
    }
    public void rect(View v)
    {
        setContentView(new Rect(this));
    }

    @Override
    public void onBackPressed() {
        setContentView(R.layout.activity_main);
    }
}
