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
        // legal
        // make move
        // check win
        if(!game.isOccupied(row, col))
            view.displayMessage("occupied");
        if(!game.userMove(row, col)) view.displayMessage("its a tie");
        if(game.checkWin(row, col) == -1) view.displayMessage("you lose");
        if(game.checkWin(row, col) == 1) view.displayMessage("you win");

    }
}
