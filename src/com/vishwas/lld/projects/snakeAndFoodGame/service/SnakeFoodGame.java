package com.vishwas.lld.projects.snakeAndFoodGame.service;

import com.vishwas.lld.projects.snakeAndFoodGame.enums.CellType;
import com.vishwas.lld.projects.snakeAndFoodGame.enums.Direction;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Cell;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Snake;
import com.vishwas.lld.projects.snakeAndFoodGame.strategy.MoveStrategy;

public class SnakeFoodGame {
    private Board board;
    private Snake snake;
    private  MoveStrategy strategy;
    private Direction currentDirection;
    private boolean gameOver;

    public SnakeFoodGame(Board board, Snake snake, MoveStrategy strategy) {
        this.board = board;
        this.snake = snake;
        this.strategy = strategy;
        this.currentDirection = Direction.RIGHT;    // Starting direction
        this.gameOver = false;
    }

    // This is the heartbeat of your game
    public void update(){
        if(gameOver)    return;

        Cell nextCell = getNextCell();

        // Collision Check
        if(isCollision(nextCell)){
            gameOver = true;
        } else if (nextCell.getType() == CellType.FOOD) {
            snake.grow(nextCell);
            board.generateFood();
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
