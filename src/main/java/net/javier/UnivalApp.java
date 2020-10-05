package net.javier;

/**
 * Hello world!
 */
public class UnivalApp {
    public static void main(String[] args) {

        System.out.println("Starting");

        TreeNode trdLeft = new TreeNode(null, null, 5);
        TreeNode trdRight = new TreeNode(null, null, 5);

        TreeNode sndLeft = new TreeNode(trdLeft, trdRight, 5);
        TreeNode sndRight = new TreeNode(null, null, 0);

        TreeNode firstLeft = new TreeNode(null, null, 5);
        TreeNode firstRight = new TreeNode(sndLeft, sndRight, 0);

        TreeNode root = new TreeNode(firstLeft, firstRight, 5);

        UnivalTreeCount utc = UnivalTreeFunction(root);
        System.out.println("Result: " + Integer.toString(utc.getCount()));

    }

    public static UnivalTreeCount UnivalTreeFunction(TreeNode node) {
        if(node == null) {
            return new UnivalTreeCount(true, 0);
        }

        if(node.getNodeLeft() == null && node.getNodeRight() == null) {
            return new UnivalTreeCount(true, 1);
        }

        //get the count of unival trees in left subtree and also, whether the left subtree is a unival or not
        UnivalTreeCount leftTreeCount = UnivalTreeFunction(node.getNodeLeft());
        //get the count of unival trees in right subtree and also, whether the right subtree is a unival or not
        UnivalTreeCount rightTreeCount = UnivalTreeFunction(node.getNodeRight());

        //if the left subtree is unival and the right subtree is unival, then need to compare node's value along with immediate left and right child
        if(leftTreeCount.isUnival && rightTreeCount.isUnival
                && (node.getNodeLeft()==null || node.getNodeRight().getValue()==node.getValue()) && (node.getNodeRight()==null || node.getNodeRight().getValue()==node.getValue())) {
    /* if the node's left value(if present) and node's right value(if present) is equal to node value then the node is also a unival,
    hence adding 1 and sending isUnival flag as true */
            return new UnivalTreeCount(true, leftTreeCount.count + rightTreeCount.count + 1);
        }
        return new UnivalTreeCount(false, leftTreeCount.count + rightTreeCount.count);
    }


}
