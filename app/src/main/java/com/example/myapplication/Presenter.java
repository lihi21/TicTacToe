package com.example.myapplication;

public class Presenter {

    private IView view;
    private Game game;


    public Presenter(IView view)
    {
        this.view = view;
        this.game = new Game();

    }


    public void userClick(int row,int col)
    {

    }
}
