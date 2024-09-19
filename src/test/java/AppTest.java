import org.junit.Test;
import org.junit.Assert;
import java.util.HashMap;
import java.util.Map;

/**
 * Unit tests for the App class using JUnit 4.
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
        Assert.assertEquals("Adding 3 and 2 should return 5", 5, result);
    }

    /**
     * Test the subtraction operation.
     */
    @Test
    public void testSubtraction() {
        Map<String, Integer> variables = new HashMap<>();
        App app = new App();
        int result = app.calculate("5 - 2", variables);
        Assert.assertEquals("Subtracting 2 from 5 should return 3", 3, result);
    }

    /**
     * Test the multiplication operation.
     */
    @Test
    public void testMultiplication() {
        Map<String, Integer> variables = new HashMap<>();
        App app = new App();
        int result = app.calculate("4 * 2", variables);
        Assert.assertEquals("Multiplying 4 by 2 should return 8", 8, result);
    }

    /**
     * Test the division operation.
     */
    @Test
    public void testDivision() {
        Map<String, Integer> variables = new HashMap<>();
        App app = new App();
        int result = app.calculate("8 / 2", variables);
        Assert.assertEquals("Dividing 8 by 2 should return 4", 4, result);
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
        Assert.assertEquals("Adding 3 to variable 'x' with value 5 should return 8", 8, result);
    }

    /**
     * Test for division by zero error.
     */
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Map<String, Integer> variables = new HashMap<>();
        App app = new App();
        app.calculate("5 / 0", variables);
    }
}
