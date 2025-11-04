------------------------------------------------------------------------
Super Calculator
Author: Hacker T. Largebrain
------------------------------------------------------------------------

This program implements a highly efficient calculating engine for
a pocket calculator. It includes a complete test rig to demonstrate
that the engine works as it should.

part iii:
q22. yes..?
q23. 1, 7, it should always return 7
q24. yes, but its not the right result, it returns -13 when it should return 5
q25. it seems like the issue is with the first number becoming negative, so it would be good to check how that is stored
q26. 
    Method called    | displayValue | leftOperand | previousOperator
    initial state    |      0       |      0      |        ' '
    clear            |      0       |      0      |        ' '
    numberPressed(3) |      3       |      0      |        ' '
    plus()           |      0       |      3      |        '+'
    numberPressed(4) |      4       |      3      |        '+'
    equals()         |     7?       |      0      |        '+'
    getDisplayValue  |      7       |      0      |        '+'
q27. yes...?

q28.  
    clear()          |      0       |      0      |        '+'
    no, it still has the + as the previousOperator, it might affect them by applying the wrong operator?
29. it should also clear the previousOperator, and the leftOperand
30. it should be 6, which it displays 

part iv:
