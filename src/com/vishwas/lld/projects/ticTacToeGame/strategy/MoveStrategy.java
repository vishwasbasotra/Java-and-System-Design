package com.vishwas.lld.projects.ticTacToeGame.strategy;

import com.vishwas.lld.projects.ticTacToeGame.model.Board;
import com.vishwas.lld.projects.ticTacToeGame.model.Symbol;

public interface MoveStrategy {
    int[] determineMove(Board board, Symbol symbol);
}
