package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import Main.Calculadora;

public class CalculadoraTest {
    private static Calculadora calculadora;

    @BeforeAll
    public static void setup() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3));
        assertNotEquals(6, calculadora.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(1, 0));
    }

    @RepeatedTest(5)
    public void testRepetido() {
        assertTrue(calculadora.sumar(1, 1) == 2);
    }
}
