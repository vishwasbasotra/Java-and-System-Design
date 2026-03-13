package com.vishwas.lld.projects.ticTacToeGame.strategy;

import com.vishwas.lld.projects.ticTacToeGame.model.Board;
import com.vishwas.lld.projects.ticTacToeGame.model.Symbol;

/**
 * An interface allows us to swap between a Human player and an AI player
 * without changing any code in the Engine.
 */
public interface MoveStrategy {
    int[] determineMove(Board board, Symbol symbol);
}
