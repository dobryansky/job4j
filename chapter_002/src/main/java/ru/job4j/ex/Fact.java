package ru.job4j.ex;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число - ");
        int n=scan.nextInt();
        Fact fact=new Fact();
        System.out.println("Factorial of " + n + " равен - "+fact.calc(n));

    }

    public static int calc(int n) {
        if (n<1){
            throw new IllegalArgumentException("Argument must be >= 1");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}