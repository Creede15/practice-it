/*
* Write a method isPairwiseSorted that returns whether or not a list of integers 
* is pairwise sorted (true if it is, false otherwise). A list is considered pairwise
* sorted if each successive pair of numbers is in sorted (non-decreasing) order.
*/

public boolean isPairwiseSorted() {
    int runs = size / 2;
    for (int i = 0; i < runs; i++) {
        if (elementData[2 * i] > elementData[2 * i + 1]) {
            return false;
        }
    }
    return true;
}
