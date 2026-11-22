import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(81, calculator.add(70, 11));
        assertEquals(23, calculator.add(0, 23));
        assertEquals(16, calculator.add(8, 8));
    }

    @Test
    void dif() {
        assertEquals(59, calculator.dif(70, 11));
        assertEquals(10, calculator.dif(20, 10));
    }

    @Test
    void div() {
        assertEquals(4, calculator.div(20, 5));
        assertThrows(ArithmeticException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        assertEquals(10, calculator.times(2, 5));
        assertEquals(0, calculator.add(0, 23));
    }

    @Test
    void solver() {
        assertEquals(15, calculator.solver(20, 4, 1, 5));
    }
}