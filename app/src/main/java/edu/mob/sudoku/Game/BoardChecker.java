package edu.mob.sudoku.Game;

public class BoardChecker {
    private static final int SIZE = 9;

    public static boolean isNumberInRow(int[][] board, int number, int row) {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == number) {
                count = count + 1;
            }
        }
        if(count > 1){
            return true;
        }
        return false;
    }

    public static boolean isNumberInColumn(int[][] board, int number, int column) {
        int count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][column] == number) {
                count = count + 1;
            }
        }
        if(count > 1){
            return true;
        }
        return false;
    }

    public static boolean isNumberInSquare(int[][] board, int number, int column, int row) {
        //chcemy się dostać do początku kwadratu 3x3, w którym znajduje się wpisywana przez nas liczba
        int localRow = row - row % 3;
        int localColumn = column - column % 3;
        int count = 0;


        for (int i = localRow; i < localRow + 3; i++) {
            for(int j = localColumn; j<localColumn + 3; j++){
                if (board[i][j] == number) {
                    count = count + 1;
                }
            }
        }

        if(count > 1){
            return true;
        }
        return false;
    }

    public static boolean isCorrectPlace(int[][] board, int row, int colum){
//        for(int i = 0; i < SIZE; i++){
//            System.out.println(board[i][0]+ " " + board[i][1] + " "+ board[i][2]+" | "+
//                    board[i][3]+ " "+ board[i][4]+" "+ board[i][5]+ " | "+
//                    board[i][6]+ " "+ board[i][7]+ " "+ board[i][8]);
//            if(i == 2 || i == 5 || i == 8){
//                System.out.println("---------------------");
//            }
//        }
        return !isNumberInColumn(board,board[row][colum],colum) &&
                !isNumberInRow(board,board[row][colum],row) &&
                !isNumberInSquare(board,board[row][colum],colum,row);

    }

    public static boolean isGameOver(int[][] board){
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j< SIZE; j++){
                if(!isCorrectPlace(board, i, j)){
                    return false;
                }
            }
        }
        return true;

    }


}

