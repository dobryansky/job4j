package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) {
        int year = 0;
        double fraction = 1+ percent/100;         //перевод процентов в части
        while (amount >0)
        {
            amount=amount*fraction-salary;
            year++;
        }
        return year;
    }
}
