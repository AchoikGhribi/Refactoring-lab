import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCalculateSumProductRatio() {
        Calculator calculator = new Calculator();
        double result = calculator.calculateSumProductRatio(10, 5);
        // (10+5) / (10*5) = 15/50 = 0.3
        assertEquals(0.3, result, 0.001);
    }

    @Test
    void testPrintResult() {
        Calculator calculator = new Calculator();
        assertDoesNotThrow(() -> calculator.printResult(10.0));
    }
}