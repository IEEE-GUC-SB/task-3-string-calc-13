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

    @Test
    void TestAddingNNumbers(){
        int res = calculator.add("6,2,4,1");
        assertEquals(13, res);
    }

    @Test
    void TestAddingNNumbersNewLine(){
        int res = calculator.add("1\n2,3\n5");
        assertEquals(11, res);
    }

    @Test
    void TestAddingNNumbersDiffDelimiters(){
        int res = calculator.add("//;\n1;2;3;5");
        assertEquals(11, res);
    }
}
