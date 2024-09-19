import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit tests for the App class.
 */
public class AppTest {

    /**
     * Test the addition operation.
     */
    @Test
    public void testAddition() {
        Map<String, Integer> variables = new HashMap<>();
        App app = new App();
        int result = app.calculate("3 + 2", variables);
        Assertions.assertEquals(5, result, "Adding 3 and 2 should return 5");
    }

    /**
     * Test the subtraction operation.
     */
    @Test
    public void testSubtraction() {
        Map<String, Integer> variables = new HashMap<>();
        App app = new App();
        int result = app.calculate("5 - 2", variables);
        Assertions.assertEquals(3, result, "Subtracting 2 from 5 should return 3");
    }

    /**
     * Test the multiplication operation.
     */
    @Test
    public void testMultiplication() {
        Map<String, Integer> variables = new HashMap<>();
        App app = new App();
        int result = app.calculate("4 * 2", variables);
        Assertions.assertEquals(8, result, "Multiplying 4 by 2 should return 8");
    }

    /**
     * Test the division operation.
     */
    @Test
    public void testDivision() {
        Map<String, Integer> variables = new HashMap<>();
        App app = new App();
        int result = app.calculate("8 / 2", variables);
        Assertions.assertEquals(4, result, "Dividing 8 by 2 should return 4");
    }

    /**
     * Test the handling of variables.
     */
    @Test
    public void testVariableUsage() {
        Map<String, Integer> variables = new HashMap<>();
        variables.put("x", 5);
        App app = new App();
        int result = app.calculate("x + 3", variables);
        Assertions.assertEquals(8, result, "Adding 3 to variable 'x' with value 5 should return 8");
    }

    /**
     * Test for division by zero error.
     */
    @Test
    public void testDivisionByZero() {
        Map<String, Integer> variables = new HashMap<>();
        App app = new App();
        Assertions.assertThrows(ArithmeticException.class, () -> app.calculate("5 / 0", variables), "Dividing by zero should throw ArithmeticException");
    }
}
