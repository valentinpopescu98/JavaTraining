package algorithms.search;

import data_structures.GraphNode;

import java.util.LinkedList;
import java.util.List;

public class DFSGraph {
    static LinkedList<GraphNode> queue = new LinkedList<>();

    public static void printDFS(GraphNode node) {
        if (!queue.isEmpty() && queue.getFirst() == node) {
            return;
        }

        queue.addLast(node);
        System.out.print(node.key + " ");

        for (GraphNode value : node.values) {
            if (!queue.isEmpty() && queue.getLast() == value) {
                return;
            }

            printDFS(value);
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

        System.out.println("\noriginal.DFS ");
        printDFS(node2);
    }
}
