/*
* Write a method inOrderList that could be added to the IntTree class. The method 
* returns a list containing the sequence of values obtained from an in-order traversal
* of your binary tree of integers. 
*/

public List inOrderList() {
    return inOrderList(overallRoot, new LinkedList<Integer>());
}

private List inOrderList(IntTreeNode root, List<Integer> list) {
    if (root == null) {
        return list;
    } else {
        inOrderList(root.left, list);
        list.add(root.data);
        inOrderList(root.right, list);
        return list;
    }
}
