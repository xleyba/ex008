package net.javier;

public class TreeNode {

    private TreeNode nodeLeft;

    private TreeNode nodeRight;

    private int value;


    public TreeNode(TreeNode nodeLeft, TreeNode nodeRight, int value) {
        this.nodeLeft = nodeLeft;
        this.nodeRight = nodeRight;
        this.value = value;
    }

    public TreeNode getNodeLeft() {
        return nodeLeft;
    }

    public void setNodeLeft(TreeNode nodeLeft) {
        this.nodeLeft = nodeLeft;
    }

    public TreeNode getNodeRight() {
        return nodeRight;
    }

    public void setNodeRight(TreeNode nodeRight) {
        this.nodeRight = nodeRight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
