import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(81, calculator.add(70, 11));
        assertEquals(23, calculator.add(0, 23));
        assertEquals(16, calculator.add(8, 8));
        assertEquals(calculator.add(80, -70), calculator.add(4,6));
        assertTrue(calculator.add(7, -3) > 0);
        assertNotNull(calculator.add(1, -1));
    }

    @Test
    void dif() {
        assertEquals(59, calculator.dif(70, 11));
        assertEquals(10, calculator.dif(20, 10));
        assertEquals(calculator.dif(80, -70), calculator.dif(200,50));
        assertTrue(calculator.dif(8, 20) < 0);
        assertNotNull(calculator.dif(1, -1));
    }

    @Test
    void div() {
        assertEquals(4, calculator.div(20, 5));
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
        assertEquals(calculator.div(80, -10), calculator.div(-16,2));
        assertTrue(calculator.div(7, -3) < 0);
        assertNotNull(calculator.div(1, -1));
    }

    @Test
    void times() {
        assertEquals(10, calculator.times(2, 5));
        assertEquals(0, calculator.add(0, 23));
    }

    @Test
    void solver() {
        assertTrue(calculator.solver() != 1);
        assertNotNull(calculator.solver()); 
    }
}