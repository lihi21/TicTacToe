package com.example.myapplication;

public class Game
{
    private final int ROWS = 3;
    private final int COLS = 3;
    private int[][] board = new int[ROWS][COLS];
    private int turnCounter=0;



    public boolean userMove(int row,int col)
    {
        turnCounter++;
        if(turnCounter == 9) return false;
        return  true;

    }

    public int getTurn()
    {
        return turnCounter%2;
    }


    public boolean isOccupied(int row,int col)
    {
        if (this.board[row][col] == 0)
        {
            if(this.turnCounter % 2 == 0)
            {
                this.board[row][col] = 1;
            }
            else
            {
                this.board[row][col] = -1;
            }

        }
        else
        {
            return false;
        }
        return true;
    }


    public int checkWin(int row,int col)
    {
        int count = 0;
        for (int i = 0; i < 3; i++)
        {

            for (int j = 0; j < 3; j++)
            {
                  count += board[i][j];
            }
        }
        if(count == 3) return 1; if(count == -3) return -1;

        count = 0;
        for (int i = 0; i < 3; i++)
        {

            for (int j = 0; j < 3; j++)
            {
                count += board[i][j];
            }
        }
        if(count == 3) return 1; if(count == -3) return -1;

        count = 0;
        for (int i = 0; i < 3; i++)
        {

            count += board[i][i];

        }
        if(count == 3) return 1; if(count == -3) return -1;

        count = 0;
        for (int i = 0; i < 3; i++)
        {


                count += board[i][board.length-i-1];

        }
        if(count == 3) return 1; if(count == -3) return -1;

        return  0;

    }




}
