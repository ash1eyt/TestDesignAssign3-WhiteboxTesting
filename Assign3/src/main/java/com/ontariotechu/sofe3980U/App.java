package com.ontariotechu.sofe3980U;

import java.util.Scanner;

public class App {

    /*Function to count the specified character of a char array*/

    public static String CharCounter(char[] a, char ch) {
        int ct = 0;                               //Integer variable ct for keeping count is initialized to 0
        for (int i = 0; i < a.length; i++) {      //Uses for loop to iterate through the char array
            if (a[i] == ch) {                     //If index i of the array equals the specified character, increment ct
                ct++;
            }
        }

        /*Returns the array, specified character, and the number of its occurrences*/

        String output = "Array is: " + new String(a) + " - number of " + ch + ": " + ct;
        return output;
    }

    public static void main(String[] args) {

        /*Asks user to enter the char array, reads the input, and prints out the array*/

        System.out.println("Please enter the array of characters with no spaces: ");
        Scanner scan = new Scanner(System.in);
        char[] a = scan.next().toCharArray();
        System.out.println(a);

        /*Asks user to enter the character to be counted and reads the input*/

        System.out.println("Please enter the character to be counted: ");
        char ch = scan.next().charAt(0);

        System.out.println(CharCounter(a, ch));     //Calls function to count the occurrences

    }

}


