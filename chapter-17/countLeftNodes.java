/*
* Write a method countLeftNodes that returns the number of left children 
* in the tree. A left child is a node that appears as the root of the 
* left-hand subtree of another node. An empty tree has 0 left nodes.
*/

public int countLeftNodes() {
    return countLeftNodes(overallRoot);
}

public int countLeftNodes(IntTreeNode root) {
    if (root == null) {
        return 0;
    } else if (root.left != null) {
        return 1 + countLeftNodes(root.left) + countLeftNodes(root.right);
    } else {
        return countLeftNodes(root.right);
    }  
}
