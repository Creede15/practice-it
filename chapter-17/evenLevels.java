/* 
* Write a method evenLevels that could be added to the IntTree class from lecture 
* and section. The method should make sure that all branches end on an even level. 
* If a leaf node is on an odd level it should be removed from the tree. We will 
* define the root as being on level 1. 
*/

public void evenLevels() {
    overallRoot = evenLevels(overallRoot, 1);
}

private IntTreeNode evenLevels(IntTreeNode root, int level) {
    if (root == null) {
        return null;
    } else if (level % 2 == 1 && (root.left == null && root.right == null)) {
        return null;
    } else {
        root.left = evenLevels(root.left, level + 1);
        root.right = evenLevels(root.right, level + 1);
        return root;
    }
}
