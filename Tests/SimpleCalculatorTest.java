import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {
    SimpleCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new SimpleCalculator();
    }
    @Test
    void TestAddingTwoNumbers() {
        int res = calculator.add("6,2");
        assertEquals(8, res);
    }
}
