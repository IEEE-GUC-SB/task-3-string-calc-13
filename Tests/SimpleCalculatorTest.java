import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    SimpleCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new SimpleCalculator();
    }

    @Test
    void TestAddingTwoNumbers() throws Exception {
        int res = calculator.add("6,2");
        assertEquals(8, res);
    }

    @Test
    void TestAddingNNumbers() throws Exception {
        int res = calculator.add("6,2,4,1");
        assertEquals(13, res);
    }

    @Test
    void TestAddingNNumbersNewLine() throws Exception {
        int res = calculator.add("1\n2,3\n5");
        assertEquals(11, res);
    }

    @Test
    void TestAddingNNumbersDiffDelimiters() throws Exception {
        int res = calculator.add("//;\n1;2;3;5");
        assertEquals(11, res);
    }

    @Test
    void TestAddingNNumbersDiffDelimitersNegative() throws Exception {
        Assertions.assertThrows(Exception.class, () -> calculator.add("1,2,-3,5"));
    }

    @Test
    void TestAddingNNumbersIgnoreMoreThanThousand() throws Exception {
        int res = calculator.add("1,2,3000,5");
        assertEquals(8, res);
    }

    @Test
    void TestAddingNNumbersDelimiterNLength() throws Exception {
        int res = calculator.add("//[*.*]\n1*.*2*.*3");
        assertEquals(6, res);
    }
}
