package com.vishwas.lld.projects.snakeAndFoodGame.model;

import java.util.*;

public class Snake {
    private Board board;
    private Deque<int[]> snakeBody;
    private List<int[]> bodyPosition;

    public Snake(Board board, Deque<Integer> snakeBody, List<int[]> bodyPosition) {
        this.board = board;
        this.bodyPosition = new ArrayList<>(Arrays.asList(new int[]{2, 3}, new int[]{2, 4}, new int[]{2, 5}));
        for(int[] pos: bodyPosition){
            this.snakeBody.add(pos);
        }
    }
}
