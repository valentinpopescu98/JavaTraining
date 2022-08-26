package algorithms.search.n_ary_tree;

import data_structures.NaryTreeNode;

public class DFSNaryTree {
    public static void printPreorder(NaryTreeNode node) {
        if (node == null)
            return;

        System.out.print(node.value + " ");
        for (NaryTreeNode n : node.children) {
            printPreorder(n);
        }
    }

    public static void printPostorder(NaryTreeNode node) {
        if (node == null)
            return;

        for (NaryTreeNode n : node.children) {
            printPostorder(n);
        }
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        NaryTreeNode root = new NaryTreeNode(1);
        root.children.add(new NaryTreeNode(2));
        root.children.add(new NaryTreeNode(3));
        root.children.add(new NaryTreeNode(4));
        root.children.get(0).children.add(new NaryTreeNode(5));
        root.children.get(0).children.add(new NaryTreeNode(6));
        root.children.get(0).children.add(new NaryTreeNode(7));

        System.out.println("\nPreorder original.DFS ");
        printPreorder(root);

        System.out.println("\nPostorder original.DFS ");
        printPostorder(root);
    }
}
