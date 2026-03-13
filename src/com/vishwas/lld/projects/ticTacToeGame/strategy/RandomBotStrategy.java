package com.vishwas.lld.projects.ticTacToeGame.strategy;

import com.vishwas.lld.projects.ticTacToeGame.model.Board;
import com.vishwas.lld.projects.ticTacToeGame.model.Symbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomBotStrategy implements MoveStrategy{
    private final Random random = new Random();

    @Override
    public int[] determineMove(Board board, Symbol symbol) {
        System.out.println("AI is thinking");

        // 1. Find all available empty positions
        List<int[]> availableMoves = new ArrayList<>();
        int size = board.getSize();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board.isValidMove(i, j)){
                    availableMoves.add(new int[]{i, j});
                }
            }
        }
        // 2. Pick one at random
        if(!availableMoves.isEmpty()){
            int index = random.nextInt(availableMoves.size());
            return availableMoves.get(index);
        }
        return new int[]{-1, -1};
    }
}
