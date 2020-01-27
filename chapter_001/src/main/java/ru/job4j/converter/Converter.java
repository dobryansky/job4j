package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value/60;
    }

    public static int DollarToRuble(int value) {
        return value*60;
    }

    public static int EuroToRuble(int value)   { return value*70; }

    public static void main(String[] args) {
        int euro = rubleToEuro(1000);
        int dollar = rubleToDollar(1000);

        int in1 = 1000;
        int expected1 = 14;
        int out1 = rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("1000 rubles are 14 euro. Test result : " + passed1);

        int in2 = 1000;
        int expected2 = 16;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("1000 rubles are 16 dollars. Test result : " + passed2);

        int in3 = 10;
        int expected3 = 600;
        int out3 = DollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("10 dollars are 600 rubles. Test result : " + passed3);

        int in4 = 10;
        int expected4 = 700;
        int out4 = EuroToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("10 euro are 700 rubles. Test result : " + passed4);
    }
}
