/*
* Write a method printLevel that accepts an integer parameter n and that prints
* the values at level n from the left to right, one per line. We will use the 
* convention that the overallRoot is at level 1, that its children are at level 
* 2, and so on.
*/

public void printLevel(int level) {
    if (level <= 0) {
        throw new IllegalArgumentException();
    } else {
        printLevel(overallRoot, level, 1);
    }
}

public void printLevel(IntTreeNode root, int level, int depth) {
    if (root != null) {
    
        if (level == depth) {
            System.out.println(root.data);
        } else if (level > depth) {
            printLevel(root.left, level, depth + 1);
            printLevel(root.right, level, depth + 1);
        }
        
    }
}
