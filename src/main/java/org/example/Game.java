package org.example;

/**
 * The Game class controls the flow of a Tic-Tac-Toe match.
 * It manages turns between two players, applies their moves to the board,
 * checks for winners or draws, and prints the board after each move.
 *
 * Responsibilities:
 * - Keep track of the current player.
 * - Ask players for moves and validate them through the Board.
 * - Detect when a player wins or when the game ends in a draw.
 * - Alternate turns until the game ends.
 */

public class Game {
    private Board gameBoard;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public Game(Board board, Player p1, Player p2) {
        this.gameBoard = board;
        this.player1 = p1;
        this.player2 = p2;
        this.currentPlayer = player1; // start with player1
    }

    public void Run() {
        while (true) {
            printBoard();

            // ask current player for move
            Move move = currentPlayer.nextMove(gameBoard);

            try {
                gameBoard.place(move);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid move: " + e.getMessage());
                continue; // same player tries again
            }

            // check winner
            if (gameBoard.winner() != Mark.EMPTY) {
                printBoard();
                System.out.println("Player " + currentPlayer.getMark() + " wins!");
                break;
            }

            // check draw
            if (gameBoard.isFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }

            // swap players
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    private void printBoard() {
        System.out.println();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                Mark cell = gameBoard.getCell(r, c);
                System.out.print((cell == Mark.EMPTY ? "-" : cell) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

