package com.pluralsight;

public class StringEscapeExample {

    public static void main(String[] args) {
//        String welcome = "Big Tex says \"Howdy\"! \n";
//
//        System.out.print(welcome);
//        System.out.println();
//        System.out.print("Another line.");

        String letter = new String("a");
        String uppercaseLetter = new String("A");


        if (letter.equals(uppercaseLetter)){
            System.out.println("Upper and lower are equal with equals");
        }else{
            System.out.println("Upper and lower are not equal with equals");
        }

        if (letter.equalsIgnoreCase(uppercaseLetter)){
            System.out.println("Upper and lower are equal with equalsIgnoreCase ");
        }

    }
}
