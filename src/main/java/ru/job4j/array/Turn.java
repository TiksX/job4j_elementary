package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        for (int first = 0, second = array.length - 1; first < second; first++, second--) {
            int temp = array[first];
            array[first] = array[second];
            array[second] = temp;
        }

        return array;
    }
}

