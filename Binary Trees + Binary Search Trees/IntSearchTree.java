public class IntSearchTree {
    // This should be your only field
    private IntTreeNode root; // the root node of the tree

    // TODO: add your trim method here

    /////////////////////////////////////////////
    // DON'T CHANGE ANYTHING BELOW THIS POINT!!
    //
    // You're welcome to review this code to see
    // what it does, but don't change anything.
    /////////////////////////////////////////////

    // USED BY TESTS, DON'T CHANGE
    // This method adds a new value to the BST
    public void add(int value) {
        root = add(root, value);
    }

    // USED BY TESTS, DON'T CHANGE
    // Recursive helper method for add method (uses x = change(x) pattern)
    private IntTreeNode add(IntTreeNode node, int value) {
        if (node == null) {
            node = new IntTreeNode(value);
        } else if (value <= node.data) {
            node.left = add(node.left, value);
        } else { // if (value > node.data)
            node.right = add(node.right, value);
        }

        return node;
    }

    // USED BY TESTS, DON'T CHANGE
    // Tests whether two BSTs are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        IntSearchTree tree = (IntSearchTree) obj;
        return equals(this.root, tree.root);
    }

    // USED BY TESTS, DON'T CHANGE
    // Recursive helper method for equals method
    private boolean equals(IntTreeNode first, IntTreeNode second) {
        if (first == null && second == null) {
            return true;
        } else if (first == null || second == null || first.data != second.data) {
            return false;
        } else {
            return equals(first.left, second.left) && equals(first.right, second.right);
        }
    }

    // USED BY TESTS, DON'T CHANGE
    // Returns a string representation of this BST
    @Override
    public String toString() {
        return toString(root);
    }

    // USED BY TESTS, DON'T CHANGE
    // Recursive helper method for toString method
    private String toString(IntTreeNode node) {
        if (node == null) {
            return "empty";
        } else if (node.left == null && node.right == null) {
            return Integer.toString(node.data);
        } else {
            return String.format("(%d, %s, %s)", node.data, toString(node.left), toString(node.right));
        }
    }

    public void trim(int min, int max) {
        this.root = trim(this.root, min, max);
    }

    private IntTreeNode trim(IntTreeNode node, int min, int max) {
        if (node == null) {   
            return null;  
        }else if(node.data >= min && node.data <= max) {
            node.left = trim(node.left, min, max);
            node.right = trim(node.right, min, max);
        } else if (min >= node.data) {
            node = trim(node.right, min, max);
        } else { // if (value > node.data)
            node = trim(node.left, min, max);
        }
        return node;
    }
}
