package data_structures;

public class AVLTreeNode extends BinaryTreeNode {
    int height;
    AVLTreeNode left, right;

    public AVLTreeNode(int value) {
        super(value);
        height = 1;
    }
}
