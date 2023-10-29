package jda.October.todo;


import java.util.Stack;

/**
 * 1472. Design Browser History
 */
public class BrowserHistory {

    Stack<String> stack;

    public BrowserHistory(String homepage) {
        stack = new Stack<>();
        stack.push(homepage);

    }

    public void visit(String url) {
        stack.push(url);
    }

    public String back(int steps) {
        if (stack.size() <= steps)
            return stack.peek();

        String web = stack.get(stack.size() - steps);
        stack.add(web);
        return web;

    }

    public String forward(int steps) {
        return "";
    }
}
