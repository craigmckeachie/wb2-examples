package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MenuExample {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        boolean programIsRunning = true;


        while (programIsRunning){
            System.out.print("""
                            What do you want to do?
                             1 - First Screen
                             2 - Second Screen
                             3 - Quit
                            Enter your command: """);


            int command = input.nextInt();

            switch(command){
                case 1 -> runFirstScreen();
                case 2 -> runSecondScreen();
                case 3 -> programIsRunning = true;
                default -> System.out.println("Invalid command try again.");
            }
            
//            if (command == 1){
//                runFirstScreen();
//            } else if (command == 2) {
//                runSecondScreen();
//            } else if (command== 3) {
//                programIsRunning = false;
//            }else{
//                System.out.println("Invalid command try again.");
//            }

        }

    }

    private static void runFirstScreen(){
        System.out.println("First Screen");
        System.out.println("-------------");
        System.out.println();
        System.out.println();
    }

    private static void runSecondScreen(){
        System.out.println("Second Screen");
        System.out.println("-------------");
        System.out.println();
        System.out.println();
    }


}
