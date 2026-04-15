package com.pluralsight;

public class App {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Yuliia");
        person.setLastName("Mozhchil");


        System.out.println(person.getFirstName() + " " + person.getLastName());
    }
}