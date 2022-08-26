package algorithms.search.binary_tree;

import data_structures.BinaryTreeNode;

public class DFSBinaryTree {
    public static void printPreorder(BinaryTreeNode node) {
        if (node == null)
            return;

        System.out.print(node.value + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void printInorder(BinaryTreeNode node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.value + " ");
        printInorder(node.right);
    }

    public static void printPostorder(BinaryTreeNode node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        root.left = new BinaryTreeNode(2);
        root.right = new BinaryTreeNode(3);
        root.left.left = new BinaryTreeNode(4);
        root.left.right = new BinaryTreeNode(5);

        System.out.println("\nPreorder original.DFS ");
        printPreorder(root);

        System.out.println("\nInorder original.DFS ");
        printInorder(root);

        System.out.println("\nPostorder original.DFS ");
        printPostorder(root);
    }
}
