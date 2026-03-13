package com.vishwas.lld.projects.ticTacToeGame.model;

public class Board {
    private final int size;
    private final Symbol[][] grid;

    public Board(int size, Symbol[][] grid) {
        this.size = size;
        this.grid = new Symbol[size][size];
        // Initialize the board with EMPTY symbols
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    /**
     * Checks if a move is within bounds and the cell is not already taken.
     */
    public boolean isValidMove(int r, int c){
        return (r > 0 && r < this.size && c > 0 && c < this.size && this.grid[r][c] == Symbol.EMPTY);
    }

    public void setMove(int r, int c, Symbol symbol){
        this.grid[r][c] = symbol;
    }

    public int getSize() {
        return this.size;
    }

    public Symbol[][] getGrid() {
        return this.grid;
    }

    public void print(){
        for (Symbol[] row: grid) {
            for( Symbol cell: row){
                System.out.println(cell+" ");
            }
            System.out.println();
        }
    }
}
