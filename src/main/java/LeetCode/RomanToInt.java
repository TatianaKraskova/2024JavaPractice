package main.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given a roman numeral, convert it to an integer.
       Symbol       Value
       I             1
       V             5
       X             10
       L             50
       C             100
       D             500
       M             1000
       I can be placed before V (5) and X (10) to make 4 and 9.
       X can be placed before L (50) and C (100) to make 40 and 90.
       C can be placed before D (500) and M (1000) to make 400 and 900.
        */
public class RomanToInt {
    public static void main(String[] args) {
        String romanString = "MCMXCIV";
        // Output: 1994  Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
        System.out.println(romanToInt(romanString));
    }

    private static int romanToInt(String romanString) {
        // Create a map for Roman numeral values
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        // Loop through the string from left to right
        for (int i = 0; i < romanString.length(); i++) {
            char symbol = romanString.charAt(i);
            int currentValue = map.get(symbol);

            // If the current value is greater than the previous value,
            // we subtract twice the previous value
            if (currentValue > prevValue) {
                total += currentValue - 2 * prevValue; // total = total + currentValue - (2 * prevValue);
            } else {
                total += currentValue;
            }
            prevValue = currentValue;
        }
        return total;
    }
}
        /*
        int romanInt = 0;
        for (int i = 0; i < romanString.length(); i++) { //s = "MCMXCIV"
            String symbol = String.valueOf(romanString.charAt(i));
            if (symbol.equals("I")) {
                return romanInt + 1;
            } else if (symbol.equals("V")) {
                return romanInt + 5;
            } else if (symbol.equals("X")) {
                return romanInt + 10;
            } else if (symbol.equals("L")) {
                return romanInt + 50;
            } else if (symbol.equals("C")) {
                return romanInt + 100;
            } else if (symbol.equals("D")) {
                return romanInt + 500;
            } else if (symbol.equals("M")) {
                return romanInt + 1000;
            } else if ((symbol + 1).equals("IV")) {
                return romanInt + 4;
            } else if ((symbol + 1).equals("IX")) {
                return romanInt + 9;
            } else if ((symbol + 1).equals("XL")) {
                return romanInt + 40;
            } else if ((symbol + 1).equals("XC")) {
                return romanInt + 90;
            } else if ((symbol + 1).equals("CD")) {
                return romanInt + 400;
            } else if ((symbol + 1).equals("CM")) {
                return romanInt + 900;
            }
        }
        return romanInt;
    }
}
*/


