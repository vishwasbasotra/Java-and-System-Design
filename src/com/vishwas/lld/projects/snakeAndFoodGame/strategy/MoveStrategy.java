package com.vishwas.lld.projects.snakeAndFoodGame.strategy;

import com.vishwas.lld.projects.snakeAndFoodGame.enums.Direction;
import com.vishwas.lld.projects.snakeAndFoodGame.service.Board;

public interface MoveStrategy {
    Direction determineDirection(Direction currentDirection);
}
