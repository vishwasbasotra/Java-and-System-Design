package com.vishwas.lld.projects.snakeAndFoodGame.model;

import com.vishwas.lld.projects.snakeAndFoodGame.enums.CellType;

public class Cell {
    private int row, col;
    private CellType type;

    public Cell(int row, int col, CellType type) {
        this.row = row;
        this.col = col;
        this.type = CellType.EMPTY;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public CellType getType() {
        return type;
    }

    public void setType(CellType type) {
        this.type = type;
    }
}
