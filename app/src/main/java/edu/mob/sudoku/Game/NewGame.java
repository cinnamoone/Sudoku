package edu.mob.sudoku.Game;

import java.util.Scanner;

public class NewGame {
    Scanner scan = new Scanner(System.in);

    String easy = "280304150700005000094018000000081703040750006873006010000060405600540800400800691";
    String hard = "040100083005000009000290100000306200900807300300500076050083600030651007001000538";
    String medium = "905318000800020000060000080070980140100650007003100050704801520608037000200000060";


    public String choiceLevel(int choice){
//        System.out.println("Choose a difficulty level");
//        System.out.println("1 - easy");
//        System.out.println("2 - medium");
//        System.out.println("3 - hard");
//        Integer choice  = Integer.valueOf(scan.nextLine());

        if(choice == 1){
            return easy;
        } else if (choice == 2) {
            return medium;
        }else{
            return hard;
        }
    }
    public void play(int choice1){

        String choice = choiceLevel(choice1);
        Board board = new Board(choice);
        board.showBoard();

        while(board.isEmpty() == true){
            System.out.println("Where do you want to enter the number?");

            System.out.println("Give row");
            Integer row  = Integer.valueOf(scan.nextLine());

            System.out.println("Give column");
            Integer column  = Integer.valueOf(scan.nextLine());

            System.out.println("Give number");
            Integer number  = Integer.valueOf(scan.nextLine());

            board.enterNumber(row,column,number);

            board.showBoard();
        }

        System.out.println("The end! Excelent!");
    }
}

