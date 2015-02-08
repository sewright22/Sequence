package com.projects.sequence;

import android.graphics.Color;

/**
 * Created by steve on 1/31/15.
 */
public class GameBoardSquare
{
    private Card _card;
    private int _color;

    public GameBoardSquare(){}
    public GameBoardSquare(int color)
    {
        _color = color;
    }

    public int GetColor()
    {
        return _color;
    }
}
