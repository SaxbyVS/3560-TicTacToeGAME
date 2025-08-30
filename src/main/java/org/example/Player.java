package org.example;

/**
 * Abstract Player class for Tic-Tac-Toe.
 * Stores the player's mark (X or O) and
 * defines the nextMove() method to be
 * implemented by HumanPlayer or AI players.
 */

public abstract class Player {
    protected final Mark mark;

    protected Player(Mark mark) {
        this.mark = mark;
    }

    public Mark getMark() {
        return mark;
    }

    public abstract Move nextMove(Board board);
}

