/*
* Write a method trim that could be added to the IntTree class. The method accepts minimum 
* and maximum integers as parameters and removes from the tree any elements that are not 
* within that range, inclusive. For this method you should assume that your tree is a 
* binary search tree (BST) and that its elements are in valid BST order. Your method should 
* maintain the BST ordering property of the tree. 
*/

public void trim(int min, int max) {
    overallRoot = trim(overallRoot, min, max);
}

public IntTreeNode trim(IntTreeNode root, int min, int max) {
    if (root == null) {
        return null;
    } else if (root.data < min) {
        return trim(root.right, min, max);
    } else if (root.data > max) {
        return trim(root.left, min, max);
    } else {
        root.left  = trim(root.left, min, max);
        root.right = trim(root.right, min, max);
        return root;
    }
}
