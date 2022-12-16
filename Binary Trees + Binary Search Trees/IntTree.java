public class IntTree {
    // This should be your only field
    private IntTreeNode root; // the root node of the tree

    // TODO: add your size and depthSum methods here

    /////////////////////////////////////////////
    // DON'T CHANGE ANYTHING BELOW THIS POINT!!
    //
    // You're welcome to review this code to see
    // what it does, but don't change anything.
    /////////////////////////////////////////////

    // USED BY TESTS, DON'T CHANGE
    // This method adds a new value to the BST
    public void add(int i, int value) {
        root = add(root, value, i, 1);
    }

    // USED BY TESTS, DON'T CHANGE
    // Recursive helper method for add method (uses x = change(x) pattern)
    private IntTreeNode add(IntTreeNode node, int value, int i, int current) {
        if (i == current) {
            node = new IntTreeNode(value);
        } else if (node == null) {
            return node;
        } else {
            node.left = add(node.left, value, i, current * 2);
            node.right = add(node.right, value, i, current * 2 + 1);
        }

        return node;
    }

    public int size() {
        return size(this.root);
    }

    private int size(IntTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + size(node.left) + size(node.right);
        }
    }

    public int depthSum() {
        return depthSum(this.root, 1);
    }

    private int depthSum(IntTreeNode node, int depth) {
        if (node != null) {
            int sum = node.data * depth;
            int leftSum = depthSum(node.left, depth + 1);
            int rightSum = depthSum(node.right, depth + 1);
            return leftSum + sum + rightSum;
        } else {
            return 0;
        }
    }
}
