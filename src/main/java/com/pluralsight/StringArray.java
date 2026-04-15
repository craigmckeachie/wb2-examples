package com.pluralsight;

public class StringArray {

    public static void main(String[] args) {
                        //  0   , 1         2       3    (index)
        String[] names = {"Kiz", "Kevin", "Chris", "Craig", "Keith", "Charlie"};

        System.out.println(names[0]);
        System.out.println(names.length);
        System.out.println(names[0] + " " + names[1] + " " + names[2]+ " "+  names[3]);
        System.out.println();

        for (int index=0; index<names.length;index = index + 1){
            System.out.println(names[index]);
        }




    }
}
