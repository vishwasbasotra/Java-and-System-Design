package com.vishwas.lld.projects.ticTacToeGame;

import com.vishwas.lld.projects.ticTacToeGame.engine.TicTacToeGame;
import com.vishwas.lld.projects.ticTacToeGame.model.Player;
import com.vishwas.lld.projects.ticTacToeGame.model.Symbol;
import com.vishwas.lld.projects.ticTacToeGame.strategy.HumanMoveStrategy;
import com.vishwas.lld.projects.ticTacToeGame.strategy.MoveStrategy;
import com.vishwas.lld.projects.ticTacToeGame.strategy.RandomBotStrategy;

public class Main {
    public static void main(String[] args) {
        // Player 1 is a Human
        Player p1 = new Player(new HumanMoveStrategy(), Symbol.X);

//        // Player 2 is a Human
//        Player p2 = new Player(new HumanMoveStrategy(), Symbol.O);

        // Player 2 is AI Bot
        Player p2 = new Player(new RandomBotStrategy(), Symbol.O);

        TicTacToeGame game = new TicTacToeGame(p1, p2, 3);
        game.start();
    }
}
