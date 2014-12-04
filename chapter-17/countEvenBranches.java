/*
* Write a method countEvenBranches that returns the number of branch nodes in a
* binary tree that contain even numbers. A branch node is one that has one or 
* two children (i.e., not a leaf node). An empty tree has 0 even branches.
*/

public int countEvenBranches() {
    return countEvenBranches(overallRoot);
}

public int countEvenBranches(IntTreeNode root) {
    if (root == null) {
        return 0;
    } else if (root.left == null && root.right == null) {
        return 0;
    } else {
    
        if (root.data % 2 == 0) {
            return 1 + countEvenBranches(root.left) + countEvenBranches(root.right);
        } else {
            return countEvenBranches(root.left) + countEvenBranches(root.right);
        }  
        
    }
}
