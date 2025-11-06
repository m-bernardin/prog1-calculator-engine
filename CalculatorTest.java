

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CalculatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalculatorTest
{
    /**
     * Default constructor for test class CalculatorTest
     */
    public CalculatorTest()
    {
    }
    
    private Calculator calc;
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        calc=new Calculator();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void testPlus()
    {
        calc.clear();
        calc.pressNumber(3);
        calc.plus();
        calc.pressNumber(4);
        calc.equals();
        assertEquals(7,calc.getDisplayNumber());
    }
    
    @Test
    public void testMinus()
    {
        calc.clear();
        calc.pressNumber(7);
        calc.minus();
        calc.pressNumber(5);
        calc.equals();
        assertEquals(2,calc.getDisplayNumber());
    }
    
    @Test
    public void testPressNumber()
    {
        calc.clear();
        calc.pressNumber(8);
        assertEquals(8,calc.getDisplayNumber());
    }
    
    @Test
    public void testMultipleDigits()
    {
        calc.clear();
        calc.pressNumber(1);
        calc.pressNumber(9);
        assertEquals(19,calc.getDisplayNumber());
    }
}
