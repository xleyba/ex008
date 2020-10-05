package net.javier;

public class TreeNode {

    private TreeNode left;

    private TreeNode right;

    private int value;


    public TreeNode(TreeNode nodeLeft, TreeNode nodeRight, int value) {
        this.left = nodeLeft;
        this.right = nodeRight;
        this.value = value;
    }

    public TreeNode getNodeLeft() {
        return left;
    }

    public void setNodeLeft(TreeNode nodeLeft) {
        this.left = nodeLeft;
    }

    public TreeNode getNodeRight() {
        return right;
    }

    public void setNodeRight(TreeNode nodeRight) {
        this.right = nodeRight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
