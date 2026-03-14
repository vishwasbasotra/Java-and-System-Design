package com.vishwas.lld.projects.snakeAndFoodGame.strategy;

import com.vishwas.lld.projects.snakeAndFoodGame.model.Board;

public interface MoveStrategy {
    char determineMove(Board board);
}
