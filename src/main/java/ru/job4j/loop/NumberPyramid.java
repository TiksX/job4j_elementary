package ru.job4j.loop;

public class NumberPyramid {

    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            for (int d = 1; d <= i; d++) {
                System.out.print(d);
            }
            for (int o = i - 1; o >= 1; o--) {
                System.out.print(o);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
