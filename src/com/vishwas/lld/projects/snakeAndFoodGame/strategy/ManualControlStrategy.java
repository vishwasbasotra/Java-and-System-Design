package com.vishwas.lld.projects.snakeAndFoodGame.strategy;

import com.vishwas.lld.projects.snakeAndFoodGame.enums.Direction;
import com.vishwas.lld.projects.snakeAndFoodGame.service.Board;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Snake;

import java.util.Scanner;

public class ManualControlStrategy implements MoveStrategy{

    @Override
    public Direction determineDirection(Direction currentDirection, Direction requestedDirection) {

        if(requestedDirection == Direction.UP && currentDirection == Direction.DOWN) return currentDirection;
        else if (requestedDirection == Direction.DOWN && currentDirection == Direction.UP) return currentDirection;
        else if (requestedDirection == Direction.LEFT && currentDirection == Direction.RIGHT) return currentDirection;
        else if (requestedDirection == Direction.RIGHT && currentDirection == Direction.LEFT)return currentDirection;
        else return requestedDirection;
    }
}
