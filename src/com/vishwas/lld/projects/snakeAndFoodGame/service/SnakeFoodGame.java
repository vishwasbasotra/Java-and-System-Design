package com.vishwas.lld.projects.snakeAndFoodGame.service;

import com.vishwas.lld.projects.snakeAndFoodGame.enums.CellType;
import com.vishwas.lld.projects.snakeAndFoodGame.enums.Direction;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Cell;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Snake;
import com.vishwas.lld.projects.snakeAndFoodGame.strategy.MoveStrategy;

public class SnakeFoodGame {
    private Board board;
    private Snake snake;
    private Direction direction;
    private boolean gameOver;

    public SnakeFoodGame(Board board, Snake snake) {
        this.board = board;
        this.snake = snake;
        this.direction = Direction.RIGHT;
    }

    public void update(){
        if(gameOver)    return;

        Cell nextCell = getNextCell(snake.getHead());

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

    private Cell getNextCell(Cell currentHead) {
        // Calculate next row/col based on 'direction'
        // Return null if out of bounds
        int r = currentHead.getRow();
        int c = currentHead.getCol();
        if(r == 0 || r == board.getROW_COUNT()-1 || c == 0 || c == board.getCOL_COUNT()-1)  return null;

        if(direction == Direction.RIGHT){
            c += 1;
        }
        else if((direction == Direction.LEFT)){
            c -= 1;
        }else if((direction == Direction.UP)){
            r -= 1;
        }
        else if((direction == Direction.DOWN)){
            r += 1;
        }

        return Board.getBoard().getCell(r, c);
    }
}
