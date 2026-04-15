package com.pluralsight;

public class WhileExample {

    public static void main(String[] args) {
        //declare and initialize counter variable
        int count = 1;
        //    (condition)
        while (count <= 5) {
            System.out.println(count);
            //change the counter
            count++; //shorthand for count = count + 1;
        }


    }
}
