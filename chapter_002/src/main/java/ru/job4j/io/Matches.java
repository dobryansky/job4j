package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    int numbers = 11;

    public static void main(String[] args) {
        int numbers = 11;
        int player = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Количество спичек на столе " + numbers);
        while (numbers > 1) {
            player = player + 1;
            if (player == 3) {
                player = 1;
            }
            System.out.println("ХОД " + player + "-ого игрока");
            int select = Integer.valueOf(input.nextLine());
            if (select > 0 && select < 4) {
                numbers = numbers - select;

                System.out.println("");
                System.out.println("Количество спичек на столе " + numbers);
            } else {
                System.out.println("!!!!!!!ERROR Введите количество спичек от 1 до 3!!!!!!!!!");
                System.out.println("");

            }


        }
        System.out.println("ПОБЕДА ДОСТАЕТСЯ " + player + "-ому игроку");

    }
}
