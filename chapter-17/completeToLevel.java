/*
* Write a method completeToLevel that accepts an integer n as a parameter and that adds 
* nodes to a tree so that the first n levels are complete. A level is complete if every 
* possible node at that level is not null. We will use the convention that the overall root 
* is at level 1, it's children are at level 2, and so on. You should preserve any existing 
* nodes in the tree. Any new nodes added to the tree should have -1 as their data. 
*/

public void completeToLevel(int level) {
    if (level < 1) {
        throw new IllegalArgumentException();
    } else {
        overallRoot = completeToLevel(overallRoot, level);
    }
}

public IntTreeNode completeToLevel(IntTreeNode root, int level) {
    if (root == null) {
        root = new IntTreeNode(-1);
    }
    
    if (level == 1) {
        return root;
    } 
    root.left = completeToLevel(root.left, level - 1);
    root.right = completeToLevel(root.right, level - 1);
    return root;
}
