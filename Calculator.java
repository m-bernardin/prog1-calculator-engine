
/**
 * A better calculator than the one Hacker T. Largebrain made
 *
 * @author Hacker T. LargerBrain
 * @version v1.0
 */
public class Calculator
{
    //the number to be currently displayed
    private int displayNumber;
    //the current operation being fufilled 
    private char currentOperator;
    //the number were performing the operation on
    private int previousNumber;
    
    /**
     * creates a calculator and immediatly makes sure to clear it
     */
    public Calculator()
    {
        clear();
    }
    
    public void clear()
    {
        displayNumber=0;
        currentOperator=' ';
        previousNumber=0;
    }
    
    public void pressNumber(int number)
    {
        //makes sure to move over the current number if two numbers are entered back to back
        displayNumber=displayNumber*10+number;
    }
    
    public void plus()
    {
        if(previousNumber!=0){
            equals();
            previousNumber=displayNumber;
        }
        else{
            previousNumber=displayNumber;            
        }
        displayNumber=0;
        currentOperator='+';
    }
    
    public void minus()
    {
        if(previousNumber!=0){
            equals();
            previousNumber=displayNumber;
        }
        else{
            previousNumber=displayNumber;            
        }
        displayNumber=0;
        currentOperator='-';
    }
    
    public void equals()
    {
        if(currentOperator=='+'){
            displayNumber=previousNumber+displayNumber;
        }
        else if(currentOperator=='-'){
            displayNumber=previousNumber-displayNumber;
        }
        else{
            if(displayNumber==0&&previousNumber!=0){
                displayNumber=previousNumber;
            }
        }
    }
    
    public int getDisplayNumber()
    {
        return displayNumber;
    }
    
    public int getPreviousNumber()
    {
        return previousNumber;
    }
    
    public char getCurrentOperator()
    {
        return currentOperator;
    }
    
    public String getAuthor()
    {
        return "Hacker T. Largerbrain";
    }
    
    public String getVersion()
    {
        return "v1.0";
    }
}
