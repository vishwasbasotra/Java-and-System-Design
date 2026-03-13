package com.vishwas.lld.projects.ticTacToeGame;

import com.vishwas.lld.projects.ticTacToeGame.engine.TicTacToeGame;
import com.vishwas.lld.projects.ticTacToeGame.model.Player;
import com.vishwas.lld.projects.ticTacToeGame.model.Symbol;
import com.vishwas.lld.projects.ticTacToeGame.strategy.HumanMoveStrategy;
import com.vishwas.lld.projects.ticTacToeGame.strategy.MoveStrategy;

public class Main {
    public static void main(String[] args) {
        MoveStrategy strategy = new HumanMoveStrategy();
        Player p1 = new Player(strategy, Symbol.X);
        Player p2 = new Player(strategy, Symbol.O);

        TicTacToeGame game = new TicTacToeGame(p1, p2, 3);
        game.start();
    }
}
