package algorithms.search.n_ary_tree;

import data_structures.NaryTreeNode;

import java.util.Collections;
import java.util.stream.Collectors;

public class BFSNaryTree {
    static int height(NaryTreeNode node) {
        if (node == null) {
            return 0;
        }

        return Collections.max(
                node.children
                        .stream()
                        .map(naryTreeNode -> naryTreeNode.value)
                        .collect(Collectors.toList())
        );
    }

    static void processLevel(NaryTreeNode node, int l) {
        if (node == null)
            return;
        if (l == 0) {
            System.out.print(node.value + " ");
        }
        else if (l > 0) {
            for (NaryTreeNode n : node.children) {
                processLevel(n, l - 1);
            }
        }
    }

    public static void printBFS(NaryTreeNode node) {
        int h = height(node);

        for (int l = 0; l < h; l++) {
            processLevel(node, l);
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
