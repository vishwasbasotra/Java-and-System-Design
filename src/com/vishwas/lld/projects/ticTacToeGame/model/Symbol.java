package com.vishwas.lld.projects.ticTacToeGame.model;

public enum Symbol {
    X, O, EMPTY;

    @Override
    public String toString(){
        return (this == EMPTY) ?"-": name();
    }
}
