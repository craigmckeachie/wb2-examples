package com.pluralsight;

import java.util.Scanner;

public class ScreenExample {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        runMainScreen();

    }

    private static void runMainScreen() {
        boolean programIsRunning = true;


        while (programIsRunning){
            System.out.print("""
                            What do you want to do?
                             1 - First Screen
                             2 - Second Screen
                             3 - Quit
                            Enter your command: """);


            int command = input.nextInt();
            input.nextLine();

            switch(command){
                case 1 -> runFirstScreen();
                case 2 -> runSecondScreen();
                case 3 -> programIsRunning = false;
                default -> System.out.println("Invalid command try again.");
            }

        }
    }

    private static void runFirstScreen(){
        boolean firstScreenIsRunning = true;

        while(firstScreenIsRunning) {

            System.out.println("First Screen");
            System.out.println("-------------");
            System.out.println();
            System.out.println();

            System.out.println("Click (a) to do action");
            System.out.println("Click (r) to return to main menu");
            System.out.print("Choose an option: ");
            String choice = input.nextLine().trim().toLowerCase();

            switch(choice){
                case "r"-> firstScreenIsRunning = false;
            }
        }
    }

    private static void runSecondScreen(){
        boolean secondScreenIsRunning = true;

        while(secondScreenIsRunning) {

            System.out.println("Second Screen");
            System.out.println("-------------");
            System.out.println();
            System.out.println();

            System.out.println("Click (r) to return to main menu");
            System.out.print("Choose an option: ");
            String choice = input.nextLine().trim().toLowerCase();

            switch(choice){
                case "r"-> secondScreenIsRunning = false;
            }
        }
    }


}
