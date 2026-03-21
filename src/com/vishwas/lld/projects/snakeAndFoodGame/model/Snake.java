package com.vishwas.lld.projects.snakeAndFoodGame.model;

import com.vishwas.lld.projects.snakeAndFoodGame.enums.CellType;
import com.vishwas.lld.projects.snakeAndFoodGame.service.Board;

import java.util.LinkedList;

public class Snake {
    // LinkedList implements Deque - perfect for adding/removing from both ends
    private LinkedList<Cell> snakeBody;
    private Cell head;

    public Snake(Cell initPos) {
        this.snakeBody = new LinkedList<>();
        this.head = initPos;
        this.snakeBody.add(head);
        this.head.setType(CellType.SNAKE_NODE);
    }

    public void grow(Cell nextCell){
        this.head = nextCell;
        this.snakeBody.addFirst(head);
        this.head.setType(CellType.SNAKE_NODE);
    }

    public void move(Cell nextCell){
        // To move, we add a new head...
        this.head = nextCell;
        snakeBody.addFirst(head);
        head.setType(CellType.SNAKE_NODE);

        // ...and remove the tail (the last piece)
        Cell tail = snakeBody.removeLast();
        tail.setType(CellType.EMPTY);
    }

    public LinkedList<Cell> getSnakeBody() {
        return snakeBody;
    }

    public Cell getHead() {
        return head;
    }
}
