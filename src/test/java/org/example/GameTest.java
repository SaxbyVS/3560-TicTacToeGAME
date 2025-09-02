package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.*;


public class GameTest {

    @Test
    void emptyBoard(){
        Board board = new Board();
        assertEquals(board.winner(), Mark.EMPTY);
    }

    @Test
    void rowWin(){
        Board board = new Board();
        for(int i=0; i<3; i++) {
            board.place(new Move(i, 0, Mark.X));
            board.place(new Move(i, 1, Mark.X));
            board.place(new Move(i, 2, Mark.X));
            assertEquals(board.winner(), Mark.X);
            board.reset();
        }
    }

    @Test
    void colWin(){
        Board board = new Board();
        for (int i=0; i<3; i++) {
            board.place(new Move(0, i, Mark.X));
            board.place(new Move(1, i, Mark.X));
            board.place(new Move(2, i, Mark.X));
            assertEquals(board.winner(), Mark.X);
            board.reset();
        }
    }

    @Test
    void diagWin(){
        Board board = new Board();
        board.place(new Move(0, 0, Mark.O));
        board.place(new Move(1, 1, Mark.O));
        board.place(new Move(2, 2, Mark.O));
        assertEquals(board.winner(), Mark.O);
    }

    @Test
    void noWin(){
        Board board = new Board();
        board.place(new Move(0, 0, Mark.O));
        board.place(new Move(1, 1, Mark.X));
        assertEquals(board.winner(), Mark.EMPTY);
    }

    @Test
    void drawnGame(){
        Board board = new Board();
        board.place(new Move(0, 0, Mark.O));
        board.place(new Move (0,1, Mark.O));
        board.place(new Move(1, 1, Mark.X));
        board.place(new Move(0,2, Mark.X));
        board.place(new Move(1,0, Mark.X));
        board.place(new Move(1,2, Mark.O));
        board.place(new Move(2,0, Mark.O));
        board.place(new Move(2,1, Mark.O));
        board.place(new Move(2,2, Mark.X));
        assertTrue(board.isFull());
    }

    @Test
    void invalidMove(){
        Board board = new Board();
        board.place(new Move(0, 0, Mark.O));

        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> board.place(new Move(0,0, Mark.X)));
    }
}
