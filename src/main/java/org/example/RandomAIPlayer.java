package org.example;

/**
 * RandomAIPlayer is a computer-controlled player.
 * It scans the board for empty cells and selects
 * a random valid move using its mark (X or O).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomAIPlayer extends Player {
    private final Random rand = new Random();

    public RandomAIPlayer(Mark mark) {
        super(mark);
    }

    @Override
    public Move nextMove(Board board) {
        List<Move> possibleMoves = new ArrayList<>();

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board.getCell(r, c) == Mark.EMPTY) {
                    possibleMoves.add(new Move(r, c, mark));
                }
            }
        }

        return possibleMoves.get(rand.nextInt(possibleMoves.size()));
    }
}
