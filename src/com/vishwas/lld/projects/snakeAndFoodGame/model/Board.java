package com.vishwas.lld.projects.snakeAndFoodGame.model;

import java.io.Serial;
import java.io.Serializable;

public class Board implements Serializable, Cloneable {
    private static Board board = null;
    private static int[][] size;
    private int score = 0;

    public Board(int n) {
        if(board != null){
            throw new IllegalArgumentException("Create object using the setter method");
        }else {
            size = new int[n][n];
        }
    }

    public static Board setSize() {
        if(board == null){
            synchronized (Board.class){
                board = new Board(10);
            }
        }
        return board;
    }

    @Serial
    public Object readResolve(){
        return board;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return board;
    }

    public int[][] getSize() {
        return size;
    }

    public boolean isValidMove(char move) {
        return true;
    }

    public int scoreManager(){
        score = score + 1;
        return score;
    }
}
