package org.example;


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

    public Mark winner(){ //returns mark of winner or empty mark if no winner
        //check rows
        for (int i = 0; i<3; i++){
            if (grid[i][0] != Mark.EMPTY && grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2]){
                return grid[i][0];
            }
        }
        //check cols
        for (int i = 0; i<3; i++){
            if(grid[0][i] != Mark.EMPTY && grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i]){
                return grid[0][i];
            }
        }
        //check diags
        if (grid[0][0] != Mark.EMPTY && grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]){
            return grid[0][0];
        }
        if (grid[0][2] != Mark.EMPTY && grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0]){
            return grid[0][2];
        }

        return Mark.EMPTY;
    }
    public boolean isFull(){ //check if grid is full (draw)
        for (int i = 0; i<size; i++){
            for (int j = 0; j < size; j++){
                if (grid[i][j] == Mark.EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
    public Mark getCell(int row, int col){
        return grid[row][col];
    }
    public void reset(){ //sets all cells to empty mark
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                this.grid[i][j] = Mark.EMPTY;
            }
        }
    }
    public void place(Move mv){
        //validate mv w/ IllegalArgumentException?

        this.grid[mv.getRow()][mv.getCol()] = mv.getMark();
    }

}
