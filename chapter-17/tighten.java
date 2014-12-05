/*
* Write a method tighten that eliminates branch nodes that have only one child. 
*/

public void tighten() {
    overallRoot = tighten(overallRoot);
}

private IntTreeNode tighten(IntTreeNode root) {
    if (root == null) {
        return null;
    } else if (root.left == null && root.right != null) {
        return tighten(root.right);
    } else if (root.left != null && root.right == null) {
        return tighten(root.left);
    } else {
        root.left = tighten(root.left);
        root.right = tighten(root.right);
        return root;
    }
}
