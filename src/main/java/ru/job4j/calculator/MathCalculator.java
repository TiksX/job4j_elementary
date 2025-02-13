package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndMultiply(double first, double second) {
        return difference(first, second)
                + multiply(first, second);
    }

    public static double divisionAndMultiply(double first, double second) {
        return division(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета разности равен: " + differenceAndMultiply(10, 20));
        System.out.println("Результат расчета деления равен: " + divisionAndMultiply(10, 20));
    }
}
