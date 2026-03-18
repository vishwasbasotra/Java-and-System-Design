package com.vishwas.lld.projects.snakeAndFoodGame.service;

import com.vishwas.lld.projects.snakeAndFoodGame.enums.CellType;
import com.vishwas.lld.projects.snakeAndFoodGame.model.Cell;

import java.io.Serial;
import java.io.Serializable;


/**
 * Singleton Pattern: We only want ONE board for the entire game session.
 */
public class Board implements Serializable, Cloneable {
    private final int ROW_COUNT, COL_COUNT;
    private Cell[][] cells;
    private static Board board = null;

    private Board(int row, int col) {
        if(board != null){
            throw new IllegalArgumentException("Create object using the setter method");
        }else {
            this.ROW_COUNT = row;
            this.COL_COUNT = col;
            cells = new Cell[ROW_COUNT][COL_COUNT];

            for (int i = 0; i < ROW_COUNT; i++) {
                for (int j = 0; j < COL_COUNT; j++) {
                    cells[i][j] = new Cell(i, j);
                }
            }
        }
    }

    public static Board setSize() {
        if(board == null){
            synchronized (Board.class){
                board = new Board(10);
            }
        }
        return board;
    }

    @Serial
    public Object readResolve(){
        return board;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return board;
    }

    public static Board getBoard() {
        return board;
    }

    public void generateFood(int r, int c) {
        // Logic to pick a random Cell and set its type to CellType.FOOD
        // Hint: Use a while loop to ensure you don't place food ON the snake
        int row, col;
        do {
            row = (int)(Math.random() * ROW_COUNT);
            col = (int)(Math.random() * COL_COUNT);
        } while ( !cells[row][col].getType().equals(CellType.SNAKE_NODE));
        cells[row][col].setType(CellType.FOOD);
    }

    public Cell getCell(int r, int c){
        // Validation to prevent ArrayIndexOutOfBounds
        if (r < ROW_COUNT && r >= 0 && c < COL_COUNT && c >= 0){
            return cells[r][c];
        }
        return null;
    }
}
