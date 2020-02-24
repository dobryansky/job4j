package ru.job4j.tracker;

public class Animal {
    private String name;

    public Animal(String name) {

        System.out.println( "Animal");
    }

    public static void main(String[] args) {
        Tiger tiger= new Tiger("Tiger");
    }
}
