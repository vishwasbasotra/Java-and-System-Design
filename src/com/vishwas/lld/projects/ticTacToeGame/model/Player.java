package com.vishwas.lld.projects.ticTacToeGame.model;

import com.vishwas.lld.projects.ticTacToeGame.strategy.MoveStrategy;

/**
 * The Player class doesn't know HOW it moves; it only knows its Symbol.
 * It "delegates" the movement logic to a Strategy.
 */

public class Player {
    private final MoveStrategy strategy;
    private final Symbol symbol;

    public Player(MoveStrategy strategy, Symbol symbol) {
        this.strategy = strategy;
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    /**
     * This is the "Strategy Pattern" in action.
     * The player just asks the strategy: "Where should I go?"
     */
    public int[] makeMove(Board board){
        return strategy.determineMove(board, this.symbol);
    }
}
