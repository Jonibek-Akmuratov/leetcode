package jda.October._24;

import java.util.Stack;

public class RecentCounter {
    Stack<Integer> stack;

    public RecentCounter() {
        stack = new Stack<>();
    }

    public int ping(int t) {
        stack.push(t);
        int count = 1;
        while (true) {
            Integer peek = stack.peek();
            int startTime = t - 3000;
            if (peek > startTime)
                count++;
            else
                return count;
        }
    }
}
