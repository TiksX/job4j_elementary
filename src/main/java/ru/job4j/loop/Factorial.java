package ru.job4j.loop;

public class Factorial {

    public static int calculate(int number) {
        if (number < 2) {
            throw new IllegalArgumentException("Start should be less than finish.");
        }
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
