package algorithms.search.n_ary_tree;

import data_structures.NaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFSNaryTree {
    public static void printBFS(NaryTreeNode node) {
        Queue<NaryTreeNode> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            NaryTreeNode current = queue.poll();

            System.out.print(current.value + " ");

            queue.addAll(current.children);
        }
    }

    public static void main(String[] args) {
        NaryTreeNode root = new NaryTreeNode(1);
        root.children.add(new NaryTreeNode(2));
        root.children.add(new NaryTreeNode(3));
        root.children.add(new NaryTreeNode(4));
        root.children.get(0).children.add(new NaryTreeNode(5));
        root.children.get(0).children.add(new NaryTreeNode(6));
        root.children.get(0).children.add(new NaryTreeNode(7));

        System.out.println("\noriginal.BFS ");
        printBFS(root);
    }
}
