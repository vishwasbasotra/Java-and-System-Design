package com.vishwas.lld.projects.snakeAndFoodGame.service;

import com.vishwas.lld.projects.snakeAndFoodGame.enums.*;
import com.vishwas.lld.projects.snakeAndFoodGame.model.*;
import com.vishwas.lld.projects.snakeAndFoodGame.strategy.*;

import java.util.ArrayList;
import java.util.List;

public class SnakeFoodGame {
    private Board board;
    private Snake snake;
    private  MoveStrategy strategy;
    private Direction currentDirection;
    private boolean gameOver;
    private List<GameObserver> observerList = new ArrayList<>();
    private int score = 0;

    public SnakeFoodGame(Board board, Snake snake, MoveStrategy strategy) {
        this.board = board;
        this.snake = snake;
        this.strategy = strategy;
        this.currentDirection = Direction.RIGHT;    // Starting direction
        this.gameOver = false;
    }

    public void addObserver(GameObserver observer){
        observerList.add(observer);
    }

    public void notifyFoodEaten(){
        for(GameObserver observer: observerList){
            this.score += 10;
            observer.onFoodEaten(this.score);
        }
    }

    public void notifyGameOver(){
        for(GameObserver observer: observerList){
            observer.onGameOver(this.score);
        }
    }

    // This is the heartbeat of your game
    public void update(){
        if(gameOver)    return;

        Cell nextCell = getNextCell();

        // Collision Check
        if(isCollision(nextCell)){
            gameOver = true;
            notifyGameOver();   // Notification 1
        } else if (nextCell.getType() == CellType.FOOD) {
            snake.grow(nextCell);
            board.generateFood();
            notifyFoodEaten();  // Notification 2
        }else {
            snake.move(nextCell);
        }
    }

    private boolean isCollision(Cell next){
        return  next == null || next.getType().equals(CellType.SNAKE_NODE);
    }

    private Cell getNextCell() {
        // Calculate next row/col based on 'direction'
        // Return null if out of bounds
        int r = snake.getHead().getRow();
        int c = snake.getHead().getCol();

        if(currentDirection == Direction.RIGHT){
            c += 1;
        }
        else if((currentDirection == Direction.LEFT)){
            c -= 1;
        }else if((currentDirection == Direction.UP)){
            r -= 1;
        }
        else if((currentDirection == Direction.DOWN)){
            r += 1;
        }

        if(r == 0 || r == board.getROW_COUNT()-1 || c == 0 || c == board.getCOL_COUNT()-1)  return null;
        else return Board.getBoard().getCell(r, c);
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setCurrentDirection(Direction requestedDirection) {
        // Use strategy to validate the turn\
        this.currentDirection = strategy.determineDirection(this.currentDirection, requestedDirection);
    }
}
