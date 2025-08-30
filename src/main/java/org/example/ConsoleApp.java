package org.example;
/**
 * The ConsoleApp class:
 * Entry point for the Tic-Tac-Toe game.
 * Sets up the board, players, and game, then starts the game loop.
 * Currently runs Human (X) vs Random AI (O).
 */

public class ConsoleApp {
    public static void main(String[] args) {
        // Create board
        Board board = new Board();

        // Human vs Human
        Player playerX = new HumanPlayer(Mark.X);
        Player playerO = new RandomAIPlayer(Mark.O);

        // Create and run the game
        Game game = new Game(board, playerX, playerO);
        game.Run();
    }
}


