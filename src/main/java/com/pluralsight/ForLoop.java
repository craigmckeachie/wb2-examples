package com.pluralsight;

public class ForLoop {

    public static void main(String[] args) {
        //declare and initialize counter variable
//        int count = 1;
//        //    (condition)
//        while (count <= 5) {
//            System.out.println(count);
//            //change the counter
//            count++; //shorthand for count = count + 1;
//        }

        //(//declare and initialize counter variable;condition;change the counter)
        for (int count = 1;count <= 5; count++){
            System.out.println(count);
        }

        //count down example
        for (int count = 10;count >= 1; count--){
            System.out.println(count);
        }


    }
}
