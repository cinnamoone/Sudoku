package edu.mob.sudoku.Game;

public class Board {
    private final int size = 9;
    private int[][] board = new int[size][size];

    public Board(String numbers) {

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                int n = j + (9*i);
                this.board[i][j] = Integer.parseInt(String.valueOf(numbers.charAt(n)));
            }
        }
    }


    public void showBoard(){
        for(int i = 0; i < this.size; i++){
            System.out.println(this.board[i][0]+ " " + this.board[i][1] + " "+ this.board[i][2]+" | "+
                    this.board[i][3]+ " "+ this.board[i][4]+" "+ this.board[i][5]+ " | "+
                    this.board[i][6]+ " "+ this.board[i][7]+ " "+ this.board[i][8]);
            if(i == 2 || i == 5 || i == 8){
                System.out.println("---------------------");
            }
        }
    }

    public boolean isNumberInRow(int number, int row) {
        for (int i = 0; i < this.size; i++) {
            if (this.board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumberInColumn(int number, int column) {
        for (int i = 0; i < this.size; i++) {
            if (this.board[i][column] == number) {
                return true;
            }
        }
        return false;
    }

    public boolean isNumberInSquare(int number, int column, int row) {
        //chcemy się dostać do początku kwadratu 3x3, w którym znajduje się wpisywana przez nas liczba
        int localRow = row - row % 3;
        int localColumn = column - column % 3;


        for (int i = localRow; i < localRow + 3; i++) {
            for(int j = localColumn; j<localColumn + 3; j++){
                if (this.board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWrongPlace(int number, int row, int colum){
        return !isNumberInColumn(number,colum) &&
                !isNumberInRow(number,row) &&
                !isNumberInSquare(number,colum,row);
    }

    public void enterNumber(int row, int column, int number){
        if(isWrongPlace(number,row, column) && this.board[row][column] == 0){
            this.board[row][column] = number;
            System.out.println("Add number");
        }else{
            System.out.println("Mistake");
        }
    }

    public boolean isEmpty(){
        for (int i = 0; i < 9; i++) {
            for(int j = 0; j<9; j++){
                if (this.board[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }


}

