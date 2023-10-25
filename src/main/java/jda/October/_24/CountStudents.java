package jda.October._24;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class CountStudents {
    public static void main(String[] args) {
        int[] st = {1, 1, 0, 0};
        int[] sw = {0, 1, 0, 1};
        System.out.println(countStudents(st, sw));
    }

    public static int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> queue = new LinkedList<>();
        for (int student : students)
            queue.add(student);

        int count = 0;

        for (int sandwich : sandwiches) {
            Integer student = queue.poll();
            if (Objects.equals(student,sandwich))
                count++;
        }

        return count;
    }
}
