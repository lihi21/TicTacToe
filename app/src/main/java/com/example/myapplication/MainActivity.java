package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void userClick(View view)
    {
        if(view.getId() == R.id.b01)
            Toast.makeText(this,"buttun 01 clicked",Toast.LENGTH_LONG).show();
    }
}
