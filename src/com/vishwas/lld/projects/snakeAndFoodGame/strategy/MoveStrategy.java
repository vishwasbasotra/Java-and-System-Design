package com.vishwas.lld.projects.snakeAndFoodGame.strategy;

import com.vishwas.lld.projects.snakeAndFoodGame.service.Board;

public interface MoveStrategy {
    char getNextDirection(Board board);
}
