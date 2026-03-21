package com.vishwas.lld.projects.snakeAndFoodGame;

import com.vishwas.lld.projects.snakeAndFoodGame.model.*;
import com.vishwas.lld.projects.snakeAndFoodGame.service.*;
import com.vishwas.lld.projects.snakeAndFoodGame.strategy.*;
import com.vishwas.lld.projects.snakeAndFoodGame.enums.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Initialize the Singleton Board
        Board board = Board.getInstance(14,12);

        // 2. Initialize Snake at a starting position
        Snake snake = new Snake(board.getCell(5,4));

        // 3. Initialize the Game Engine
        MoveStrategy strategy = new ManualControlStrategy();
        SnakeFoodGame game = new SnakeFoodGame(board, snake, strategy);
        // Now, every time update() finds food, the ScoreManager will automatically print!
        game.addObserver(new ScoreManager());   // Register the observer

        // 4. Spawn the first food
        board.generateFood();

        Scanner sc = new Scanner(System.in);
        System.out.println("Game started! use W (Up), S (Down), A (Left), D (Right). Type 'Q' to Quit.");


        // 5. The Game Loop
        while(!game.isGameOver()){
            renderBoard(board); // Show the board

            // In a real GUI, this would be an Event Listener.
            // For console, we'll ask for input or move automatically.
            System.out.print("Next Move: ");
            String input = sc.next().toUpperCase();

            if (input.equals("Q")) break;

            switch (input){
                case "W" -> game.setCurrentDirection(Direction.UP);
                case "S" -> game.setCurrentDirection(Direction.DOWN);
                case "A" -> game.setCurrentDirection(Direction.LEFT);
                case "D" -> game.setCurrentDirection(Direction.RIGHT);
            }
            game.update();  //Move the snake;
            System.out.println("\n----------------------------\n");
        }
        System.out.println("Thanks for playing!");
    }
    /**
     * Simple Console Renderer
     */
    private static void renderBoard(Board board){
        for (int i = 0; i < board.getROW_COUNT(); i++) {
            for (int j = 0; j < board.getCOL_COUNT(); j++) {
                Cell c = board.getCell(i, j);
                if(c.getType() == CellType.SNAKE_NODE) System.out.print("S");
                else if (c.getType() == CellType.FOOD) System.out.print("F");
                else System.out.print(". ");
            }
            System.out.println();
        }
    }
}
