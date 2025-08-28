package org.example;

public class HumanPlayer extends Player{

    public HumanPlayer(Mark mk){
        super(mk);
    }
    public Move nextMove(Board board){ //placeholder: read doc
        Move mv = new Move(0,0, Mark.X);
        return mv;
    }
}
