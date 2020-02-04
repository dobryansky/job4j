package ru.job4j.loop;

public class PrimeNumber {
    // т.к. мы проверяем от 1 до x, а число 1 не является простым, но проходит в методе CheckPrimeNumber, как true, то мы начальное значение счетчика count устанавливаем -1

    public int calc(int finish) {
        int count = -1;
        for (int number = 1; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}
