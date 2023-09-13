package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IView{
    private Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new Presenter(this);


    }

    public void userClick(View view)
    {
        String id=getResources().getResourceEntryName(view.getId());
        int row = id.charAt(1);
        int col = id.charAt(2);

        presenter.userClick(row,col);

    }

    @Override
    public void displayMessage(String message)
    {
        if(message != null || message == "")


    }

    @Override
    public void updateBoard(int row, int col, char symbol)
    {

    }
}
