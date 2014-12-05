/*
* Write a method doublePositives that doubles all data values greater than 0 in a binary tree of integers. 
*/

public void doublePositives() {
    doublePositives(overallRoot);
}

public void doublePositives(IntTreeNode root) {
    if (root != null) {
        int num = root.data;
        if (num > 0) {
            root.data = 2 * num;
        }
        doublePositives(root.left);
        doublePositives(root.right);
    }
}
