package jda.October._25;

import java.util.Stack;

/**
 * 1047. Remove All Adjacent Duplicates In String
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        removeDuplicates("hello");
    }

    public static String removeDuplicates(String s) {

        if (s.length() == 1)
            return s;
        Stack<Character> stack = new Stack<>();
        for (char character : s.toCharArray())
            if (!stack.empty() && stack.peek() == character)
                stack.pop();
            else
                stack.push(character);

        StringBuilder answer = new StringBuilder();
        while (!stack.empty())
            answer.append(stack.pop());

        return answer.reverse().toString();
    }
}