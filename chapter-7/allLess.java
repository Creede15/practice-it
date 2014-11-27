/*
* Write a method called allLess that accepts two arrays of integers and returns true if 
* each element in the first array is less than the element at the same index in the second 
* array. Your method should return false if the arrays are not the same length. 
*/

public static boolean allLess(int[] a, int[] b) {
    if (a.length != b.length) {
        return false;
    } else {
    
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= b[i]) {
                return false;
            }
        }
        
    }
    return true;
}
