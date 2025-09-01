package org.example;

/**
 * The Move class represents a single turn in Tic-Tac-Toe.
 * It stores the row, column, and the player's mark (X or O).
 */

public class Move {
    private int row;
    private int col;
    private Mark mark;

    public Move(int row, int col, Mark mark) {
        if (row >=0) {
            this.row = row;
        }
        if (col >=0) {
            this.col = col;
        }
        this.mark = mark;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Mark getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Move: " + row + ", " + col + ", " + mark;
    }
}
