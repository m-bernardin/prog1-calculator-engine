

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * Test the CalcEngine class.
 * 
 * @author Hacker T. Largebrain 
 * @version 1.0
 */
public class CalcEngineTest
{
    // The engine to be tested.
    private CalcEngine engine;

    /**
     * Constructor for objects of class CalcEngineTester
     */
    public CalcEngineTest()
    {
        
    }

    @BeforeEach
    public void setUp()
    {
        engine=new CalcEngine();
    }
    
    /**
     * Test the plus operation of the engine.
     * @return the result of calculating 3+4.
     */
    @Test
    public void testPlus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the key presses: 3 + 4 =
        engine.numberPressed(3);
        engine.plus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 7.
        assertEquals(7,engine.getDisplayValue());
    }

    /**
     * Test the minus operation of the engine.
     * @return the result of calculating 9 - 4.
     */
    @Test
    public void testMinus()
    {
        // Make sure the engine is in a valid starting state.
        engine.clear();
        // Simulate the presses: 9 - 4 =
        engine.numberPressed(9);
        engine.minus();
        engine.numberPressed(4);
        engine.equals();
        // Return the result, which should be 5.
        assertEquals(5,engine.getDisplayValue());
    }
    
    @Test
    public void testPressNumber()
    {
        engine.clear();
        engine.numberPressed(8);
        assertEquals(8,engine.getDisplayValue());
    }
    
    @Test
    public void testMultipleDigits()
    {
        engine.clear();
        engine.numberPressed(1);
        engine.numberPressed(9);
        assertEquals(19,engine.getDisplayValue());
    }
}
