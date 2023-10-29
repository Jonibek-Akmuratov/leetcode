package jda.October._26;


import java.util.Stack;

/**
 * 20. Valid Parentheses
 */
public class ValidParentheses {
    public static void main(String[] args) {
        boolean valid = isValid("()[]{}");
        System.out.println(valid);

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                if (ch == '}') {
                    Character pop = stack.pop();
                    if (!pop.equals('{'))
                        return false;
                } else if (ch == ']') {
                    Character pop = stack.pop();
                    if (!pop.equals('['))
                        return false;
                } else if (ch == ')') {
                    Character pop = stack.pop();
                    if (!pop.equals('('))
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}