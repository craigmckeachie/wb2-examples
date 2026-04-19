package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        promptForAndBuildFullName();
    }

    private static void promptForAndBuildFullName() {

        print("First Name: ");
        String firstName = getString();

        print("Middle Name: ");
        String middleName = getString();

        print("Last Name: ");
        String lastName = getString();

        print("Suffix: ");
        String suffix = getString();

        String fullName = buildFullName(firstName, middleName, lastName, suffix);

        print(fullName);
    }

    private static void promptForAndParseFullName(){
        print("Please enter your full name: ");
        String fullName = getString();

        int firstSpacePosition = fullName.indexOf(" ");
        int lastSpacePosition = fullName.lastIndexOf(" ");
        boolean hasMiddleName = lastSpacePosition != -1;
        String firstName, middleName, lastName;

        firstName = fullName.substring(0, firstSpacePosition);
        if (hasMiddleName){
            middleName = fullName.substring(firstSpacePosition + 1, lastSpacePosition);
            lastName = fullName.substring(lastSpacePosition + 1);
        }else{
            lastName = fullName.substring(firstSpacePosition + 1);
        }

        System.out.println("fir");
    }

    private static String buildFullName(String firstName, String middleName, String lastName, String suffix) {
        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName = fullName + " " + middleName;
        }

        fullName = fullName + " " + lastName;

        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }
        return fullName;
    }

    private static String getString() {
        return scanner.nextLine().trim();
    }

    private static void print(String x) {
        System.out.println(x);
    }
}