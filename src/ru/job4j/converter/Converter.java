package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;

    }

    public static int rubleToDollar(int value) {
        return -1; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}

