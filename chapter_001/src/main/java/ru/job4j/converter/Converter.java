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


    }
}
