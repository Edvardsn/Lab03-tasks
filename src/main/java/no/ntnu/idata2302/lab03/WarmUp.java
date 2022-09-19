/*
 * This file is part of NTNU's IDATA2302 Lab 03.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab03;


public class WarmUp {

    /**
     * Create a recursive algorithm that takes a value and its
     * exponent and returns this value raised to the given exponent.
     */
    public static int power(int value, int exponent) {
        if(value <= 0 || exponent < 0){
            throw new IllegalArgumentException("Negative or zero number");
        }
        return multiply(value, exponent, value);
    }

    private static int multiply(int value, int exponent, int multiPlier) {
         if(exponent == 0){
            return 1;
        } else if(exponent != 1){
             return multiply(value * multiPlier,exponent - 1,multiPlier);
         }
        else{
            return value;
        }

    }


    /**
     * Compute the sum of the given array. For instance, sum([1, 2,
     * 3]) = 6.
     */
    public static int sum(int[] array) {
        return count(0,0,array);
    }

    private static int count(int index, int sum, int[] array) {
        if(array == null){
            throw new IllegalArgumentException("Null array");
        }

        if(index < array.length){
            sum += array[index];
            index++;
            return count(index, sum, array);
        }
        else{
            return sum;
        }
    }


    /**
     * Check if the given text is a palindrome, that is a symmetrical
     * sequence of letters, such as 'kayak' or 'madam'.
     */
    public static boolean isPalindrome(String text) {
        int startIndex = 0;
        int endIndex = text.length() - 1;

          if(startIndex == endIndex){
            return true;
        }
        else if(text.charAt(startIndex) == text.charAt(endIndex)){
            text = text.substring(startIndex + 1 , endIndex);

            return isPalindrome(text);
        }
        else {
            return false;
        }
    }
    /**
     * Convert the given number into the given base. The result is a
     * string (a sequence of symbols), because base greater than 10
     * will requires more symbols than there are Arabic digits.
     */
    public static String toBase(int number, int base) {

    }

    private static final String[] SYMBOLS = new String[]{
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        "A", "B", "C", "D", "E", "F", "G", "H", "G", "I"
    };

}
