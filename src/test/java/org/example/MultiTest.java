package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiTest {

    @Test
    void multiple() {

        Multi mul = new Multi();
        assertEquals(mul.Multiple(2,3), 6);
    }
}