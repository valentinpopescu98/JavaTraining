package algorithms.search.binary_tree;

import data_structures.BinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFSBinaryTree {
    public static void printBFS(BinaryTreeNode node) {
        Queue<BinaryTreeNode> queue = new ArrayDeque<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            BinaryTreeNode current = queue.poll();

            System.out.print(current.value + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);

        System.out.println("\noriginal.BFS ");
        printBFS(root);
    }
}
