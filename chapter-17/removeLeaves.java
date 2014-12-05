/*
* Write a method removeLeaves that removes the leaves from a tree. If your method 
* is called on an empty tree, the method does not change the tree because there are 
* no nodes of any kind (leaf or not). 
*/

public void removeLeaves() {
    overallRoot = removeLeaves(overallRoot);
}

public IntTreeNode removeLeaves(IntTreeNode root) {
    if (root == null || (root.left == null && root.right == null)) {
        return null;
    } else {
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }
}
