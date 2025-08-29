package org.example;

public class Game {
    private Board gameBoard;
    private Player player1;
    private Player player2;

    public Game(Board board, Player p1, Player p2) {
        this.gameBoard = board;
        this.player1 = p1;
        this.player2 = p2;
    }

    //ask current player for move (start  w/ p1?). apply move on board (place(move)). check winner() or draw. swap player.
    public void Run(){};
}
