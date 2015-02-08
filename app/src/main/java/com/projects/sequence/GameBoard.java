package com.projects.sequence;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by steve on 1/31/15.
 */
public class GameBoard
{
    private GameBoardSquare[][] _gameboard;

    public GameBoard()
    {
        _gameboard = new GameBoardSquare[10][10];

        Random ran = new Random();
        for (int i = 0; i < 10; i++)
        {
            for(int j=0;j<10;j++)
            {
                int randomColor;
                if(ran.nextInt(2) == 1)
                {
                    randomColor = Color.parseColor("Blue");
                }
                else
                {
                    randomColor = Color.parseColor("Red");
                }

                _gameboard[i][j] = new GameBoardSquare(randomColor);
            }
        }
    }

    public GameBoardSquare GetGameBoardSquare(int x, int y)
    {
        return _gameboard[x][y];
    }
}
