package algorithms.search;

import data_structures.GraphNode;

import java.util.*;

public class BFSGraph {
    static LinkedList<GraphNode> queue = new LinkedList<>();

    static <T> boolean contains(LinkedList<T> list, T element) {
        for (T value : list) {
            if (value == element) {
                return true;
            }
        }

        return false;
    }

    static int height(GraphNode node) {
        if (!queue.isEmpty() && queue.getFirst() == node) {
            return 0;
        }

        Stack<Integer> heights = new Stack<>();
        for (GraphNode value : node.values) {
            if (!queue.isEmpty() && queue.getLast() == value) {
                return 0;
            }

            queue.addLast(node);
            heights.add(height(value));
        }

        Collections.sort(heights);

        return heights.pop() + 1;
    }

    static void processLevel(GraphNode node, int l) {
        if (l == 0) {
            for (int i = 0; i < queue.size(); i++) {
                if (node == queue.get(i)) {
                    return;
                }
            }

            if (!contains(queue, node)) {
                queue.addLast(node);
                System.out.print(node.key + " ");
            }
        }
        else if (l > 0) {
            for (GraphNode value : node.values) {
                if (!queue.isEmpty() && queue.getLast() == value) {
                    return;
                }

                processLevel(value, l - 1);
            }
        }
    }

    public static void printBFS(GraphNode node) {
        int h = height(node);
        queue = new LinkedList<>();

        for (int l = 0; l < h; l++) {
            processLevel(node, l);
        }
    }

    public static void main(String[] args) {
        GraphNode node0 = new GraphNode(0);
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);

        node0.values = List.of(node1, node2);
        node1.values = List.of(node2);
        node2.values = List.of(node0, node3);
        node3.values = List.of(node3);

        System.out.println("\noriginal.BFS ");
        printBFS(node2);
    }
}
