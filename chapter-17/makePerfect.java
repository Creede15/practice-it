/*
* Write a method makePerfect that could be added to the IntTree class. The method should 
* add nodes until the binary tree is a "perfect" tree. A perfect binary tree is one where 
* all leaves are at the same level. Another way of thinking of it is that you are adding 
* dummy nodes to the tree until every path from the root to a leaf is the same length. A 
* perfect tree's shape is exactly triangular and every branch node has exactly two children. 
* Each node you add to the tree should store the value 0. 
*/

public void makePerfect() {
    overallRoot = makePerfect(overallRoot, height());
}

public IntTreeNode makePerfect(IntTreeNode root, int height) {
    if (root == null) {
        root = new IntTreeNode(0);
    } 
    if (height == 0) {
        return null;
    } else {
        root.left = makePerfect(root.left, height - 1);
        root.right = makePerfect(root.right, height - 1);
        return root;
    }
}

// LEAVE THESE METHODS HERE, TO USE AS HELPERS
public int height() {
    return height(overallRoot);
}

private int height(IntTreeNode root) {
    if (root == null) {
        return 0;
    } else {
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
