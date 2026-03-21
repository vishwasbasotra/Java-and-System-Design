package com.vishwas.lld.projects.snakeAndFoodGame.service;

import com.vishwas.lld.projects.snakeAndFoodGame.strategy.GameObserver;

public class ScoreManager implements GameObserver {
    private int score = 0;
    @Override
    public void onFoodEaten(int currentScore) {
        this.score = currentScore;
        System.out.println("★ Score Updated! Current Score: " + this.score);
    }

    @Override
    public void onGameOver(int finalScore) {
        this.score = finalScore;
        System.out.println("🏁 Final Game Statistics 🏁");
        System.out.println("Total Score: "+ this.score);
    }
}
