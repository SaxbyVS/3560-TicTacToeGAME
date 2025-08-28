package org.example;

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
}
