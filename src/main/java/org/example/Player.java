package org.example;

public abstract class Player {
    protected final Mark mark;

    protected Player(Mark mark) {
        this.mark = mark;
    }

    public abstract Move nextMove(Board board);
}
