
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
    
    /**
     * resets all variables of the calculator
     */
    public void clear()
    {
        displayNumber=0;
        currentOperator=' ';
        previousNumber=0;
    }
    
    /**
     * simulates pressing a number on the calculator
     * 
     * @param number the number being pressed
     */
    public void pressNumber(int number)
    {
        //makes sure to move over the current number if two numbers are entered back to back
        displayNumber=displayNumber*10+number;
    }
    
    /**
     * simulates pressing the plus button on the calculator
     */
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
    
    /**
     * simulates pressing the minus button on the calculator
     */
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
    
    /**
     * simulates pressing the equals button on the calculator
     */
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
    
    /**
     * gets the number currently being displayed 
     * 
     * @return displayNumber
     */
    public int getDisplayNumber()
    {
        return displayNumber;
    }
    
    /**
     * gets the last number that was displayed 
     * 
     * @return previousNumber
     */
    public int getPreviousNumber()
    {
        return previousNumber;
    }
    
    /**
     * gets the operation to be next fufilled
     * 
     * @return currentOperator
     */
    public char getCurrentOperator()
    {
        return currentOperator;
    }
    
    /**
     * gets the author of the project
     * 
     * @return author
     */
    public String getAuthor()
    {
        return "Hacker T. Largerbrain";
    }
    
    /**
     * gets the version of the project
     * 
     * @return version
     */
    public String getVersion()
    {
        return "v1.0";
    }
}
