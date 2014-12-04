/*
* Write a method toString2 for a binary tree of integers. (On your section handout the 
* method is called toString, but Practice-It needs you to call your method toString2 because 
* toString is already used for another purpose.) The method should return "empty" for 
* an empty tree. For a leaf node, it should return the data in the node as a String. For 
* a branch node, it should return a parenthesized String that has three elements separated by 
* commas: 
* 
*     1. The data at the root.
*     2. A String representation of the left subtree.
*     3. A String representation of the right subtree.
*/

public String toString2() {
    return toString2(overallRoot);
}

public String toString2(IntTreeNode root) {
    if (root == null) {
        return "empty";
    } else if (root.left == null && root.right == null) {
        return "" + root.data;
    } else {
        return "(" + root.data + ", " + toString2(root.left) + ", " + toString2(root.right) + ")";
    }
}
