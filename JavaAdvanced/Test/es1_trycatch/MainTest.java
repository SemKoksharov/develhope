package es1_trycatch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testValido() {
        assertTrue(Main.controlAndCreateException(10));
    }

    @Test
    void nonValido() {
        try {
            Main.controlAndCreateException(3333);
            fail("Eccezione non è stata lanciata");
        } catch (ArithmeticException e) {
            assertEquals("Il numero deve essere tra 1 e 17!", e.getMessage());
        }
    }
}