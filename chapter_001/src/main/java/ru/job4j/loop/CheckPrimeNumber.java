package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = true;
        //проверяем значения от 2 до (finish-1), если в этом промежутке нет делителей без остатка, то число натуральное
        for (int index = 2; index <= (finish - 1); index++) {
            if (finish % index == 0) {
                prime = false;
                break;
            }

        }


        return prime;
    }
}


