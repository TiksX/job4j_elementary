package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTest {

    @Test
    void testMaxOfTwoNumbers() {
        Max maxFinder = new Max();
        assertEquals(10, maxFinder.max(5, 10));
        assertEquals(3, maxFinder.max(3, 3));
        assertEquals(-1, maxFinder.max(-1, -5));
    }

    @Test
    void testMaxOfThreeNumbers() {
        Max maxFinder = new Max();
        assertEquals(10, maxFinder.max(5, 10, 7));
        assertEquals(3, maxFinder.max(3, 3, 3));
        assertEquals(-1, maxFinder.max(-1, -5, -3));
    }

    @Test
    void testMaxOfFourNumbers() {
        Max maxFinder = new Max();
        assertEquals(8, maxFinder.max(2, 8, 6, 4));
        assertEquals(-1, maxFinder.max(-1, -5, -3, -2));
    }
}