package org.example;

import java.util.Optional;

public class Board {
    private final int size =3;
    private final Mark[][] grid;

    public Board(){
        this.grid = new Mark[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                this.grid[i][j] = Mark.EMPTY;
            }
        }
    }

    public void winner(){

    }
    public boolean isFull(){
        return false;
    }
    public Mark getCell(int row, int col){
        return grid[row][col];
    }
    public void reset(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                this.grid[i][j] = Mark.EMPTY;
            }
        }
    }
    public void place(Move mv){

    }

}
