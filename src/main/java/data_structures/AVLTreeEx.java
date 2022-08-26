package data_structures;

import java.util.List;

public class AVLTreeEx {
    static int height(AVLTreeNode node) {
        return node == null ? 0 : node.height;
    }

    static int balance(AVLTreeNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    static AVLTreeNode rotateLeft(AVLTreeNode a) {
        AVLTreeNode b = a.right;
        AVLTreeNode c = b.left;

        b.left = a;
        a.right = c;

        a.height = Math.max(height(a.left), height(a.right)) + 1;
        b.height = Math.max(height(b.left), height(b.right)) + 1;

        return b;
    }

    static AVLTreeNode rotateRight(AVLTreeNode b) {
        AVLTreeNode a = b.left;
        AVLTreeNode c = a.right;

        a.right = b;
        b.left = c;

        b.height = Math.max(height(b.left), height(b.right)) + 1;
        a.height = Math.max(height(a.left), height(a.right)) + 1;

        return a;
    }

    static AVLTreeNode insert(AVLTreeNode node, int value) {
        if (node == null) {
            return new AVLTreeNode(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        else {
            return node;
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = balance(node);

        if (balance > 1) {
            // left left
            if (value < node.left.value) {
                return rotateRight(node);
            }

            // left right
            if (value > node.left.value) {
                node.left = rotateLeft(node.left);
                return rotateRight(node);
            }
        }

        if (balance < -1) {
            // right left
            if (value < node.right.value) {
                node.right = rotateRight(node.right);
                return rotateLeft(node);
            }

            // right right
            if (value > node.right.value) {
                return rotateLeft(node);
            }
        }

        return node;
    }

    static void printInorder(AVLTreeNode node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.value + " ");
        printInorder(node.right);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 6, 4, 3, 7);
        AVLTreeNode root = null;

        for (int x : list) {
            root = insert(root, x);
        }

        printInorder(root);
    }
}
