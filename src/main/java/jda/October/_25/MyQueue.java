package jda.October._25;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 */

public class MyQueue {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.peek();
        myQueue.pop();
        myQueue.empty();
    }

    //    ["MyQueue","push","push","peek","pop","empty"]
//    [[],[1],[2],[],[],[]]
    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {

        stack.push(x);
    }

    public int pop() {
        return stack.remove(0);
    }

    public int peek() {
        return stack.firstElement();
    }

    public boolean empty() {
        return stack.empty();
    }
}
