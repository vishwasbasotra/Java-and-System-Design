package com.vishwas.lld.projects.snakeAndFoodGame.strategy;

import com.vishwas.lld.projects.snakeAndFoodGame.service.Board;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Food;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Snake;

import java.util.Scanner;

public class ManualControlStrategy implements MoveStrategy{
    private Snake snake;
    private Food food;
    private Scanner sc = new Scanner(System.in);
    private char move;

    @Override
    public char getNextDirection(Board board) {
        System.out.print("Enter your move: ");
        move = sc.next().charAt(0);
        return move;
    }
}
