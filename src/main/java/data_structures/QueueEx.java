package data_structures;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Character> queue = new ArrayDeque<>(List.of('A', 'B', 'C', 'D', 'E'));
        System.out.println(queue);

        queue.add('Z');
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);
    }
}
