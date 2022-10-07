package algorithms.search;

import data_structures.GraphNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class DFSGraph {
    public static void printDFS(GraphNode node) {
        Stack<GraphNode> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            GraphNode current = stack.pop();

            if (!current.visited) {
                current.visited = true;
                System.out.print(current.value + " ");

                Collections.reverse(current.neighbours);
                current.neighbours.forEach(stack::push);
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

        System.out.println("\noriginal.DFS ");
        printDFS(node2);
    }
}
