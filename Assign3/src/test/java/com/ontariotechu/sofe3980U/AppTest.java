package com.ontariotechu.sofe3980U;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test Design Assignment 3 - Whitebox Testing
 * Tests for App.java to test for number of occurrences of a character in a char array
 */
public class AppTest 
{


    @Test
    public void correctOutput1(){               //Checks for correct output (char array of letters)
        char[] array1 = {'w','o', 'o', 'o', 'o','w'};
        char letter1 = 'o';
        assertEquals(App.CharCounter(array1, letter1), "Array is: woooow - number of o: 4");
    }

    @Test
    public void correctOutput2(){            //Checks for correct output (char array of letters and special characters)
        char[] array2 = {'o', 'n', 'e', 'h', '^', 'e', 'e'};
        char letter2 = 'e';
        assertEquals(App.CharCounter(array2, letter2), "Array is: oneh^ee - number of e: 3" );
    }

    @Test
    public void correctOutput3(){            //Checks for correct output (char array of uppercase letters)
        char[] array3 = {'P', 'S', 'M', 'U', 'O', 'U', '3'};
        char letter3 = 'U';
        assertEquals(App.CharCounter(array3, letter3), "Array is: PSMUOU3 - number of U: 2" );
    }

    @Test
    public void correctOutput4(){             //Checks for correct output (char array of mixed characters)
        char[] array4 = {'^', 'O', 'P', '6', '%', '0', '0', '0', '.', '!'};
        char letter4 = 't';
        assertEquals(App.CharCounter(array4, letter4), "Array is: ^OP6%000.! - number of t: 0" );
    }

    @Test
    public void correctOutput5(){              //Checks for correct output (char array of numbers)
        char[] array5 = {'3', '3', '3', '3', '5', '3', '1'};
        char letter5 = '3';
        assertEquals(App.CharCounter(array5, letter5), "Array is: 3333531 - number of 3: 5" );
    }

    @Test
    public void correctOutput6(){           //Checks for correct output (char array of special characters)
        char[] array6 = {'&', '*', '@', ')'};
        char letter6 = '@';
        assertEquals(App.CharCounter(array6, letter6), "Array is: &*@) - number of @: 1" );
    }
}
