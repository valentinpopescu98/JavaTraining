package algorithms.search;

import data_structures.GraphNode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class BFSGraph {
    public static void printBFS(GraphNode node) {
        Queue<GraphNode> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();

            if (!current.visited) {
                current.visited = true;
                System.out.print(current.value + " ");

                queue.addAll(current.neighbours);
            }
        }
    }

    public static void main(String[] args) {
        GraphNode node0 = new GraphNode(0);
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);

        node0.neighbours = Arrays.asList(node1, node2);
        node1.neighbours = Arrays.asList(node2);
        node2.neighbours = Arrays.asList(node0, node3);
        node3.neighbours = Arrays.asList(node3);

        System.out.println("\noriginal.BFS ");
        printBFS(node2);
    }
}
