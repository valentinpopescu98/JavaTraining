package algorithms.search.binary_tree;

import data_structures.BinaryTreeNode;

public class BFSBinaryTree {
    static int height(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }

        return Math.max(height(node.left), height(node.right)) + 1;
    }

    static void processLevel(BinaryTreeNode node, int l) {
        if (node == null)
            return;
        if (l == 0) {
            System.out.print(node.value + " ");
        }
        else if (l > 0) {
            processLevel(node.left, l - 1);
            processLevel(node.right, l - 1);
        }
    }

    public static void printBFS(BinaryTreeNode node) {
        int h = height(node);

        for (int l = 0; l < h; l++) {
            processLevel(node, l);
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
