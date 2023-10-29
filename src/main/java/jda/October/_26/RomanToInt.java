package jda.October._26;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Stack;

/**
 * 13. Roman to Integer
 */
public class RomanToInt {
    public static void main(String[] args) {
        romanToInt("III");
    }

    static Hashtable<Character, Integer> map = new Hashtable<>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public static int romanToInt(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray())
            stack.push(ch);

        int result = 0;
        int max = Integer.MIN_VALUE;
        while (!stack.isEmpty()) {
            Character pop = stack.pop();

            int value = map.getOrDefault(pop, 0);

            if (value < max) {
                result = result + value * (-1);
            } else {
                max = value;
                result = result + value;
            }
        }
        return result;
    }

}

