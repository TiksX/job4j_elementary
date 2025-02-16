package ru.job4j.loop;

public class Factorial {

    public static int calculate(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}