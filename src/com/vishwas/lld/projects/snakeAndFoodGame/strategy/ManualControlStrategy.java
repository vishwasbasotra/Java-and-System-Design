package com.vishwas.lld.projects.snakeAndFoodGame.strategy;

import com.vishwas.lld.projects.snakeAndFoodGame.model.Board;

import java.util.Scanner;

public class ManualControlStrategy implements MoveStrategy{
    private Scanner sc = new Scanner(System.in);
    private char move;
    @Override
    public char determineMove(Board board) {
        System.out.print("Enter your move: ");
        move = sc.next().charAt(0);
        return move;
    }
}
