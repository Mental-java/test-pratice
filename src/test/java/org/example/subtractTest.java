package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class subtractTest {
    @Test
    void sub(){
        subtract sb = new subtract();
        assertEquals(sb.sub(12,6),6);
    }


}