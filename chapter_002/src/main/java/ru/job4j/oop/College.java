package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman fresh= new Freshman();
        Student stud=fresh;
        Object obj =stud;

        System.out.println(fresh);
        System.out.println(stud);
        System.out.println(obj);
    }
}
