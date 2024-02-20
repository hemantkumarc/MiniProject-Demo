package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void logTest() {
        assertEquals(2.302585092994046d, Main.logFn(10.0d));
    }

    @Test
    void powerTest() {
        assertEquals(4, Main.powerFn(2, 2));
    }

    @Test
    void squareRootTest() {
        assertEquals(2, Main.sqrtFn(4));
    }

    @Test
    void factorialTest() {
        assertEquals(6, Main.factorialFn(3));
    }
}