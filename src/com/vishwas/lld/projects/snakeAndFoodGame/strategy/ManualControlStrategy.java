package com.vishwas.lld.projects.snakeAndFoodGame.strategy;

import com.vishwas.lld.projects.snakeAndFoodGame.enums.Direction;
import com.vishwas.lld.projects.snakeAndFoodGame.service.Board;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Snake;

import java.util.Scanner;

public class ManualControlStrategy implements MoveStrategy{
    private Direction command;

    public void setDirection(Direction direction) {
        this.command = direction;
    }

    @Override
    public Direction determineDirection(Direction currentDirection) {

        if(command == Direction.UP && currentDirection == Direction.DOWN) return currentDirection;
        else if (command == Direction.DOWN && currentDirection == Direction.UP) return currentDirection;
        else if (command == Direction.LEFT && currentDirection == Direction.RIGHT) return currentDirection;
        else if (command == Direction.RIGHT && currentDirection == Direction.LEFT)return currentDirection;
        else return command;
    }

    public void handleInput(Direction input){
        this.d
    }
}
