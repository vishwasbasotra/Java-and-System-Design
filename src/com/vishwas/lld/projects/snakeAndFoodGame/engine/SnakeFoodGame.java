package com.vishwas.lld.projects.snakeAndFoodGame.engine;

import com.vishwas.lld.projects.snakeAndFoodGame.model.Board;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Snake;
import com.vishwas.lld.projects.snakeAndFoodGame.strategy.MoveStrategy;

public class SnakeFoodGame {
    private Board board;
    private Snake snake;
    private MoveStrategy strategy;

    public SnakeFoodGame(Board board, Snake snake, MoveStrategy strategy) {
        this.board = board;
        this.snake = snake;
        this.strategy = strategy;
    }

    public void play(){
        System.out.println("Let's start the game");
        while(true){
            char move = strategy.determineMove(board);
            if(board.isValidMove(move)){

            }
        }
    }
}
