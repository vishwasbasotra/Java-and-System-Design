package com.vishwas.lld.projects.ticTacToeGame.model;

/**
 * Enum representing the possible states of a board cell.
 * Using an Enum is better than strings/ints because it prevents invalid values.
 */
public enum Symbol {
    X, O, EMPTY;

    @Override
    public String toString(){
        return (this == EMPTY) ?"-": name();
    }
}
