/*
* Write a method named longestSortedSequence that accepts an array of integers as a 
* parameter and that returns the length of the longest sorted (nondecreasing) sequence of 
* integers in the array. 
*/

public static int longestSortedSequence(int[] array) {
    if (array.length == 0) {
        return 0;
    } else {
        int count = 1;
        int longest = 1;
        
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                count++;
                if (count > longest) {
                    longest = count;
                }
            } else {
                count = 1;
            }
        }
        
        return longest;
    }
}
