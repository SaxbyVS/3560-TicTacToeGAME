package org.example;

import java.util.Scanner;

/**
 * The ConsoleApp class:
 * Entry point for the Tic-Tac-Toe game.
 * Lets the user choose between Human vs Human or Human vs Random AI.
 * Sets up the board, players, and game, then starts the game loop.
 */
public class ConsoleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Board board = new Board();

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Choose game mode:");
        System.out.println("1. Human vs Human");
        System.out.println("2. Human vs AI");
        System.out.print("Enter choice (1 or 2): ");

        int choice = scanner.nextInt();

        Player playerX = new HumanPlayer(Mark.X);
        Player playerO;

        if (choice == 1) {
            playerO = new HumanPlayer(Mark.O);
            System.out.println("Mode selected: Human vs Human");
        } else {
            playerO = new RandomAIPlayer(Mark.O);
            System.out.println("Mode selected: Human vs AI");
        }

        Game game = new Game(board, playerX, playerO);
        game.Run();

        scanner.close();
    }
}



