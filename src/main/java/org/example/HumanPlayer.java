package org.example;

import java.util.Scanner;

/**
 * HumanPlayer represents a player controlled by keyboard input.
 * It prompts the user to choose a cell (1–9), validates the choice,
 * and returns a Move with the player’s mark.
 */
public class HumanPlayer extends Player {

    public HumanPlayer(Mark mk) {
        super(mk);
    }

    @Override
    public Move nextMove(Board board) {
        Scanner scanner = new Scanner(System.in);

        int row, col;
        while (true) {
            System.out.print("Player " + this.getMark() + ", enter a move [1-9]: ");
            int userInput = scanner.nextInt();

            if (userInput < 1 || userInput > 9) {
                System.out.println("Invalid move. Enter a number between 1 and 9.");
                continue;
            }

            int index = userInput - 1;
            row = index / 3;
            col = index % 3;

            if (board.getCell(row, col) == Mark.EMPTY) {
                break; // valid move
            } else {
                System.out.println("That square is already full. Try again!");
            }
        }

        return new Move(row, col, this.mark);
    }
}

