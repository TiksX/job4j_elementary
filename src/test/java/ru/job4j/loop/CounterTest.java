package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    void when0and10then55() {
        int result = Counter.sum(0, 10);
        assertEquals(55, result);
    }

    @Test
    void when10and6then0() {
        int result = Counter.sum(10, 6);
        assertEquals(0, result);
    }
}
