/*
* Write a method equals that could be added to the IntTree class. The method accepts another 
* binary tree of integers as a parameter and compares the two trees to see if they are 
* equal to each other. 
*/

public boolean equals2(IntTree tree) {
    return equals2(overallRoot, tree.overallRoot);
}

public boolean equals2(IntTreeNode node1, IntTreeNode node2) {
    if (node1 == null && node2 == null) {
        return true;
    } else if (node1.data != node2.data) {
        return false;
    } else {
        return equals2(node1.left, node2.left) && equals(node1.right, node2.right);
    }
}
