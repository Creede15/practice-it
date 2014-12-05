/*
* Write a method combineWith that could be added to the IntTree class. The method accepts 
* another binary tree of integers as a parameter and combines the two trees into a new 
* third tree which is returned. The new tree's structure should be a union of the structures 
* of the two original trees. It should have a node in any location where there was a 
* node in either of the original trees (or both). The nodes of the new tree should store 
* an integer indicating which of the original trees had a node at that position (1 if 
* just the first tree had the node, 2 if just the second tree had the node, 3 if both trees 
* had the node). 
*/

public IntTree combineWith(IntTree t2) {
    IntTree t3 = new IntTree();
    t3.overallRoot = combineWith(overallRoot, t2.overallRoot);
    return t3;
}

private IntTreeNode combineWith(IntTreeNode root1, IntTreeNode root2) {
    if (root1 == null && root2 == null) {
        return null;
    } else if (root1 == null && root2 != null) {
        IntTreeNode node = new IntTreeNode(2);
        node.left = combineWith(null, root2.left);
        node.right = combineWith(null, root2.right);
        return node;
    } else if (root1 != null && root2 == null) {
        IntTreeNode node = new IntTreeNode(1);
        node.left = combineWith(root1.left, null);
        node.right = combineWith(root1.right, null);
        return node;
    } else {
        IntTreeNode node = new IntTreeNode(3);
        node.left = combineWith(root1.left, root2.left);
        node.right = combineWith(root1.right, root2.right);
        return node;
    }
}
