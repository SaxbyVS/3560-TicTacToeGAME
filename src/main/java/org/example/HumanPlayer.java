package org.example;
import java.util.Scanner;

/**
 * HumanPlayer represents a player controlled by keyboard input.
 * It prompts the user to choose a cell (1–9), validates the choice,
 * and returns a Move with the player’s mark.
 */

public class HumanPlayer extends Player{

    public HumanPlayer(Mark mk){
        super(mk);
    }

    public Move nextMove(Board board){ //get valid move from player
        Scanner scanner = new Scanner(System.in);

        int row, col;
        System.out.println("\n-------------\n| 1 | 2 | 3 |\n| 4 | 5 | 6 |\n| 7 | 8 | 9 |\n-------------");
        while (true) {
            System.out.println("Please enter a move [1-9]: ");
            int userInput = scanner.nextInt();
            if (userInput < 1 || userInput > 9) {
                System.out.println("Invalid move");
                continue;
            }
            int index = userInput - 1;
            row = index / 3;
            col = index % 3;

            if (board.getCell(row, col)==Mark.EMPTY) {
                break;
            }else{
                System.out.println("That square is already full. Please pick again!");
            }
        }

        Move mv = new Move(row, col, this.mark);
        return mv;

    }
}
