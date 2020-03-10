package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result="Будет";
        System.out.print(" Я великий Оракул. Что ты хочешь узнать? ");
        int answer = new Random().nextInt(3);
        switch (answer) {
            case (1) :
                result=" Не будет ";
                break;
            case (2) :
                result= " Хз ";
                break;
        }
        String name = input.nextLine();
        System.out.print(name + ", сейчас подумаю - " + result);
    }
}
