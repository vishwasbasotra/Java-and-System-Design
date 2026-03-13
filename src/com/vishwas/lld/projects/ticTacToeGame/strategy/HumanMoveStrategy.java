package com.vishwas.lld.projects.ticTacToeGame.strategy;

import com.vishwas.lld.projects.ticTacToeGame.model.Board;
import com.vishwas.lld.projects.ticTacToeGame.model.Symbol;

import java.util.Scanner;

public class HumanMoveStrategy implements MoveStrategy{
    private final Scanner sc = new Scanner(System.in);

    @Override
    public int[] determineMove(Board board, Symbol symbol) {
        System.out.println("Player "+ symbol);
        System.out.print("Enter row value from (0 0 to 2 2): ");
        int r = sc.nextInt();
        System.out.print("Enter col value from (0 0 to 2 2): ");
        int c = sc.nextInt();
        return new int[]{r, c};
    }
}
