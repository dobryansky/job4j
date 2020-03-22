package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) throws NoMoneyexeption {

        if (money<price){
            throw new NoMoneyexeption("У тебя мало денег для этой покупки");
        }
        int[] rsl = new int[100];
        int size = 0;
        int needreturn = money - price;
        int j = 0;
        for (int i = 0; i < COINS.length; i++) {
            while (needreturn != 0) {
                needreturn = needreturn - COINS[i];
                rsl[j] = COINS[i];
                j = j + 1;
                if (needreturn < COINS[i]) {
                    i++;
                }
                size++;
            }
        }

        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) throws NoMoneyexeption {
        Machine machine = new Machine();
        int[] coins = machine.change(60, 100);
        for (int tp : coins) {
            System.out.println(tp);
        }
    }
}