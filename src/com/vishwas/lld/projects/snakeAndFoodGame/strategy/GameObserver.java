package com.vishwas.lld.projects.snakeAndFoodGame.strategy;

public interface GameObserver {
    // This method is called whenever something important happens
    void onFoodEaten(int currentScore);
    void onGameOver(int finalScore);
}
