package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.Exceptions.DivizorIsNullException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void shouldDivideIsNotNull() {
        assertThrows(DivizorIsNullException.class, () -> out.getDivide(5, 0));
    }

    @Test
    public void shouldDivideIsNull() {
        assertDoesNotThrow(() -> out.getDivide(5, 5));
    }

}