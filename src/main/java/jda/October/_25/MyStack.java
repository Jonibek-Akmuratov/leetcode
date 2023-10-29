package jda.October._25;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. Implement Stack using Queues
 */
public class MyStack {
    //["MyStack","push","push","top","pop","empty"]
//    [[],[1],[2],[],[],[]]
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        return  removeLastElement(queue);
    }

    public int top() {
        return (int) ((LinkedList) queue).getLast();
    }

    public boolean empty() {
        return queue.isEmpty();
    }

    public static <E> E removeLastElement(Queue<E> queue) {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        E lastElement = null;

        int size = queue.size();
        for (int i = 0; i < size; i++) {
            E element = queue.poll();
            if (i == size - 1) {
                lastElement = element;
            } else {
                queue.offer(element);
            }
        }

        return lastElement;
    }
}
