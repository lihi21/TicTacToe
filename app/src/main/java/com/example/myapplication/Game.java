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


    public boolean isOccupied(int row,int col)
    {
        if (this.board[row][col] == 0)
        {
            if(this.turnCounter % 2 == 0)
            {
                this.board[row][col] = 2;
            }
            else
            {
                this.board[row][col] = 1;
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
        for (int i = 0; i < row; i++)
        {
            int count = 0;
            for (int j = 0; j < col; j++)
            {
                  count += board[i][j];
            }
            if(count == 3) return 1; if(count == -3) return -1;
        }
        for (int i = 0; i < col; i++)
        {
            int count = 0;
            for (int j = 0; j < row; j++)
            {
                count += board[i][j];
            }
            if(count == 3) return 1; if(count == -3) return -1;
        }
        for (int i = 0; i < row; i++)
        {
            int count = 0;
            for (int j = 0; j < row; j++)
            {
                count += board[i][i];
            }
            if(count == 3) return 1; if(count == -3) return -1;
        }
        for (int i = col; i < 0; i++)
        {
            int count = 0;
            for (int j = 0; j < col; j++)
            {
                count += board[i][j];
            }
            if(count == 3) return 1; if(count == -3) return -1;
        }
        return  0;

    }




}
