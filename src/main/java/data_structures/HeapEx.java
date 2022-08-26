package data_structures;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class HeapEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(List.of(5, 4, 3, 6, 7));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.addAll(List.of(5, 4, 3, 6, 7));

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.poll());
        }

        System.out.println();

        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll());
        }
    }
}
