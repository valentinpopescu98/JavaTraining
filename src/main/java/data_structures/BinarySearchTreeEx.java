package data_structures;

import algorithms.search.binary_tree.DFSBinaryTree;

import java.util.List;

public class BinarySearchTreeEx {
    static BinaryTreeNode insert(BinaryTreeNode node, int value) {
        if (node == null) {
            return new BinaryTreeNode(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        return node;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 6, 4, 3, 7);
        BinaryTreeNode root = null;

        for (int x : list) {
            root = insert(root, x);
        }

        DFSBinaryTree.printPreorder(root);
    }
}
