package ru.job4j.condition;

public class Max {

    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public int max(int a, int b, int c) {
        return max(a, Math.max(b, c));
    }

    public int max(int a, int b, int c, int d) {
        return max(Math.max(a, b), Math.max(c, d));
    }
}

