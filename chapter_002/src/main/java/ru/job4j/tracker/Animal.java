package ru.job4j.tracker;

public class Animal {
    String name;
    public Animal() {

    }

    public Animal(String name) {
        this.name=name;
        name="Animal";
        System.out.println(name);
    }

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Tiger");

    }
}
