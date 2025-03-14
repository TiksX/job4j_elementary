package ru.job4j.condition;

public class Max {

    public int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int findMax(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
}

