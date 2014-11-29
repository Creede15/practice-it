/*
* Write a method called interleave that accepts two ArrayLists of integers a1 and a2 
* as parameters and inserts the elements of a2 into a1 at alternating indexes. If the 
* lists are of unequal length, the remaining elements of the longer list are left at 
* the end of a1. 
*/

public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    int times = Math.min(a1.size(), a2.size());
    int i;
    
    for (i = 0; i < times; i++) {
        int num = a2.get(i);
        a1.add(2 * i + 1, num);
    }
    
    if (i < a2.size()) {
        for (int j = i; j < a2.size(); j++) {
            a1.add(a2.get(j));
        }
    }
}
