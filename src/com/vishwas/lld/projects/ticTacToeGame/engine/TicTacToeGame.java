package com.vishwas.lld.projects.ticTacToeGame.engine;

import com.vishwas.lld.projects.ticTacToeGame.model.Board;
import com.vishwas.lld.projects.ticTacToeGame.model.Player;
import com.vishwas.lld.projects.ticTacToeGame.model.Symbol;

public class TicTacToeGame {
    private final Player player1;
    private final Player player2;
    private final Board board;
    private Player currentPlayer;

    public TicTacToeGame(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        this.currentPlayer = player1;   // X usually starts
    }

    public void start(){
        System.out.println("Game started!");
        while(true){
            board.print();
            int[] move = currentPlayer.makeMove(board);

            // Validate the move before applying it
            if(board.isValidMove(move[0], move[1])){
                board.setMove(move[0], move[1], currentPlayer.getSymbol());

                // 1. Check for Win
                if(checkWin(currentPlayer.getSymbol())){
                    board.print();
                    System.out.println("Player "+ currentPlayer.getSymbol()+"Won!!!");
                    break;
                }

                // 2. Check for draw
                if(isDraw()){
                    board.print();
                    System.out.println("It's a draw!!!");
                    break;
                }

                // 3. Switching turn
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }else{
                System.out.println("Invalid move! That spot is taken or out of bounds.");
            }
        }

    }

    public boolean checkWin(Symbol symbol){
        int n = board.getSize();
        Symbol[][] grid = board.getGrid();

        // Checking row and columns
        for (int i = 0; i < n; i++) {
            boolean rowWin = true, colWin = true;
            for (int j = 0; j < n; j++) {
                if(grid[i][j] != symbol)  rowWin = false;
                if(grid[j][i] != symbol)   colWin = false;
            }
            if(rowWin || colWin)    return true;
        }

        // Check Diagonals
        boolean diag1 = true, diag2 = true;
        for (int i = 0; i < n; i++) {
            if(grid[i][i] != symbol) diag1 = false;
            if(grid[i][n - i - 1] != symbol) diag2 = false;
        }
        return diag1 || diag2;
    }

    public boolean isDraw(){
        for(Symbol[] row: board.getGrid()){
            for(Symbol cell: row){
                if(cell == Symbol.EMPTY)    return false;
            }
        }
        return true;
    }
}
