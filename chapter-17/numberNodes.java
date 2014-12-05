/*
* Write a method numberNodes that changes the data stored in a binary tree, assigning 
* sequential integers starting with 1 to each node so that a pre-order traversal will 
* produce the numbers in order(1, 2, 3, etc.).
*/

public int numberNodes() {
    return numberNodes(overallRoot, 1);
}

public int numberNodes(IntTreeNode root, int num) {
    if (root == null) {
        return 0;
    } else {
        root.data = num;
        int countLeft = numberNodes(root.left, num + 1);
        int countRight = numberNodes(root.right, num + countLeft + 1);
        return 1 + countLeft + countRight;
    }
}
