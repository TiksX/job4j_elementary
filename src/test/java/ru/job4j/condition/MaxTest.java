package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTest {

    @Test
    void testMaxOfThreeNumbers() {
        Max maxFinder = new Max();
        assertEquals(10, maxFinder.findMax(5, 10, 7));
        assertEquals(3, maxFinder.findMax(3, 3, 3));
        assertEquals(-1, maxFinder.findMax(-1, -5, -3));
    }

    @Test
    void testMaxOfFourNumbers() {
        Max maxFinder = new Max();
        assertEquals(8, maxFinder.findMax(2, 8, 6, 4));
        assertEquals(-1, maxFinder.findMax(-1, -5, -3, -2));
    }
}